package prog1övningar;
//https://go.codetogether.com/#/iWYj6qPzDpMjLT2FEqmb4f/AsLN4k9BmsJP1nfnXxNsfc
import java.util.stream.IntStream;

public class Övn9_7 {
	public static void main(String[] args) {
		
		System.out.println(isPrime(3));
		
	}
	static boolean isPrime(int num) {
		return num>1 && IntStream
				.range(2, num)
				.noneMatch(index -> num % index==0);
	}
}
