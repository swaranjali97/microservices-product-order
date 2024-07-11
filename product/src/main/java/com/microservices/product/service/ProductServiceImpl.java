package com.microservices.product.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.microservices.product.dao.ProductDao;
import com.microservices.product.dto.ProductRequest;
import com.microservices.product.pojo.Product;

@Service
public class ProductServiceImpl implements ProductService {

	@Autowired
	private ProductDao dao;

	@Override
	public String createProduct(ProductRequest productRequest) {
		Product product=new Product();
		product.setName(productRequest.getName());
		product.setDescription(productRequest.getDescription());
		product.setPrice(productRequest.getPrice());
		
		dao.save(product);
		return "product created";
	}

	@Override
	public List<Product> getAllProducts() {
		return dao.findAll() ;
	}
	
	
}
