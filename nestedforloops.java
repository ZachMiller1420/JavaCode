/*
 * Zach Miller 
 * Company: Bellevue University 
 * Purpose: The is program will print configuration #1 & #4 
 * Date: 9/3/2020
 * File: nestedforloops.java
 */
 
public class nestedforloops {

	public static void main(String[] args) {
		for (int i = 1; i <= 6; ++i) {
			for (int j = 1; j <= i; ++j) {
				System.out.print(j + " ");
			}
			System.out.println("");
		}
		for (int i = 6; i > 0; --i) {
			for (int j = 1; j <= i; ++j) {
				System.out.print(j + " ");
			}
			System.out.println("");

		}
	}
}
