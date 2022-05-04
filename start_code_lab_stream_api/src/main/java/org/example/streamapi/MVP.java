package org.example.streamapi;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class MVP {

    /*
        Convert a List<String> to an object stream and for each element -> System,out.println.
     */



    public void printNames(List<String> names) {
        // Implement me :)
        names.stream()
                .forEach(System.out ::println);


    }

    /*
        Given a List<Integers>, return a List<Integer> with even numbers.
     */
    public List<Integer> returnEvenNumbers(List<Integer> numbers) {
        // Implement me :)
        return numbers.stream()
                .filter(num -> num % 2 == 0)
                .toList();


    }

    /*
        Given an int [], double the value of each int and return an int [].
    */
    public int[] doubleInts(int[] numbers) {
        // Implement me :)
       return Arrays.stream(numbers)
                .map(num -> num * 2)
                .toArray();


    }

    /*
        Given a String, return a List<String>, all caps.
     */
    public List<String> splitToAllCapsList(String input) {
        // Implement me :)
        return null;
    }

    /*
    Given a list of animals:
     - filter the ones that start with a given letter
     - return sorted List<String>, all caps.
    */
    public List<String> filterByFirstLetterAndOrder(List<String> list, String letter) {
        // Implement me :)
        animals = list.stream().filter(animal -> animal.startsWith(letter)).toList();
        animals.stream().map(animal -> animal.toUpperCase());
        List<String> capanimal = (List<String>) animals.stream().sorted().toList();
        return capanimal;
    }

    /*
        Given a list of words, return elements that:
         - are shorter than the given number and
         - start with a given letter.
    */
    public List<String> filterWords(List<String> words, int maxLength, String firstLetter) {
        // Implement me :)
        return null;
    }
}