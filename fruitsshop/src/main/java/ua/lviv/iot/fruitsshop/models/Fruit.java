package ua.lviv.iot.fruitsshop.models;

import lombok.Data;
import lombok.NonNull;

import javax.persistence.*;

import lombok.AllArgsConstructor;
import lombok.Builder;

@Entity
@Table(name = "fruits")
@Data
@Builder
@AllArgsConstructor
public class Fruit {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private Integer id;
	protected Seasons season;
	protected Colors color;
	protected double price;
	protected Kinds fruitKind;
	@NonNull
	protected String name;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Seasons getSeason() {
		return season;
	}

	public void setSeason(Seasons season) {
		this.season = season;
	}

	public Colors getColor() {
		return color;
	}

	public void setColor(Colors color) {
		this.color = color;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public Kinds getFruitKind() {
		return fruitKind;
	}

	public void setFruitKind(Kinds fruitKind) {
		this.fruitKind = fruitKind;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
