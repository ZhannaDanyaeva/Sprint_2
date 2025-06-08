package praktikum;
import model.Meat;
import model.Apple;
import model.Food;
import model.constants.Colour;
//import model.constants.Discount;
import service.ShoppingCart;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class Main {
    public static void main(String[] args) {
        var meat = new Meat(100, 5);
        var red = new Apple(50, 10, Colour.RED);
        var green = new Apple(60, 8, Colour.GREEN);

        var invalidApple = new Apple(60, 8, null);

        Food[] items = {meat, red, green, invalidApple};
        var cart = new ShoppingCart(items);

        System.out.printf("Общая сумма товаров в корзине без скидки: %.2f%n", cart.totalPrice());
        System.out.printf("Общая сумма товаров в корзине со скидкой: %.2f%n", cart.discountPrice());
        System.out.printf("Сумма всех вегетарианских продуктов в корзине без скидки: %.2f%n", cart.vegPrice());

    }

}
