package ua.lviv.iot.fruitsshop.managers;

import lombok.AllArgsConstructor;
import lombok.Data;
import ua.lviv.iot.fruitsshop.models.Fruit;
import ua.lviv.iot.fruitsshop.models.Order;
import ua.lviv.iot.fruitsshop.models.Seasons;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.ArrayList;
import java.util.Collections;

@Data
@AllArgsConstructor
public class FruitManager {
	private List<Fruit> fruits;

	public FruitManager() {
		this.fruits = new ArrayList<Fruit>();
	}

	protected void sortFruitsByColor(final List<Fruit> fruitsToSort, final Order order) {
		fruitsToSort.sort(Comparator.comparing(Fruit::getColor));
		if (order.ordinal() == 0) {
			Collections.reverse(fruitsToSort);
		}
	}

	protected void sortFruitsByPrice(final List<Fruit> fruitsToSort,final Order order) {
		fruitsToSort.sort(Comparator.comparing(Fruit::getPrice));
		if (order.ordinal() == 0) {
			Collections.reverse(fruitsToSort);
		}
	}
	
	public List<Fruit> getRipe(final Seasons season,final Order order) {
		List<Fruit> ripeList = fruits.stream().filter(fruit -> fruit.getSeason() == season)
				.collect(Collectors.toList());
		sortFruitsByColor(ripeList, order);
		return ripeList;
	}
	
	public List<Fruit> getAffordable(final double price,final Order order){
		List<Fruit> affordableList = fruits.stream().filter(fruit -> fruit.getPrice() <= price)
				.collect(Collectors.toList());
		sortFruitsByPrice(affordableList, order);
		return affordableList;	
	}

	public void addFruit(final Fruit fruit) {
		this.fruits.add(fruit);
		return;
	}
}
