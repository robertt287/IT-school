package session6.challenges;

//2. Palindrome Checker
//Description: Write a program that checks whether a given string is a palindrome using the StringBuilder class.
// A palindrome is a word, phrase, number, or other sequences of characters that reads the same forward and backward.
public class Challenge2 {

    public static void main(String[] args) {

        StringBuilder stringBuilder=new StringBuilder("civic");

        String sub= String.valueOf(stringBuilder);
        String reversed= String.valueOf(stringBuilder.reverse());
        System.out.println(sub +" " + reversed);

        if(sub.equals(reversed)){
            System.out.println("This string is a palindrome");
        }
        else{
            System.out.println("This string is not a palindrome");
        }

        }

        }



