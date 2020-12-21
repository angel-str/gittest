package prog1övningar;
import java.util.Scanner;
import java.util.stream.IntStream;

//https://go.codetogether.com/#/iWYj6qPzDpMjLT2FEqmb4f/2rr4fO2BG7lDtQl9PEVOXW

public class Övn9_7 {
	public static void main(String[] args) {
		
		System.out.println("Skriv in två tal som blir ditt intervall:");
		Scanner input = new Scanner(System.in);
		int startTal=input.nextInt();
		int slutTal=input.nextInt();
		System.out.println();
		
		testPrimes(startTal, slutTal);
		
	}
	static boolean isPrime(int num) {
		return num>1 && IntStream
				.range(2, num)
				.noneMatch(index -> num % index==0);
	}
	
	static void testPrimes(int a, int b) {
		
		IntStream
		.range(a, b)
		.filter(e-> isPrime(e))
		.forEach(e-> System.out.println(e));
		
	}
}
