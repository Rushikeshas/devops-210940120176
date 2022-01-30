//4.1 Accept 2 double values from User (using Scanner). Check data type.
//If arguments are not doubles , supply suitable error message & terminate.
//If numbers are double values , print its average.
package que1;

import java.util.Scanner;

public class Avg {
	
	public static void main(String[] args) {
		
		double d1 = 0, d2 = 0;
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("enter 1st value");
		if (!sc.hasNextDouble()) {
			System.out.println("invalid entry");
		} else
			 d1=sc.nextDouble();
		

		System.out.println("enter 2nd value");
		if (!sc.hasNextDouble()) {
			System.out.println("invalid entry");
		} else
			 d2=sc.nextDouble();
		double avg = (d1 + d2) / 2;
		System.out.println("Average : " + avg);

	}

}
