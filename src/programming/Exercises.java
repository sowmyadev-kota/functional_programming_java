package programming;

import java.util.List;

public class Exercises {
public static void main(String[] args) {
	//Exercise1
	printOnlyNumbersOdd(List.of(12,6,7,4,5,7,8,4));
}





public static void printOnlyNumbersOdd(List<Integer> numbers) {
	numbers.stream()
	.filter(number->number%2!=0)
	.forEach(System.out::println);
}
}
