package prog1�vningar;
//https://go.codetogether.com/#/iWYj6qPzDpMjLT2FEqmb4f/IfHfxtaTMmaBckiy8g3OpN
import java.util.stream.IntStream;

public class �vn9_7 {
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
