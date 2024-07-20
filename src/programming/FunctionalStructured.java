package programming;

import java.util.List;


public class FunctionalStructured {
public static void main(String args[]) {
	
	 printAllNumbersStructured(List.of(12,6,7,4,5,7,8,4));
	 printAllNumbersFunctional(List.of(12,6,7,4,5,7,8,4));
}

public static void printAllNumbersStructured(List<Integer> numbers) {
	for(int number:numbers) {
		System.out.println(number);
	}

}
public static boolean printNumberThatAreEven(Integer number) {
	return (number%2==0);

}
//private static void print(int number) {
//	
//		System.out.println(number);
//	
//}
public static void printAllNumbersFunctional(List<Integer> numbers) {
	
//	numbers.stream().forEach(FunctionalStructured::print);
//	numbers.stream()
//	.filter(FunctionalStructured::printNumberThatAreEven)
//	.forEach(System.out::println);//Method reference
	//Lambda usage
	numbers.stream()
	.filter(number->number%2==0)
	.forEach(System.out::println);//Method reference
	

}
}
