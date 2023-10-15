package session5.challenges;

import java.util.Scanner;

//10. Jump Statements
//Create a menu-driven program where the user is presented with options:
//
//Print "Hello World"
//Print the user's name.
//Exit.
//Based on the user's input, perform the necessary action. Once an action is completed, show the menu again, unless the user chooses the Exit option.
// Use jump statements to control the flow of the program.
public class Challenge10 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("1. Hello world");
        System.out.println("2. Print user's name");
        System.out.println("3. Exit");
        int input = scanner.nextInt();

        while (true) {
            if (input == 1) {
                System.out.println("Hello world!");
                System.out.println(" ");
                System.out.println("1. Hello world");
                System.out.println("2. Print user's name");
                System.out.println("3. Exit");
                input = scanner.nextInt();
            } else if (input == 2) {
                System.out.println("What is your name?");
                String name = scanner.next();
                System.out.println("Hello " + name);
                System.out.println(" ");
                System.out.println("1. Hello world");
                System.out.println("2. Print user's name");
                System.out.println("3. Exit");
                input = scanner.nextInt();
            } else if (input == 3) {
                System.out.println("Exiting");
                break;
            } else {
                System.out.println("Invalid command");
                System.out.println(" ");
                System.out.println("1. Hello world");
                System.out.println("2. Print user's name");
                System.out.println("3. Exit");
                input = scanner.nextInt();

            }

        }
        scanner.close();
    }
}



