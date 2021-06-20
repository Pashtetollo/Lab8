package ua.lviv.iot.fruitsshop.models;

import lombok.Builder;
import lombok.Data;

@Data
public class Pear extends Fruit {
    private Pears kind;

    @Builder(builderMethodName = "pearBuilder")
    public Pear(final String name, final Seasons season, final Colors color,
                final double price, final Kinds fruitKind, final Pears kind) {
        super(name, season, color, price, fruitKind);
        this.kind = kind;
    }

    @Override
    public String toString() {
        return "Pear(" + " name=" + this.name + " season=" + this.season + " color=" + this.color
                + " price=" + this.price + " fruitKind=" + this.fruitKind + " kind=" + this.kind + ")";
    }

    @Override
    public String getHeaders() {
        return super.getHeaders() + "," + this.kind;
    }

    @Override
    public String toCSV() {
        return super.toCSV() + "," + this.kind;
    }
}
