package ua.lviv.iot.fruitsshop.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import ua.lviv.iot.fruitsshop.models.Fruit;
import ua.lviv.iot.fruitsshop.service.FruitService;

@RestController
@RequestMapping(path = "/fruit")
public class FruitController {

	@Autowired
	private FruitService fruitService;

	@GetMapping(path = "/{id}")
	public ResponseEntity<Fruit> getFruit(@PathVariable Integer id) {
		if (fruitService.getFruit(id) != null) {
			return new ResponseEntity<>(fruitService.getFruit(id), HttpStatus.OK);
		} else {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
	}

	@GetMapping
	public ResponseEntity<List<Fruit>> getFruits() {
		return new ResponseEntity<>(fruitService.getFruits(), HttpStatus.OK);
	}

	@PostMapping
	public ResponseEntity<Fruit> createFruit(@RequestBody Fruit fruit) {
		return new ResponseEntity<>(fruitService.addFruit(fruit), HttpStatus.CREATED);
	}

	@PutMapping(path = "/{id}")
	public ResponseEntity<Fruit> updateFruit(@PathVariable Integer id, @RequestBody Fruit fruit) {
		if (fruitService.getFruit(id) != null) {
			return new ResponseEntity<Fruit>(fruitService.updateFruit(fruit, id), HttpStatus.OK);
		} else {
			return new ResponseEntity<Fruit>(HttpStatus.NOT_FOUND);
		}
	}

	@DeleteMapping(path = "/{id}")
	public ResponseEntity<Fruit> deleteFruit(@PathVariable Integer id, @RequestBody Fruit fruit) {
		if (fruitService.getFruit(id) != null) {
			return new ResponseEntity<>(fruitService.deleteFruit(fruit, id), HttpStatus.OK);
		} else {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
	}
}
