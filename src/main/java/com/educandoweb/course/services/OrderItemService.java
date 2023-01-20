package com.educandoweb.course.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.educandoweb.course.entities.OrderItem;
import com.educandoweb.course.repositories.OrderItemRepository;

@Service
public class OrderItemService {

	@Autowired
	private OrderItemRepository repository;
	
	public List<OrderItem> findAll(){
		return repository.findAll();
	}
	
	public OrderItem findById(Long id) {
		//Uma classe que existe desde o Java 8.
		Optional<OrderItem> obj = repository.findById(id);
		
		//O get vai retornar o tipo do Optional, nesse caso, o OrderItem.
		return obj.get();
	}
}
