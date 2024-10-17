package FP03;

import java.util.List;
import java.util.function.*;

public class FP03FunctionalInterfaces {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(12, 9, 13, 4, 6, 2, 4, 12, 15);

        Predicate<Integer> evenPredicate = x -> x % 2 == 0;

        Function<Integer, Integer> squareFunction = x -> x * x;

        Consumer<Integer> sysoutConsumer = System.out::println;

        BinaryOperator<Integer> sumBinaryOperator = (x, y) -> x + y;

        Supplier<Integer> randomIntegerSupplier = () -> (int) (Math.random() * 1000);

        UnaryOperator<Integer> unaryOperator = x -> x*x*x*x;

        BiPredicate<Integer, Double> biPredicate = (x, y) -> x > y;

        BiFunction<Integer,Integer, Boolean> biFunction = (x,y)->x > y;

        BiConsumer<Integer, Integer> biConsumer = (x, y) -> System.out.println(x+y);

        System.out.println();
        biConsumer.accept(4,5);

//        numbers.stream().filter(evenPredicate).map(squareFunction).forEach(sysoutConsumer);
    }
}
