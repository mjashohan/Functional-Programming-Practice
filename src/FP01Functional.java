import java.util.List;

public class FP01Functional {

    public static void main(String[] args) {

        List<Integer> numbers = List.of(12, 9, 13, 4, 6, 2, 4, 12, 15);
        List<String> courses = List.of("Spring", "Spring Boot", "API", "Microservices", "AWS", "PCF", "Azure", "Docker", "Kubernetes");
        System.out.println("Printing all Numbers: ");
        printAllNumbersInListFunctional(numbers);
        System.out.println("Printing Even Numbers");
        printEvenNumbersInListFunctional(numbers);
        System.out.println("Printing Odd Numbers:");
        printOddNumbersInListFunctional(numbers);
        System.out.println("Printing all Courses:");
        printAllCourses(courses);
        System.out.println("Printing courses containing 'Spring': ");
        printCoursesContainingSpring(courses);
        System.out.println("Printing courses containing at least 4 letters: ");
        printCoursesContainingAtLeast4Letters(courses);
        System.out.println("Printing squares of Even Numbers: ");
        printSquaresOfEvenNumbersInListFunctional(numbers);
        System.out.println("Printing cubes of Even Numbers: ");
        printCubeOfOddNumbersInListFunctional(numbers);
        System.out.println("Print Number of characters in each course name: ");
        printCourseCharacters(courses);
    }

    private static void printAllNumbersInListFunctional(List<Integer> numbers) {
        numbers.stream()
                .forEach(System.out::println); //Method reference
    }

    private static void printEvenNumbersInListFunctional(List<Integer> numbers) {
        numbers.stream()
                //.filter(FP01Functional::isEven) //Filter - only allow even numbers
                .filter(number -> number % 2 == 0) //Lambda expression
                .forEach(System.out::println); //Method reference
    }

    private static void printOddNumbersInListFunctional(List<Integer> numbers) {
        numbers.stream()
                //.filter(FP01Functional::isEven) //Filter - only allow even numbers
                .filter(number -> number % 2 != 0) //Lambda expression
                .forEach(System.out::println); //Method reference
    }

    private static void printAllCourses(List<String> courses) {
        courses.stream()
                .forEach(System.out::println);
    }

    private static void printCoursesContainingSpring(List<String> courses) {
        courses.stream()
                .filter(course -> course.contains("Spring"))
                .forEach(System.out::println);
    }

    private static void printCoursesContainingAtLeast4Letters(List<String> courses) {
        courses.stream()
                .filter(course -> course.length() >= 4)
                .forEach(System.out::println);
    }

    private static void printSquaresOfEvenNumbersInListFunctional(List<Integer> numbers) {
        numbers.stream()
                //.filter(FP01Functional::isEven) //Filter - only allow even numbers
                .filter(number -> number % 2 == 0) //Lambda expression
                .map(number -> number * number)
                .forEach(System.out::println); //Method reference
    }

    private static void printCubeOfOddNumbersInListFunctional(List<Integer> numbers) {
        numbers.stream()
                //.filter(FP01Functional::isEven) //Filter - only allow even numbers
                .filter(number -> number % 2 != 0) //Lambda expression
                .map(number -> number * number * number)
                .forEach(System.out::println); //Method reference
    }

    private static void printCourseCharacters(List<String> courses) {
        courses.stream()
                .map(String::length)
                .forEach(System.out::println);
    }
}
