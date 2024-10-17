package FP03;

import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class FP03BehaviourParameterization {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(12, 9, 13, 4, 6, 2, 4, 12, 15);

        Predicate<Integer> evenPredicate = x -> x % 2 == 1;
        Predicate<Integer> oddPredicate = x -> x % 2 == 0;

        System.out.println("Printing Odd Numbers");
        printNumbers(numbers, x -> x % 2 == 1);
        System.out.println("Printing Even Numbers");
        printNumbers(numbers, x -> x % 2 == 0);
    }

    private static <T> void printNumbers(List<T> numbers, Predicate<T> p){
        numbers.stream()
            .filter(p)
            .forEach(System.out::println);
    }
}
