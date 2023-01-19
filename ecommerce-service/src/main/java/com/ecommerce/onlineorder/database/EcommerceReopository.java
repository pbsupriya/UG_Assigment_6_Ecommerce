package com.ecommerce.onlineorder.database;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ecommerce.onlineorder.model.Order;

@Repository
public interface EcommerceReopository extends JpaRepository<Order, String> {

	
}
