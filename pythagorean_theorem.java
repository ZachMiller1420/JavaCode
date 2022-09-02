import java.util.Scanner;

/** 
 * Zach Miller  
 * 8/18/2020
 * Bellevue University
 * File name: pythagorean_theorem.java 
 * The purpose of this program is to calculate the hypotenuse of a right triangle using the Pythagorean theorem
 */

public class pythagorean_theorem {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter measurments of leg a:");
		int a = input.nextInt();
		
		//Enter 4 for measurement "a" then press enter 
		
		System.out.print("Enter measurments of leg b:");
		int b = input.nextint();
		
		//Enter 6 for measurement "b" then press enter 
		
		int c = Math.sqrt(Math.pow(a, 2) + Math.Pow(b, 2));
		System.out.print("Hypotenuse = " + c);
				
		
	}

}
