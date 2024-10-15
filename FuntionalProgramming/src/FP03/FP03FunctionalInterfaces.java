package FP03;

import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class FP03FunctionalInterfaces {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(12, 9, 13, 4, 6, 2, 4, 12, 15);

        printSquaresOfEvenNumbersInListFunctional(numbers);
    }

    private static void printSquaresOfEvenNumbersInListFunctional(List<Integer> numbers){
        Predicate<Integer> evenPredicate = x -> x % 2 == 0;
        Function<Integer, Integer> squareFunction = x -> x * x;
        Consumer<Integer> sysoutConsumer = System.out::println;
        numbers.stream()
            .filter(evenPredicate)
            .map(squareFunction)
            .forEach(sysoutConsumer);
    }
}
