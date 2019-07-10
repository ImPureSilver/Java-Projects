import java.util.Random;
import java.util.Scanner;

public class NumberGuess {
    private static final Scanner scanner = new Scanner(System.in);

    private static int randomNumber(){
        Random randomNumber = new Random();
        return randomNumber.nextInt(30);
    }

    public static void main(String[] args) {
        int randomNumber = randomNumber();
        int tries = 10;
        int playerGuess;

        do {
            System.out.println("Type in a number between 0 and 30:\nTries Left: " + tries);
            playerGuess = scanner.nextInt();

            if (playerGuess < randomNumber) {
                System.out.println("\nGuess higher!\n");
                scanner.nextLine();
            }
            if (playerGuess > randomNumber) {
                System.out.println("\nGuess lower!\n");
                scanner.nextLine();
            }
            if (playerGuess == randomNumber) {
                System.out.println("\n\nYOU GOT IT!!!\nThe number was: " + randomNumber);
                scanner.nextLine();
                scanner.close();
            }
            else if(tries == 0) {
                System.out.println("No more lives");
                scanner.close();
            }
        } while (tries-- != 0 );
     }
}
