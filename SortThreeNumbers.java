/*
 * The object of this program is to sort three number in increasing order
 */
import java.util.Scanner;import java.util.Scanner;
public class SortThreeNumbers
{
public static void main(String[] args) {
// Declarations
Scanner input = new Scanner(System.in);

System.out.print("Enter three values: ");
int num1 = input.nextInt();
int num2 = input.nextInt();
int num3 = input.nextInt();
}

/** Sort Numbers */
public static void displaySortedNumbers(double num1, double num2, double num3){
if ((num1 < num2) && (num2 < num3)){
    System.out.println("The sorted numbers are " + num1 + " " + num2 + " " + num3);
    }
if ((num1 < num2) && (num2 > num3)){
    System.out.println("The sorted numbers are " + num1 + " " + num3 + " " + num2);
    }
if ((num1 > num2) && (num2 > num3)){
    System.out.println("The sorted numbers are " + num3 + " " + num2 + " " + num1);
    }
if ((num1 > num2) && (num2 < num3)){
    System.out.println("The sorted numbers are " + num2 + " " + num3 + " " + num1);
 
    }
}
}


	



