import java.util.Scanner;

public class NumberGuesing {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // System random number
        int random = (int) Math.floor(Math.random() * 101);

        int guess;
        int attempt = 0;
        int repeat =1;

        do {
            System.out.print("Guess the number : ");
            guess = sc.nextInt();

            if (guess == random) {
                System.out.println("Your guess is correct in " + attempt + " attempts");
                attempt = 0;
                System.out.println("Do you want to play again if yes enter 1 otherwise for exits enter 0 : ");
                repeat = sc.nextInt();
                random = (int) Math.floor(Math.random() * 101);
            }

            else if (guess > random)
                System.out.println("Your number is too large");

            else
                System.out.println("Your number is too small");

            attempt++;

        } while (repeat != 0);

        System.out.println("Thanks for playing");
        sc.close();
    }
}
