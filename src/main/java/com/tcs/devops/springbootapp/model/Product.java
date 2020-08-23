package com.tcs.devops.springbootapp.model;


import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Product {
	
	
	private String productId;
	private String productName;
	private Integer price;
	private String productGroup;
	private String productCategory;

}
