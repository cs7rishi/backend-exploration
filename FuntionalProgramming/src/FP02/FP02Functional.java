package FP02;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FP02Functional {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(12, 9, 13, 4, 6, 2, 4, 12, 15);
        List<String> courses = List.of("Spring", "Spring Boot", "API" , "Microservices", "AWS", "PCF","Azure", "Docker", "Kubernetes");
        int sum = addListFunctional(numbers);
        System.out.println("Sum of List: \t\t\t" + sum);
        List<Integer> doubledNumber = doubleList(numbers);
        System.out.println("Double List: \t\t\t" + Arrays.toString(doubledNumber.toArray()));
        List<Integer> evenNumber = evenList(numbers);
        System.out.println("Even List: \t\t\t\t" + Arrays.toString(evenNumber.toArray()));
        List<Integer> lengthOfCourse = lengthOfCourses(courses);
        System.out.println("Length of Courses: \t\t" + Arrays.toString(lengthOfCourse.toArray()));

    }

    private static int sum(int aggregate, int nextNumber) {
        System.out.println(aggregate + " " + nextNumber);
        return aggregate + nextNumber;
    }

    private static int addListFunctional(List<Integer> numbers) {
        return numbers.stream().reduce(0, Integer::sum);
    }
    //    private static int addListFunctional(List<Integer> numbers) {
    //        return numbers.stream().reduce(0, FP02Functional::sum);
    //    }
    //    private static int addListFunctional(List<Integer> numbers) {
    //        return numbers.stream().reduce(0, (x, y) -> x + y);
    //    }

    private static List<Integer> doubleList(List<Integer> numbers) {
        return numbers.stream().sorted().map(x -> x * x).collect(Collectors.toList());
    }

    private static List<Integer> evenList(List<Integer> numbers){
        return numbers.stream().sorted().filter(x-> x % 2 ==0).collect(Collectors.toList());
    }

    private static List<Integer> lengthOfCourses(List<String> courses){
        return courses.stream().map(String::length).sorted().collect(Collectors.toList());
    }

}
