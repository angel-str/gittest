package prog1övningar;

import java.util.Arrays;

public class Övn9_10 {
	
	
	
	public static void main(String[] args) {
		
		double[] falt = {3.0,1.0,1.0,3.5,12.0};
		System.out.println(variationsbredd(falt));
	}
	
	
	
	
	static double variationsbredd(double arr[]) {
		
		return 	Arrays.stream(arr)
				.filter(e -> min(e,arr) || max(e,arr))
				.peek(e -> System.out.println("Filtered: "+e))
				.filter(e -> findDubbles(e, arr))
				.peek(e -> System.out.println("No dubbles: "+e))
				.reduce(0, (subtotal,element)->element-subtotal);
	}


	
	private static boolean findDubbles(double num, double[] arr) {
		return 1==Arrays.stream(arr)
				.filter(e -> e==num)
				.count();
	}

	private static boolean max(double e, double[] arr) {
		return e==Arrays.stream(arr)
				.max().getAsDouble();
	}

	private static boolean min(double e, double[] arr) {
		return e==Arrays.stream(arr)
				.min().getAsDouble();
	}
}
