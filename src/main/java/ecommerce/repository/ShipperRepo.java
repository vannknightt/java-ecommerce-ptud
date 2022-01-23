package ecommerce.repository;

import ecommerce.model.*;

import java.util.List;
import java.util.Optional;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ShipperRepo extends MongoRepository<Shipper, String> {
	public Optional<Shipper> findById(String id);
	 List<Shipper> findAll();

}
