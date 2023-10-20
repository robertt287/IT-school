package session6.challenges;

import java.util.ArrayList;
import java.util.List;

//3. Concatenate Multiple Strings
//Description: Given a list of strings, use StringBuilder to concatenate them into a single string efficiently.
public class Challenge3 {

    public static void main(String[] args) {

        List<String> fruits = new ArrayList<>();
        fruits.add("apples" + " ");
        fruits.add("watermelons" + " ");
        fruits.add("grapes" + " ");
        fruits.add("lemons" + " ");

        StringBuilder stringBuilder = new StringBuilder();

        for (String s : fruits) {
            stringBuilder.append(s);
        }

        System.out.println(stringBuilder);


    }

}
