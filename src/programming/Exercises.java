package programming;

import java.util.List;

public class Exercises {
public static void main(String[] args) {
	//Exercise1
	printOnlyNumbersOdd(List.of(12,6,7,4,5,7,8,4));
	//Exercise2
	List<String> courses = List.of("Spring","Springboot","API","Docker");
	printAllCoursesIndividually(courses);
	//Exercise3
	printcoursesContaingSpring(courses);
}


private static void printAllCoursesIndividually(List<String> courses) {
	courses.stream()
	.forEach(System.out::println);
	
}

private static void printcoursesContaingSpring(List<String> courses) {
	courses.stream()
	.filter(course->course.contains("Spring"))
	.forEach(System.out::println);
	
}

public static void printOnlyNumbersOdd(List<Integer> numbers) {
	numbers.stream()
	.filter(number->number%2!=0)
	.forEach(System.out::println);
}
}
