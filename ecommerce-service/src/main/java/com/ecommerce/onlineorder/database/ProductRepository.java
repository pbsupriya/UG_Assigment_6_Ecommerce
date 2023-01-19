package com.ecommerce.onlineorder.database;

import com.ecommerce.onlineorder.model.Products;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.Optional;

@Repository
@Transactional
public interface ProductRepository extends JpaRepository<Products, Integer> {

	Optional<Products> findByProductName(String productName);

	Optional<Products> findByProductMake(String productMake);

	Optional<Products> findByPrice(float price);

}