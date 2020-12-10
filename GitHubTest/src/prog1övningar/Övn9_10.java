package prog1�vningar;

import java.util.Arrays;

public class �vn9_10 {
	public static void main(String[] args) {
		
		double[] falt = {1.0,1.2,3.5,12.0};
		
		System.out.println(variationsbredd(falt));

	}
	static double variationsbredd(double arr[]) {
		
		
		return 	Arrays.stream(arr)
				.sorted()
				.filter(e -> arr[0]==e || arr[arr.length-1]==e)
				.reduce(0, (subtotal,element)->element-subtotal);
	}
}
