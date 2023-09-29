package session5.challenges;


import java.util.Scanner;

//7. Do-While Loop
//Create a program where the user is prompted to guess a predefined number.
// After each guess, the program should inform the user if the guess is too high or too low.
// The program should keep prompting the user until they guess correctly. Using a do-while loop, ensure the user is always asked at least once.
public class Challenge7 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = 42;
        int userGuess;

        do {
            System.out.println("Introduceti un numar");
            userGuess = scanner.nextInt();

            if (userGuess > 42) {
                System.out.println("Numar prea mare, incearca din nou");
            } else if (userGuess == 42)
                System.out.println("Felicitari, numarul este corect!!!");
            else {
                System.out.println("Numarul este prea mic , incearca din nou");
            }
        } while (userGuess != number);
        scanner.close();

    }

}
