package programming;

import java.util.List;

public class FP01Functional {
	
	public static void main(String[] args) {
	List<Integer> numbers = List.of(12,4,9,8,7,10,6,3,78,5,7,4);
	printEvenNumbersInListFunctional(numbers);

	}
	
//	private static boolean isEven(int number) {
//		return number%2 ==0;
//	}
	
	private static void printEvenNumbersInListFunctional(List<Integer> numbers) {
		
		// Define the behavior when we get a number 
		numbers.stream()
			//.filter(FP01Functional:: isEven)// Adding a Filter - Only Allow Even Nos.
			.filter(number -> number%2 != 0) //Lambda Expression : number -> number%2 == 0
			.forEach(System.out::println); // Method Reference
		// For each element do a print or call the print function
		
	}
}
