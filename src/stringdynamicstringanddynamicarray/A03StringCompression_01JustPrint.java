package stringdynamicstringanddynamicarray;

import java.util.Scanner;

public class A03StringCompression_01JustPrint {
    public static void main(String[] args) {
        // 1 <= length of string <= 1000
        // Since it's just print I can print char by char.
        // If it was return string like Leetcode I might have to use StringBuilder.
        // We'll cross that bridge once we get there.

        Scanner scn = new Scanner(System.in);
        String str = scn.nextLine();

        for (int i = 0; i < str.length(); i++) {
            if (i == 0) {
                System.out.print(str.charAt(i));
            } else if (str.charAt(i) != str.charAt(i - 1)) {
                System.out.print(str.charAt(i));
            }
        }

        System.out.println();

        int currentCharCount = 0;
        for (int i = 0; i < str.length(); i++) {
            if ((i == 0) || (str.charAt(i) == str.charAt(i - 1))) {
                currentCharCount++;
            } else {
                System.out.print(str.charAt(i - 1));
                if (currentCharCount != 1) {
                    System.out.print(currentCharCount);
                }
                currentCharCount = 1;
            }
        }
        System.out.print(str.charAt(str.length() - 1));
        if (currentCharCount != 1) {
            System.out.print(currentCharCount);
        }
        System.out.println();
    }
}
