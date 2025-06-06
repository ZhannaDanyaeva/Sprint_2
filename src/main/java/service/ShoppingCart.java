package service;

import model.Food;

public class ShoppingCart {
    private final Food[] items;

    public ShoppingCart(Food[] items) {
        this.items = items;
    }

    public double totalPrice() {
        double price = 0;

        for (Food item : items) {
            price += item.totalPrice();
        }
        return price;
    }

    public double discountPrice() {
        double price = 0;

        for (Food item : items) {
            price += item.discountPrice();
        }
        return price;
    }


    public double vegPrice() {
        double price = 0;

        for (Food item : items) {
            if (item.isVegetarian()) {
                price += item.totalPrice();
            }
        }
            return price;

    }
}

