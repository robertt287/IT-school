package session5.challenges;

//3. Counting Negative Numbers
//Given an array of integers, write a program to count and print the number of negative integers in the array.

import java.sql.SQLOutput;

public class Challenge3 {
    public static void main(String[] args) {
        int[] numbers = {-1, -2, -3, -4, -5, -6, -7};

        for (int number:numbers) {
           if(number<0){
               System.out.println("There are " + numbers.length + "  negative numbers");
               break;

           }
        }

    }
}


