package ua.lviv.iot.fruitsshop.service;


import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collectors;
import org.springframework.stereotype.Service;
import org.springframework.web.context.annotation.ApplicationScope;

import lombok.Getter;
import ua.lviv.iot.fruitsshop.models.Fruit;

@Service
@ApplicationScope
public class FruitService {
	
    static private AtomicInteger id = new AtomicInteger(0);
    @Getter
    private Map<Integer, Fruit> fruitsMap = new HashMap<Integer, Fruit>();

    public Fruit addFruit(Fruit fruit) {
        Integer fruitId = id.incrementAndGet();
        fruit.setId(fruitId);
        fruitsMap.put(fruitId, fruit);
        return fruit;
    }

    public Fruit updateFruit(Fruit fruit) {
        return fruitsMap.put(fruit.getId(), fruit);
    }

    public List<Fruit> getFruits() {
        return fruitsMap.values().stream().collect(Collectors.toList());
    }

    public Fruit getFruit(Integer id) {
        return fruitsMap.get(id);
    }
    public Fruit deleteFruit(Integer id) {
        return fruitsMap.remove(id);
    }
}
