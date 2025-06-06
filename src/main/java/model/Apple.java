package model;

import model.constants.Colour;
import model.constants.Discount;

import java.util.Objects;

public class Apple  extends Food {
    private String colour;
    public Apple(double price, int amount, String colour) {
        super(amount, price, true);
        this.colour = colour;
    }

    @Override
    public int getDiscount() {
        if (Colour.RED.equals(colour)) {
            return Discount.RED;
        } else {
            return Discount.DEFAULT;
        }
    }
}
