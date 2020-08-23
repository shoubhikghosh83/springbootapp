package com.tcs.devops.springbootapp;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import com.tcs.devops.springbootapp.service.Service;

@SpringBootTest
class SpringBootAppApplicationTests {

	
	
	@Test
	public void getEmpByIdTest()
	{
		assertEquals("P1",new Service().getProductById("P1").getProductId());
	}
	@Test
	public void getProductByNameTest()
	{
		assertEquals("P1",new Service().getProductByName("Product1").getProductId());
	}
	@Test
	public void getProductOfPG1Test()
	{
		assertEquals("P1",new Service().getProductOfPG1().get(0));
	}
	@Test
	public void getProductOfPG2Test()
	{
		assertEquals("P3",new Service().getProductOfPG2().get(0));
	}
	@Test
	public void getProductOfPC1Test()
	{
		assertEquals("P1",new Service().getProductOfPC1().get(0));
	}
	@Test
	public void getProductOfPC2Test()
	{
		assertEquals("P3",new Service().getProductOfPC2().get(0));
	}
	@Test
	public void getProductBelow100Test()
	{
		assertEquals("P1",new Service().getProductBelow100().get(0));
	}
	@Test
	public void getProductAbove100Test()
	{
		assertEquals("P2",new Service().getProductAbove100().get(0));
	}
	@Test
	public void getProductBelow200Test()
	{
		assertEquals("P1",new Service().getProductBelow200().get(0));
	}
	@Test
	public void getProductAbove200Test()
	{
		assertEquals("P3",new Service().getProductAbove200().get(0));
	}
}
