package com.cv;
import java.util.HashMap;
import java.util.Scanner;

public class RomanToInteger {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a Roman number in Block Letter: ");

        String rNum = scanner.nextLine();
        
        int result = romanToInteger(rNum);
        
        if (result != -1) {
            System.out.println("The integer equivalent is: " + result);
        } else {
            System.out.println("Invalid Roman numeral.");
        }
    }

    public static int romanToInteger(String s) {
        HashMap<Character, Integer> rMap = new HashMap<>();
        rMap.put('I', 1);
        rMap.put('V', 5);
        rMap.put('X', 10);
        rMap.put('L', 50);
        rMap.put('C', 100);
        rMap.put('D', 500);
        rMap.put('M', 1000);

        int result = 0;
        int prevValue = 0;

        for (int i = s.length() - 1; i >= 0; i--) {
            char currentChar = s.charAt(i);

            if (!rMap.containsKey(currentChar)) {
                return -1; // Invalid Roman numeral
            }

            int currValue = rMap.get(currentChar);

            if (currValue >= prevValue) {
                result += currValue;
            } else {
                result -= currValue;
            }

            prevValue = currValue;
        }

        return result;
    }
}
