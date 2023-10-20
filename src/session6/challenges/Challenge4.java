package session6.challenges;

import java.util.Scanner;

//4. Removing Vowels
//Description: Create a Java program that uses the StringBuilder class to remove all the vowels from an input string.
public class Challenge4 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Insert word");
        String input = scanner.nextLine();

        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(input);

        String areVowels = "a,e,i,o,u";
        if (input.contains(areVowels)) {
                stringBuilder.delete(0,4);
        }
        System.out.println();
    }

}


