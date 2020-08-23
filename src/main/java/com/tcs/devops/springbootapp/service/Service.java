package com.tcs.devops.springbootapp.service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import com.tcs.devops.springbootapp.model.Product;

@org.springframework.stereotype.Service
public class Service {
	
	private List<Product> getProducts()
	{
		Product p1 = Product.builder().productId("P1").productName("Product1").productGroup("PG1").productCategory("PC1").price(100).build();
		Product p2 = Product.builder().productId("P2").productName("Product2").productGroup("PG1").productCategory("PC1").price(200).build();
		Product p3 = Product.builder().productId("P3").productName("Product3").productGroup("PG2").productCategory("PC2").price(300).build();
		
		List<Product> allProducts = new ArrayList<Product>();
		allProducts.add(p1);allProducts.add(p2);allProducts.add(p3);
		return allProducts;
	}
	public Product getProductById(String id)
	{
		return getProducts().stream().filter(e -> e.getProductId().equals(id) ).collect(Collectors.toList()).get(0);
	}
	public Product getProductByName(String name)
	{
		return getProducts().stream().filter(e -> e.getProductName().equals(name) ).collect(Collectors.toList()).get(0);
	}
	public List<String> getProductOfPG1()
	{
		return getProducts().stream().filter(e -> e.getProductGroup().equals("PG1")).map(e -> e.getProductId()).collect(Collectors.toList());
	}
	public List<String> getProductOfPG2()
	{
		return getProducts().stream().filter(e -> e.getProductGroup().equals("PG2")).map(e -> e.getProductId()).collect(Collectors.toList());
	}
	public List<String> getProductOfPC1()
	{
		return getProducts().stream().filter(e -> e.getProductCategory().equals("PC1")).map(e -> e.getProductId()).collect(Collectors.toList());
	}
	public List<String> getProductOfPC2()
	{
		return getProducts().stream().filter(e -> e.getProductCategory().equals("PC2")).map(e -> e.getProductId()).collect(Collectors.toList());
	}
	public List<String> getProductBelow100()
	{
		return getProducts().stream().filter(e -> e.getPrice()<= 100).map(e -> e.getProductId()).collect(Collectors.toList());
	}
	public List<String> getProductAbove100()
	{
		return getProducts().stream().filter(e -> e.getPrice()>100).map(e -> e.getProductId()).collect(Collectors.toList());
	}
	public List<String> getProductBelow200()
	{
		return getProducts().stream().filter(e -> e.getPrice()<200).map(e -> e.getProductId()).collect(Collectors.toList());
	}
	public List<String> getProductAbove200()
	{
		return getProducts().stream().filter(e -> e.getPrice()>200).map(e -> e.getProductId()).collect(Collectors.toList());
	}

}
