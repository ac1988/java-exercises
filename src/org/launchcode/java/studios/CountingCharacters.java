package org.launchcode.java.studios;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CountingCharacters {
    public static void main (String[] args){
        /*
        String myString = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. " +
                "Nunc accumsan sem ut ligula scelerisque sollicitudin. " +
                "Ut at sagittis augue. Praesent quis rhoncus justo. " +
                "Aliquam erat volutpat. Donec sit amet suscipit metus, non lobortis massa. " +
                "Vestibulum augue ex, dapibus ac suscipit vel, volutpat eget massa. " +
                "Donec nec velit non ligula efficitur luctus.";
        */
        Scanner in = new Scanner(System.in);
        String myString;

        System.out.println("Enter a statement: ");
        myString = in.nextLine();


        String lowerCaseString = myString.toLowerCase();
        lowerCaseString = lowerCaseString.replaceAll("[^a-zA-Z0-9]", "");
        char[] charactersInString = lowerCaseString.toCharArray();
        HashMap<Character, Integer> countMap = new HashMap<>();

        for (char aChar : charactersInString) {
            if (countMap.containsKey(aChar)){
                countMap.put(aChar, countMap.get(aChar) + 1);
            } else {
                countMap.put(aChar, 1);
            }
        }

        for (Map.Entry<Character, Integer> aChar : countMap.entrySet()) {
            System.out.println(aChar.getKey() + ": " + aChar.getValue());
        }
    }
}
