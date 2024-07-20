package programming;

import java.util.List;

public class FunctionalStructured {
public static void main(String args[]) {
	System.out.print("Structured programming");
	 printAllNumbersStructured(List.of(12,6,7,4,5,7,8,4));
//	 printAllNumbersFunctional(List.of(12,6,7,4,5,7,8,4));
}

public static void printAllNumbersStructured(List<Integer> numbers) {
	for(int number:numbers) {
		System.out.println(number);
	}

}
}
//public static void printAllNumbersFunctional(List<Integer> numbers) {
//	for(int number:numbers) {
//		System.out.println(number);
//	}
//
//}
//}
