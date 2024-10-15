package FP03;

import java.util.List;
import java.util.function.BinaryOperator;

public class Exercise {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(12, 9, 13, 4, 6, 2, 4, 12, 15);
        System.out.println(addListFunctional(numbers));
    }

    private static int addListFunctional(List<Integer> numbers) {
        BinaryOperator<Integer> sumBinaryOperator = Integer::sum;
        BinaryOperator<Integer> sumBinaryOperator2 = new BinaryOperator<Integer>() {
            @Override
            public Integer apply(Integer a, Integer b) {
                return a+b;
            }
        };
        return numbers.stream().reduce(0, sumBinaryOperator2);
    }
}
