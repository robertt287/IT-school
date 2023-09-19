package session5.challenges;
//4. String Reverser
//Ask the user to enter a string. Print the reversed version of this string.

import java.sql.SQLOutput;
import java.util.Scanner;

public class Challenge4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String str = "String", reverse = "";
        char ch;

        System.out.print("Original word: ");
        System.out.println("String");

        for (int i = 0; i < str.length(); i++) {
            ch = str.charAt(i); //extracts each character
            reverse = ch + reverse; //adds each character in front of the existing string
        }
        System.out.println("Reversed word: " + reverse);
    }
}


