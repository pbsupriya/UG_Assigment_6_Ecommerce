package com.ecommerce.onlineorder.model;

import lombok.Builder;
import lombok.Data;

import javax.persistence.*;

@Builder
@Entity
@Data
@Table(name = "products")
public class Products {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "productId")
	private int productId;

	@Column(name = "productname")
	private String productName;

	@Column(name = "productBrand")
	private String productBrand;

	@Column(name = "productDescription")
	private String productDescription;

	@Column(name = "productSpecifications")
	private int productSpecifications;

	@Column(name = "imageUrl")
	private int imageUrl;

	@Column(name = "quantity")
	private int quantity;

	@Column(name = "price")
	private float price;

	@Column(name = "categoryId")
	private String categoryId;

	@Column(name = "category")
	private String category;

	@Column(name = "offer")
	private String offer;

}
