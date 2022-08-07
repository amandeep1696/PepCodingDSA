package stringdynamicstringanddynamicarray;

import java.util.Scanner;

public class A07PrintAllPermutationsOfAStringIteratively {
    public static void main(String[] args) {
        // 1 <= length of string <= 15
        // Go through the dry run of this algo as shown in video.
        // In interviews, we'll use recursive solution only.

        Scanner scn = new Scanner(System.in);
        String str = scn.next();
        solution(str);
    }

    private static void solution(String str) {
        int numOfPermutations = getFactorial(str.length());

        for (int i = 0; i < numOfPermutations; i++) {
            int temp = i; // dividend
            StringBuilder sb = new StringBuilder(str);
            for (int div = str.length(); div > 0; div--) {
                int quotient = temp / div;
                int remainder = temp % div;

                System.out.print(sb.charAt(remainder));
                sb.deleteCharAt(remainder);

                temp = quotient;
            }
            System.out.println();
        }
    }

    private static int getFactorial(int num) {
        int factorial = 1;
        for (int i = 2; i <= num; i++) {
            factorial *= i;
        }
        return factorial;
    }
}
