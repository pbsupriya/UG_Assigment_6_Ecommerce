package com.ecommerce.onlineorder.controller;

import java.util.Objects;
import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ecommerce.onlineorder.model.Order;
import com.ecommerce.onlineorder.services.EcommerceService;

@RestController
@RequestMapping("/api/v1")
public class EcommerceController {
	
	@Autowired
	EcommerceService ecommerceService;
	

	@PostMapping("/order")
	public ResponseEntity<String> createOrder(@Valid @RequestBody Order order) {

		try {
			ecommerceService.saveOrderDetails(order);
			return ResponseEntity.status(HttpStatus.CREATED).body("Order Created Successfully");
		} catch (Exception e) {
			return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Order couldn't be added");
		}
	}

	@GetMapping("/order")
	public ResponseEntity<Order> getOrderDetails(@Valid @PathVariable String orderId) {
		try {
			Order order = new Order();
			ecommerceService.getOrderDetails(orderId);

			if (Objects.nonNull(order))
				return new ResponseEntity<>(HttpStatus.NO_CONTENT);

			return new ResponseEntity<>(order, HttpStatus.OK);

		} catch (Exception e) {
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}


	@DeleteMapping("/order")
	public ResponseEntity<String> deleteOrder(@Valid @PathVariable String orderId) {
		try {
			ecommerceService.deleteOrderDetails(orderId);
			return ResponseEntity.status(HttpStatus.NO_CONTENT).body("Order Updated Successfully");

		} catch (Exception e) {
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Order couldn't be updated successfully");
		}
	}

	
	@PutMapping("order")
	public ResponseEntity<Order> getProductById(@Valid @RequestBody Order order) {
		Order orderDetails = ecommerceService.updateOrder(order);
		if (Objects.nonNull(orderDetails)) {
			return new ResponseEntity<Order>(order,HttpStatus.NO_CONTENT);
		} else {
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	
	


}
