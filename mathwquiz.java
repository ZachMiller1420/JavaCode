import java.util.Scanner;
public class mathwquiz {

	public static void main(String[] args) {
	// Generate two single digit integers 
		int number1 = (int) (Math.random() * 10);
		int number2 = (int) (Math.random() * 10); 
		
		//2. If number1 < number2, swap number1 with number2
		if (number1 < number2) {
			int temp = number1;
			number1 = number2;
			number2 = temp;
		}
		// Prompt the student to answer "What is number1 - number2? 
		System.out.print
			("What is "   + number1 +  "-" +  number2 + " ?");
		Scanner input = new Scanner(System.in);
		int answer = input.nextInt();
		
		// Grade the answer and display the results
		if (number1 - number2 == answer);
			System.out.println("Your answer is correct");
		
			
		else {
			System.out.println("Your answer is wrong.");
			System.out.println(number1 + "-" + number2 + 
					"should be" + (number1 - number2));
		
		}

	}
}
