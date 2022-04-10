package ecommerce.controller;

import ecommerce.repository.*;
import ecommerce.model.*;


import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/api")
public class OrderController {
	
	@Autowired
	OrderRepo repo;
	
	@CrossOrigin(origins = {"http://localhost:8081", "https://client-eccomerce-ptud.vercel.app"}, allowCredentials="true")
	@PutMapping("/order/{id}/{status}")
	public ResponseEntity<Optional<Order>> SetStatus(@PathVariable("id") String id, @PathVariable("status") int status) {
		Optional<Order> order = repo.findById(id);
		if (order.isPresent()) {
			
			Order _order = order.get();
			_order.setstatus(status);
			//_order.setupdated_at(n);
			
			repo.save(_order);
			
			return new ResponseEntity<>(order, HttpStatus.OK);
		}
		else {
			return new ResponseEntity<>(null, HttpStatus.NOT_FOUND);
		}
		
	}
}
