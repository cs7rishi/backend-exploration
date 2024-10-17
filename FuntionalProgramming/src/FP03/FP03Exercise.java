package FP03;

import java.util.List;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Predicate;

public class FP03Exercise {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(12, 9, 13, 4, 6, 2, 4, 12, 15);
        System.out.println(addListFunctional(numbers));
        printSquaresOfEvenNumbersInListFunctional(numbers);
    }

    private static int addListFunctional(List<Integer> numbers) {
        BinaryOperator<Integer> sumBinaryOperator = Integer::sum;
        //create a anonymous class
        BinaryOperator<Integer> sumBinaryOperator2 = new BinaryOperator<Integer>() {
            @Override
            public Integer apply(Integer a, Integer b) {
                return a+b;
            }
        };
        return numbers.stream().reduce(0, sumBinaryOperator2);
    }

    private static void printSquaresOfEvenNumbersInListFunctional(List<Integer> numbers){
        Predicate<Integer> evenPredicate = x -> x % 2 == 0;
        Function<Integer,Integer> squareFunction = x -> x * x;
        Function<Integer,Integer> cubeFunction = x -> x * x * x;
        System.out.println("Square of Numbers");
        numbers.stream()
            .filter(evenPredicate)
            .map(squareFunction)
            .forEach(System.out::println);
        System.out.println("Cubes of Numbers");
        numbers.stream()
            .filter(evenPredicate)
            .map(cubeFunction)
            .forEach(System.out::println);
    }


}
