package prog1övningar;

import java.util.stream.IntStream;

public class Övn9_7 {
	public static void main(String[] args) {
		
		System.out.println(
				isPrime(3)
				);
		
	}
	static boolean isPrime(int num) {
		return num>1 && IntStream
				.range(2, num)
				.noneMatch(index -> num % index==0);
	}
}
