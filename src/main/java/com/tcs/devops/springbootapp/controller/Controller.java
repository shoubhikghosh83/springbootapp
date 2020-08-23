package com.tcs.devops.springbootapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.tcs.devops.springbootapp.model.Product;
import com.tcs.devops.springbootapp.service.Service;

@RestController
@RequestMapping("app")
public class Controller {

	private final Service service;
	
	@Autowired
	public Controller(final Service service)
	{
		this.service = service;
	}
	@RequestMapping(value = "/health")
	public String getHealth()
	{
		return "UP";
	}
	
	@RequestMapping(value = "/getProductById/{id}")
	public ResponseEntity<Product> getProductById(@PathVariable String id)
	{
		return ResponseEntity.ok(service.getProductById(id));
	}
}
