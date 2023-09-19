package session6.practice;

import java.sql.SQLOutput;

public class StringMethodsPractice {
    public static void main(String[] args) {
        String name="John doe";
        printStringLength("Test");
        printStringCharAt("Alice", 4);// 01234

        printStringIndexAt("Alice", "i");
        printSubString("Hello world", 6, 11);

        System.out.println(name.substring(5,8));

        System.out.println(name.toUpperCase());
        System.out.println(name.toLowerCase());

        System.out.println(name+ "contains Doe "+ name.contains("doe"));

        System.out.println("Replaced 'e' from Hello " + "Hello".replace('e', 'a'));

        String email="user@google.com";
        String domain=email.substring(email.indexOf('@') + 1);
        System.out.println("The domain name is: " + domain);



    }

    private static void printStringLength(String input) {
        System.out.println("String input length: " + input.length());

    }

    private static void printStringCharAt(String input, int index) {
        System.out.println("The character at index 1 is :" + input.charAt(index));
    }

    private static void printStringIndexAt(String input, String target) {
        System.out.println("The index of target is: " + input.indexOf(target));
    }

    private static void printSubString(String input, int startIndex, int endIndex){
        System.out.println("The substring is :" +input.substring(startIndex, endIndex));
    }


}
