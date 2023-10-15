package session5.challenges;

import java.util.Scanner;
//Write a program that prompts the user to enter numbers. Calculate the average of these numbers.
//        If the user enters 0, break out of the input loop and then print the average of the numbers entered so far.
public class Challenge11 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter numbers");
        int input = scanner.nextInt();

        int counter = 0;
        int numbersTotal = 0;
        int average = 0;


        while (input != 0) {
            counter++;
            numbersTotal += input;
            input = scanner.nextInt();

        }
        if (input == 0)
            average = numbersTotal / counter;
        System.out.println("The average is: " + average);
    }
}
