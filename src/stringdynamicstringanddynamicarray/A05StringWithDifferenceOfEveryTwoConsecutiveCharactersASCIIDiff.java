package stringdynamicstringanddynamicarray;

import java.util.Scanner;

public class A05StringWithDifferenceOfEveryTwoConsecutiveCharactersASCIIDiff {
    public static void main(String[] args) {
        // Explore StringBuilder internals and time complexities
        // 1 <= length of string <= 1000
        Scanner scn = new Scanner(System.in);
        String str = scn.next();
        System.out.println(getASCIIDifferenceString(str));
    }

    private static String getASCIIDifferenceString(String str) {
        StringBuilder sb = new StringBuilder();
        sb.append(str.charAt(0));

        for (int i = 1; i < str.length(); i++) {
            int asciiDiff = str.charAt(i) - str.charAt(i - 1);
            sb.append(asciiDiff);
            sb.append(str.charAt(i));
        }

        return sb.toString();
    }
}

// It is O(1) when appending single characters to StringBuilder.
// A StringBuilder is like an ArrayList. When you append a single item the cost is O(1)
// And finally the .toString() before return that is O(n)
