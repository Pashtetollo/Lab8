package ua.lviv.iot.fruitsshop.models;

import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.Builder;

@Data
@Builder
@AllArgsConstructor
public class Fruit {
	protected String name;
	protected Seasons season;
	protected Colors color;
	protected double price;
	protected Kinds fruitKind;
}
