package session18.practice;

import java.util.Arrays;
import java.util.List;
import java.util.OptionalInt;

//Problem 3
//Given a list of random numbers, use Java streams to find the smallest and largest numbers in the list.
// Do not use the traditional loop-based method for this.
public class LargestSmallerNumber {

    public static void main(String[] args) {
        List<Integer>randomNumbers= Arrays.asList(1,4,6,656,878,98,5,65,76,6);

        printRandomNumbers(randomNumbers);

    }

    private static void printRandomNumbers(List<Integer>list){
        OptionalInt min=list.stream()
                .mapToInt(Integer::intValue)
                .min();

        OptionalInt max=list.stream()
                .mapToInt(Integer::intValue)
                .max();

        System.out.println("Min: " + min.getAsInt() + " max: " + max.getAsInt() );
    }
}
