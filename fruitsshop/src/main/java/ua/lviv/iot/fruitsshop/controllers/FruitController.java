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
    public ResponseEntity<Fruit> getFruit(@PathVariable(name = "id") Integer id) {
        return new ResponseEntity<>(fruitService.getFruit(id), HttpStatus.OK);
    }

    @GetMapping
    public ResponseEntity<List<Fruit>> getFruits() {
        return new ResponseEntity<>(fruitService.getFruits(), HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<Fruit> createFruit(@RequestBody Fruit fruit) {
    	return new ResponseEntity<>(fruitService.addFruit(fruit), HttpStatus.OK);
    }

    @PutMapping
    public ResponseEntity<Fruit> updateFruit(@RequestBody Fruit fruit) {
        if (fruitService.getFruit(fruit.getId()) != null) {
            return new ResponseEntity<Fruit>(fruitService.updateFruit(fruit), HttpStatus.CREATED);
        } else {
            return new ResponseEntity<Fruit>(HttpStatus.NOT_FOUND);
        }
    }
    @DeleteMapping(path = "/{id}")
    public ResponseEntity<Fruit> deleteFruit(@PathVariable Integer id){
        if (fruitService.getFruitsMap().containsKey(id)) {
            return new ResponseEntity<>(fruitService.deleteFruit(id), HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
}
