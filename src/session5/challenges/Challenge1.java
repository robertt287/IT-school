package session5.challenges;


//1. Even or Odd Checker
//Write a Java program that takes an integer as input.
// If the number is even, print "Even". If it's odd, print "Odd".
public class Challenge1 {
    public static void main(String[] args) {
        evenOrOdd(3);

    }

    public static void evenOrOdd(int number) {
        if (number % 2 == 0) {
            System.out.println("Even");
        } else {
            System.out.println("Odd");
        }
    }

}

