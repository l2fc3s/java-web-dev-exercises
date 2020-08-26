package org.launchcode.java.studios.charactercount;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;


public class  CharacterCounter {

    public static void main(String[] args) {

//        String text = "If the product of two terms is zero then common sense says at least one of the two terms has to be zero to start with. So if you move all the terms over to one side, you can put the quadratics into a form that can be factored allowing that side of the equation to equal zero. Once you’ve done that, it’s pretty straightforward from there.";

        Scanner in = new Scanner(System.in);
        System.out.println("Please enter some text: ");
        String text = in.nextLine();
        text = text.toLowerCase();

        HashMap<Character, Integer> counts = new HashMap<>();

        for(char c : text.toCharArray()) {
            if(c >= 'a' && c <= 'z') {
                if (!counts.containsKey(c)) {
                    counts.put(c, 1);
                } else {
                    int seen = counts.get(c);
                    counts.put(c, seen + 1);
                }
            }
        }
        for(Map.Entry<Character, Integer> entry : counts.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
