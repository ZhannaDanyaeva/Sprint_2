package model;

import model.constants.Discount;

public abstract class Food implements Discountable {
    protected final int amount;
    protected final double price;
    protected final boolean isVegetarian;

    public Food(int amount, double price, boolean isVegetarian) {
        this.amount = amount;
        this.price = price;
        this.isVegetarian = isVegetarian;
    }


    public double getPrice() {
        return price;
    }

    public double getAmount() {
        return amount;
    }

    public int getDiscount() {
        return Discount.DEFAULT;
    }


    public boolean isVegetarian() {
        return isVegetarian;
    }

    public double totalPrice() {
        return amount * price;
    }

    public double discountPrice() {
        return totalPrice() * (100 - getDiscount()) / 100;
    }
}
