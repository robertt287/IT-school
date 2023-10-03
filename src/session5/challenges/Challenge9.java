package session5.challenges;

//9. For-Each Loop
//Given an array of integers,
// write a program that prints each number in the array followed by "Even" if the number is even, or "Odd" if the number is odd. Utilize a for-each loop for this task.
public class Challenge9 {

    public static void main(String[] args) {

        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        for (int num : numbers) {
            if (num % 2 == 0) {
                System.out.println(num + " Even");
            } else {
                System.out.println(num + " Odd");
            }
        }
    }
}
