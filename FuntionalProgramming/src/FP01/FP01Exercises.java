package FP01;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FP01Exercises {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(12, 9, 13, 4, 6, 2, 4, 12, 15);
        List<String> courses = List.of("Spring", "Spring Boot", "API" , "Microservices", "AWS", "PCF","Azure", "Docker", "Kubernetes");
        printSquaresOfOddNumbersInListFunctional(numbers);
        printCoursesContainingTheWordSpring(courses);
        printCoursesWithAtleast4Letters(courses);
        printCubesOfNumbersInList(numbers);
        printNumberOfCharactersInEachCourseName(courses);
    }

    private static void printSquaresOfOddNumbersInListFunctional(List<Integer> numbers) {
        numbers.stream().filter(number -> number % 2 == 1) //Filter- Only Allow Odd Numbers
            .forEach(System.out::println);//Method Reference
    }

    private static void printCoursesContainingTheWordSpring(List<String> courses) {
        System.out.println("Courses containing the word Spring");
        courses.stream().filter(course -> course.contains("Spring")).forEach(System.out::println);
    }

    private static void printCoursesWithAtleast4Letters(List<String> courses) {
        System.out.println("Courses with atleast 4 letters");
        courses.stream().filter(course -> course.length() >= 4).forEach(System.out::println);
    }

    private static void printCubesOfNumbersInList(List<Integer> numbers) {
        System.out.println("Cube of Number");
        numbers.stream().map(num -> num * num * num).forEach(System.out::println);
    }

    private static void printNumberOfCharactersInEachCourseName(List<String> courses) {
        System.out.print("Character in Each Course");
        courses.stream().map(course -> course + " " + course.length()).forEach(System.out::println);
    }


}
