package ecommerce.repository;

import ecommerce.model.*;

import java.util.Optional;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderRepo extends MongoRepository<Order, String> {
	public Optional<Order> findById(String id);
}
