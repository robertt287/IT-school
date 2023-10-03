package session5.challenges;

//8. For Loop
//Write a program that prints the first 10 numbers in the Fibonacci series. Use a for loop to accomplish this.
public class Challenge8 {

    public static void main(String[] args) {
        int n = 10; // Number of elements to print
        int a = 0;
        int b = 1;

        for (int i = 0; i < n; i++) {
            System.out.print(a + " ");

            int temp = a;
            a = b;
            b = temp + b;
        }
    }
}