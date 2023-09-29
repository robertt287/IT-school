package session5.challenges;

import java.util.Scanner;

//5. Fibonacci Series Generator
//Write a program that generates and prints the first n numbers of the Fibonacci series, where n is provided by the user.
public class Challenge5 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of Fibonacci numbers to generate: ");
        int n = scanner.nextInt();

        // Check if n is less than or equal to 0
        if (n <= 0) {
            System.out.println("Invalid input. Please enter a positive integer.");
        } else {
            generateAndPrintFibonacciSeries(n);
        }

        scanner.close();
    }

    public static void generateAndPrintFibonacciSeries(int n) {
        long[] fibonacciSeries = new long[n];

        // First two numbers in the Fibonacci series
        fibonacciSeries[0] = 0;
        if (n > 1) {
            fibonacciSeries[1] = 1;
        }

        // Generate the rest of the Fibonacci series
        for (int i = 2; i < n; i++) {
            fibonacciSeries[i] = fibonacciSeries[i - 1] + fibonacciSeries[i - 2];
        }

        // Print the Fibonacci series
        System.out.println("Fibonacci Series:");
        for (int i = 0; i < n; i++) {
            System.out.print(fibonacciSeries[i] + " ");
        }
    }
}