package session5.challenges;

import java.util.Scanner;

//Create a program that asks the user for 10 numbers. Print the sum of all numbers that are greater than 5.
// If the user enters a number less than or equal to 5, use the continue statement to skip the addition for that number.
public class Challenge12 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 10 numbers");
        System.out.println(" ");
        int numberCounter = 1;
        int numberSum = 0;

        while (numberCounter <= 10) {
            System.out.println("Enter number: " + numberCounter);
            numberCounter++;
            int input = scanner.nextInt();

            if (input > 5) {
                numberSum += input;
            } else {
                continue;
            }
        }
        System.out.println(numberSum);
    }
}
