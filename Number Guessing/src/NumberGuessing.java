import java.util.Scanner;
public class NumberGuessing {

	public static void main(String[] args) {

		boolean stillPlaying = true;
		System.out.println("You have 4 tries to guess a numbner between 1 and 10.\nGuess a"
				+ " number now.");
		int counter = 0;
		Scanner userGuessInput = new Scanner(System.in);
		int userGuess = 0;
		
		int secretNumber = (int)(Math.random()*10)+1;
		System.out.println(secretNumber);

		for (int i=0; i < 4; i++) {
			
			userGuess = userGuessInput.nextInt();
			counter ++;
			
			if (userGuess == secretNumber) {
				if (counter == 1) {
					System.out.printf("Congrats! You guessed the secret number! It took you %d try.",counter);
				}
				else {
				System.out.printf("Congrats! You guessed the secret number! It took you %d tries.",counter);
				}
				System.exit(0);
			}
			
			else if (userGuess > secretNumber) {
				System.out.println("Too high, try again.");
			}
			
			else if (userGuess < secretNumber) {
				System.out.println("Too low, try again.");
			}
			else {
				System.out.println("Please only enter a whole number between 1 and 5.");
			}
			
		}
		
		System.out.println("Too bad, you lost. Try again soon!");
				
	}

}
