package day08.enum_;

public class Main {
    public static void main(String[] args) {
        Pizza pizza = new Pizza();

        pizza.orderPizza();
        pizza.deliverPizza();

        System.out.println("pizza.getStatus() = " + pizza);
    }
}
