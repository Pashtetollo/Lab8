package ua.lviv.iot.fruitsshop.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.context.annotation.ApplicationScope;

import ua.lviv.iot.fruitsshop.models.Fruit;
import ua.lviv.iot.fruitsshop.dao.FruitRepository;

@Service
@ApplicationScope
public class FruitService {

	@Autowired
	private FruitRepository repository;

	public Fruit addFruit(Fruit fruit) {
		return repository.save(fruit);
	}

	public Fruit updateFruit(Fruit fruit, Integer id) {
		if (repository.existsById(id)) {
			fruit.setId(id);
			return repository.save(fruit);
		}
		throw new NoSuchElementException("fruit with ID " + fruit.getId() + " NOT FOUND");
	}

	public List<Fruit> getFruits() {
		return repository.findAll();
	}

	public Fruit getFruit(Integer id) {
		if (repository.existsById(id)) {
			return repository.findById(id).get();
		}
		throw new NoSuchElementException("fruit with ID " + id + " NOT FOUND");
	}

	public Fruit deleteFruit(Fruit fruit, Integer id) {
		Fruit deletedFruit = getFruit(id);
		repository.deleteById(id);
		return deletedFruit;
	}
}
