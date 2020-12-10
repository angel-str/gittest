package prog1övningar;

import java.util.Arrays;

public class Övn9_10 {
	public static void main(String[] args) {
		
		double[] falt = {1.0,1.2,3.5,12.0};
		
		System.out.println(variationsbredd(falt));

	}
	static double variationsbredd(double falt[]) {
		
		
		return 0;
				//Arrays.stream(falt)
				//.sorted()
				//.filter(e -> falt[0]==e || falt[falt.length-1]==e)
				//.reduce(0,(falt[1],falt[0]) -> falt[1]-falt[0]);
	}
}
