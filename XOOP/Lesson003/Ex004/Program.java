package Ex004;

import Ex004.ExBeverage.*;

// три вода
public class Program {
    public static void main(String[] args) {
        Coffee latte = new Coffee();
        latte.addComponent(new Water("Вода"));
        latte.addComponent(new Milk("Молоко"));
        latte.addComponent(new Вeans("Кофе"));
        for (var ingredient : latte) {
            System.err.println(ingredient);
        }
    }
}
