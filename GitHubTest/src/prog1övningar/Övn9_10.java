package prog1övningar;

import java.util.Arrays;

public class Övn9_10 {
	
	
	
	public static void main(String[] args) {
		
		double[] falt = {3.0,1.0,1.0,3.5,12.0};
		System.out.println(variationsbredd(falt));
	}
	
	
	
	
	static double variationsbredd(double arr[]) {
		
		return 	Arrays.stream(arr)
				.sorted()
				.filter(e -> min(e,arr) || max(e,arr))
				.filter(e -> findDubbles(e, arr))
				.reduce(0, (subtotal,element)->element-subtotal);
	}

	
	
	private static boolean findDubbles(double e, double[] arr) {
		return 1==Arrays.stream(arr)
				.filter(element -> element==e)
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
