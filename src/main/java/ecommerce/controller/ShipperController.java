package ecommerce.controller;

import ecommerce.repository.*;
import ecommerce.model.*;

import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/api")


public class ShipperController {
	@Autowired 
	ShipperRepo repo;
	
	@CrossOrigin(origins = {"http://localhost:8081", "https://ptud.vercel.app"}, allowCredentials="true")
	@GetMapping("/shipper")
	public ResponseEntity<List<Shipper>> GetShipperList() {
		try {
			List<Shipper> sachlst = new ArrayList<Shipper>();
			repo.findAll().forEach(sachlst::add);
			if (sachlst.isEmpty()) {
				return new ResponseEntity<>(HttpStatus.NO_CONTENT);
			}
			return new ResponseEntity<>(sachlst, HttpStatus.OK);
		}
		catch (Exception e) {
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
}
