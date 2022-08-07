package stringdynamicstringanddynamicarray;

import java.util.Scanner;

public class A04ToggleOpticalDocumentToggleCase {
    public static void main(String[] args) {
        // 1 <= length of string <= 1000
        // Their solution is using StringBuilder
        // I'm calling an audible and watching Yt playlist videos 543 and 544 first

        // Video 543 - String Interning and Immutability
        // Nice video with good concepts. Must watch again to reinforce.
        // Always use s1.equals(s2) to compare strings. Never use ==.
        // Reference is mutable. Instance is not.

        // Vid 544 - StringBuilder

        /*StringBuilder sb = new StringBuilder("hello");
        System.out.println(sb);

        char ch = sb.charAt(0);
        System.out.println(ch);

        sb.setCharAt(0, 'd'); // Changed the instance
        System.out.println(sb);

        sb.insert(2, 'y');
        System.out.println(sb);

        sb.deleteCharAt(2);
        System.out.println(sb);

        sb.append('g');
        System.out.println(sb);

        sb.append("aman");
        System.out.println(sb);

        System.out.println(sb.length());*/

        // StringBuilder has good performance. Example below.

        /*int n = 100000;
        long start = System.currentTimeMillis();
        String s = "";
        for (int i = 0; i < n; i++) { // This loop is actually O(n^2)
            s += i;
        }
        long end = System.currentTimeMillis();
        long duration = end - start;
        System.out.println(duration);

        long startSB = System.currentTimeMillis();
        StringBuilder sb = new StringBuilder(); // This is equivalent to String s = "";
        for (int i = 0; i < n; i++) {
            sb.append(i);
        }
        long endSB = System.currentTimeMillis();
        long durationSB = endSB - startSB;
        System.out.println(durationSB);*/


        // 1 <= length of string <= 1000

        Scanner scn = new Scanner(System.in);
        String str = scn.next();
        System.out.println(toggleCase(str));
    }

    private static String toggleCase(String str) {
        StringBuilder sb = new StringBuilder(str);

        for (int i = 0; i < sb.length(); i++) {
            char currentCharacter = sb.charAt(i);

            if (currentCharacter >= 'a' && currentCharacter <= 'z') {
                char upperCaseChar = (char) ('A' + currentCharacter - 'a');
                sb.setCharAt(i, upperCaseChar);
            } else if (currentCharacter >= 'A' && currentCharacter <= 'Z') {
                char lowerCaseChar = (char) ('a' + currentCharacter - 'A');
                sb.setCharAt(i, lowerCaseChar);
            }
        }

        return sb.toString();
    }
}
