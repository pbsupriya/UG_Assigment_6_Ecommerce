package com.ecommerce.onlineorder.services;

import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;

import com.ecommerce.onlineorder.database.EcommerceReopository;
import com.ecommerce.onlineorder.model.Order;
import org.springframework.stereotype.Service;

@Service
public class EcommerceService {

	@Autowired
	EcommerceReopository ecommerceReopository;
	
	public void saveOrderDetails(@Valid Order order) {
		ecommerceReopository.save(order);
	}

	public Optional<Order> getOrderDetails(@Valid String orderId) {
		return ecommerceReopository.findById(orderId);
	}

	public Order updateOrder(@Valid Order order) {
		// TODO Auto-generated method stub
		return ecommerceReopository.save(order);
	}

	public void deleteOrderDetails(@Valid String orderId) {
		ecommerceReopository.deleteById(orderId);
	}

}
