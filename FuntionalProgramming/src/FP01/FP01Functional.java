package FP01;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FP01Functional {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(12, 9, 13, 4, 6, 2, 4, 12, 15);
        printAllNumbersInListFunctional(numbers);
        printSquaresOfEvenNumbersInListFunctional(numbers);
        printSquaresOfNumbersInList(numbers);
    }

    private static void printAllNumbersInListFunctional(List<Integer> numbers) {
        numbers.stream().forEach(System.out::println);
    }

    private static void printEvenNumbersInListStructured(List<Integer> numbers) {
        for(int number : numbers){
            if(number % 2 == 0){
                System.out.println(number);
            }
        }
    }
    private static void printSquaresOfEvenNumbersInListFunctional(List<Integer> numbers) {
        numbers.stream()
            .filter(number -> number % 2 == 0) //Filter- Only Allow Even Numbers
            .forEach(System.out::println);//Method Reference
    }

    private static void printSquaresOfNumbersInList(List<Integer> numbers){
        System.out.println("Square of Number");
        numbers.stream().map(num->num*num).forEach(System.out::println);
    }
}
