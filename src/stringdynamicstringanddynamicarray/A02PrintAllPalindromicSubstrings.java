package stringdynamicstringanddynamicarray;

import java.util.Scanner;

public class A02PrintAllPalindromicSubstrings {
    public static void main(String[] args) {
        // Based on the order they want answer in
        // My way would be two for loops for indices,
        // a palindrome check function which takes string reference and two indices,
        // and print character by character using for loop

        // Doing their way. Not efficient as using substring function which is O(n)
        // My way will also be O(n^3) since checking palindrome is O(n)
        // Better solution is DP which will come later
        // Best solution is Manacher's algorithm
        Scanner scn = new Scanner(System.in);
        String str = scn.nextLine();

        for(int i = 0 ; i < str.length(); i++) {
            for(int j = i + 1; j <= str.length(); j++) {
                if(isPalindrome(str.substring(i, j))){
                    System.out.println(str.substring(i,j));
                }
            }
        }
    }

    public static boolean isPalindrome(String str) {
        int i = 0, j = str.length() - 1;
        while(i < j) {
            if(str.charAt(i) != str.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}
