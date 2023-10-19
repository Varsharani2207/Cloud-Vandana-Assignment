package com.cv;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class PanagramCheck {

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("Enter a sentence: ");
	        String input = scanner.nextLine();

	        boolean isPangram = checkPangram(input);

	        if (isPangram) {
	            System.out.println("The input is a pangram.");
	        } else {
	            System.out.println("The input is not a pangram.");
	        }
	    }

	    public static boolean checkPangram(String input) {
	        Set<Character> alphabet = new HashSet<>();

	        for (char ch = 'a'; ch <= 'z'; ch++) {
	            alphabet.add(ch);
	        }

	        for (char ch : input.toLowerCase().toCharArray()) {
	            if (Character.isLetter(ch)) {
	                alphabet.remove(ch);
	            }
	        }

	        return alphabet.isEmpty();
	    }
	}
