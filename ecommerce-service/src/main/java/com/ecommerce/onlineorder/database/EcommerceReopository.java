package com.ecommerce.onlineorder.database;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.ecommerce.onlineorder.model.Order;

@Repository
public interface EcommerceReopository extends MongoRepository<Order, String>{

	
}
