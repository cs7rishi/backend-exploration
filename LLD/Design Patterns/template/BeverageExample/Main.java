package BeverageExample;

public class Main {

    public static void main(String[] args) {
        BeverageMaker coffeeMaker = new CoffeeMaker();
        coffeeMaker.brew();
        coffeeMaker.addCondiments();

        coffeeMaker.makeBeverage();
    }
}
