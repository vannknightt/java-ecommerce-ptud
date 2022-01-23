package ecommerce.repository;

import ecommerce.model.*;

import java.util.Optional;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepo extends MongoRepository<Product, String> {
	public Optional<Product> findById(String id);
}
