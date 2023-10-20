package session6.challenges;

import java.util.Scanner;

//1. Reverse a String
//Description: Use the StringBuilder class to write a program that reverses an input string. For example, the input "hello" should return "olleh".
public class Challenge1 {

    public static void main(String[] args) {

        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter a string");
        String string=scanner.nextLine();

        StringBuilder stringBuilder=new StringBuilder();
        stringBuilder.append(string);

        System.out.println("reversed string: " + stringBuilder.reverse());
    }
}
