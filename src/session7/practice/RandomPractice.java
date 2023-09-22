package session7.practice;

import java.util.*;

public class RandomPractice {

    public static void main(String[] args) {
        Random random = new Random();   //obiect de tipul random

        for (int index = 0; index <= 10; index++) {
            int randomInt = random.nextInt(100) + 1;
            System.out.println("Random number " + index + ": " + randomInt);
            System.out.println("UUId " + index + ": " + UUID.randomUUID());   //pt a nu ne da duplicate

        }

        String[] fruits = {"apple", "banana", "cherry"};
        for (int index = 0; index < 3; index++) {
            String randomFruit = fruits[random.nextInt(fruits.length)];
            System.out.println(randomFruit);
        }

        List<Integer> numbers =Arrays.asList(1,2,3,4,5);
        Collections.shuffle(numbers,random);
        System.out.println("Shuffled list: " + numbers);
    }
}
