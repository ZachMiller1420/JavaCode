import java.util.Random; import java.util.Scanner; 
	 
	public class getRandomNum { 
	 
		static int generateRandomNumbers(int min, int max) { 
			Random r = new Random(); 
			return r.nextInt((max - min) + 1) + min; 
		} 
		public static void main(String[] args) { 
			 
			System.out.println("Random numbers"); 
			for (int i = 0; i < 100; i++) { 
				System.out.println(generateRandomNumbers(1, 9)); 
			}
		}
	}