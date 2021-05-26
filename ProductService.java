package com.ust.pms.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ust.pms.model.Product;
import com.ust.pms.repository.ProductRepository;

@Service
public class ProductService {

	@Autowired
	ProductRepository productRepository;

	public List<Product> getProducts(){
		return (List<Product>) productRepository.findAll();
	}
	
	public Product getProduct(Integer productId) {
		Optional<Product> product=productRepository.findById(productId);
		return product.get();
	}
	
	public void saveProduct(Product product) {
		productRepository.save(product);
	}
	
	public void deleteProduct(Integer productId) {
		productRepository.deleteById(productId);
	}
	
	public void updateProduct(Product product) {
		productRepository.save(product);	
	}
	
	public boolean isProductExists(int productId) {
		return productRepository.existsById(productId);
	}

	public List<Product> searchProductByName(String productName) {
		return productRepository.findByProductName(productName);
	}
	public List<Product> filterProductByPrice(int lowerRange,int upperRange) {
		return productRepository.findByPriceBetween(lowerRange,upperRange);
	}
	/*
	 * public List<Product> filterProductByPrice(int lowerRange,int upperRange){
	 * return productRepository.findByPriceBetween(lowerRange,upperRange); }
	 */
	public int addNumbers(int num1,int num2) {
		return num1+num2;
	}
}
