import java.util.Scanner;

public class GuessTheNumber {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int max=100;
        int min=1;
        int numberToBeGuessed= (int)Math.floor(Math.random()*(max-min+1)+min);
        int noOfGuesses=0;
        while(true)
        {
            noOfGuesses++;
            System.out.println("enter the number");
            int guessedNumber=scanner.nextInt();
            if(guessedNumber == numberToBeGuessed) {
                System.out.println("Congratulations!You have guessed the number in " + noOfGuesses + " guesses!Thanks for playing");
                break;
            }
            else if(guessedNumber > numberToBeGuessed)
                System.out.println("Your Guess is too high!");
            else
                System.out.println("Your guess is too low");

        }

    }
}
