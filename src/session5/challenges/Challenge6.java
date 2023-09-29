package session5.challenges;

import java.util.Scanner;

//6. While Loop
//Write a program that asks the user to enter numbers.
// The program should continue prompting the user until they enter -1. After they enter -1, print the sum of all numbers entered (excluding -1).
public class Challenge6 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num;
        int totalNum = 0;

        while (true) {
            System.out.println("Please enter a number");
            num = scanner.nextInt();

            if (num == -1) {
                break;
            }
            totalNum += num;
        }

        System.out.println("The sum of the total numbers is " + totalNum);

    }
}
