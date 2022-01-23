package ecommerce.controller;

import ecommerce.repository.*;
import ecommerce.model.*;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Optional;

import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.data.mongodb.core.query.Update;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import org.springframework.data.mongodb.core.MongoTemplate;

@RestController
@RequestMapping("/api")

public class ProductController {
	@Autowired
	ProductRepo repo;
	
	@Autowired
	public MongoTemplate mongoTemplate;
	
	@CrossOrigin(origins = "http://localhost:8081", allowCredentials="true")
	@GetMapping("/products/{id}")
	public ResponseEntity<Optional<Product>> GetProduct(@PathVariable("id") String id) {
		try {
			Optional<Product> product = repo.findById(id);
			if (product.isEmpty()) {
				return new ResponseEntity<>(HttpStatus.NO_CONTENT);
			}
			return new ResponseEntity<>(product, HttpStatus.OK);
		}
		catch (Exception e) {
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	
	@CrossOrigin(origins = "http://localhost:8081", allowCredentials="true")
	@PutMapping("/products/{id}")
	public ResponseEntity<Optional<Product>> AddComment(@PathVariable("id") String id, @RequestBody Comments comment) {
		Optional<Product> product = repo.findById(id);
		if (product.isPresent()) {
			
			SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
			
			Comments newcomments = new Comments(new ObjectId().toString(), comment.getcustomername(), 
					comment.getcustomeravatar(), comment.getcustomercmt(),
					comment.getcustomerrating(), formatter.format(new Date()));
			
			Update update = new Update().push("Comments", newcomments);
			Query query = new Query(Criteria.where("_id").is(id));
			mongoTemplate.updateFirst(query, update, Product.class);
			
			
			product = repo.findById(id);
			return new ResponseEntity<>(product, HttpStatus.OK);
		}
		
		else {
			return new ResponseEntity<>(null, HttpStatus.NOT_FOUND);
		}
		
	}
	
}
