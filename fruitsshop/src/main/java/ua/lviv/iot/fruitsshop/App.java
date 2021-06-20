package ua.lviv.iot.fruitsshop;

import ua.lviv.iot.fruitsshop.managers.FruitManager;
import ua.lviv.iot.fruitsshop.managers.FruitWriter;
import ua.lviv.iot.fruitsshop.models.Colors;
import ua.lviv.iot.fruitsshop.models.Kinds;
import ua.lviv.iot.fruitsshop.models.Order;
import ua.lviv.iot.fruitsshop.models.Pear;
import ua.lviv.iot.fruitsshop.models.Pears;
import ua.lviv.iot.fruitsshop.models.Seasons;
import ua.lviv.iot.fruitsshop.models.Fruit;

import java.io.IOException;

public class App {
	public static void main(final String[] args) throws IOException {
		FruitWriter ATBWriter= new FruitWriter();
		FruitManager ATB = new FruitManager();

		ATB.addFruit(Pear.pearBuilder().name("Pear").season(Seasons.SPRING).color(Colors.GREEN).price(15.50)
				.fruitKind(Kinds.FRUIT).kind(Pears.TASTYPEAR).build());
		
		ATB.addFruit(Pear.pearBuilder().name("PeachyPear").season(Seasons.SPRING).color(Colors.YELLOW).price(18.69)
				.fruitKind(Kinds.FRUIT).kind(Pears.KINGPEAR).build());
		
		ATB.addFruit(Fruit.builder().name("Banana").season(Seasons.WINTER).color(Colors.YELLOW).price(29.99)
				.fruitKind(Kinds.TROPICAL).build());

		ATB.addFruit(Fruit.builder().name("WATERMELON").season(Seasons.SUMMER).color(Colors.GREEN).price(9.99)
				.fruitKind(Kinds.TROPICAL).build());
		
		ATB.addFruit(Fruit.builder().name("KingGrapes").season(Seasons.SUMMER).color(Colors.GREEN).price(69.42)
				.fruitKind(Kinds.BERRY).build());
		
		ATB.addFruit(Fruit.builder().name("MELON").season(Seasons.SUMMER).color(Colors.YELLOW).price(15.99)
				.fruitKind(Kinds.TROPICAL).build());
		System.out.println("      UNORDERED UNMODIFIED LIST");
		System.out.println(ATB.getFruits());
		System.out.println("      RIPE SUMMER FRUITS");
		System.out.println(ATB.isRipe(Seasons.SUMMER, Order.DESC));
		System.out.println("      WHAT YOU CAN AFFORD FOR 16$");
		System.out.println(ATB.isAffordable(16.0, Order.DESC));
		ATBWriter.writeToFile(ATB.getFruits());
	}
}
