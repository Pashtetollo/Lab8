package ua.lviv.iot.fruitsshop.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import ua.lviv.iot.fruitsshop.models.Fruit;

@Repository
public interface FruitRepository extends JpaRepository<Fruit, Integer> {

}