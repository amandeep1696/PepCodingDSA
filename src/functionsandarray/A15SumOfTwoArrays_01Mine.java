package functionsandarray;

import java.util.Scanner;

public class A15SumOfTwoArrays_01Mine {
    public static void main(String[] args) {
        // 1 <= n1, n2 <= 100
        Scanner scn = new Scanner(System.in);
        int n1 = scn.nextInt();
        int[] arr1 = new int[n1];
        for (int i = 0; i < n1; i++) {
            arr1[i] = scn.nextInt();
        }

        int n2 = scn.nextInt();
        int[] arr2 = new int[n2];
        for (int i = 0; i < n2; i++) {
            arr2[i] = scn.nextInt();
        }

        int ansNumberSize = Math.max(n1, n2) + 1;
        int[] ansArr = new int[ansNumberSize];

        int index1 = n1 - 1;
        int index2 = n2 - 1;
        int carry = 0;
        int ansIndex = ansNumberSize - 1;
        while (index1 >= 0 || index2 >= 0 || carry > 0) {
            int digit1 = (index1 >= 0) ? arr1[index1] : 0;
            int digit2 = (index2 >= 0) ? arr2[index2] : 0;

            int sum = digit1 + digit2 + carry;
            int ansDigit = sum % 10;
            ansArr[ansIndex] = ansDigit;
            carry = sum / 10;

            index1--;
            index2--;
            ansIndex--;
        }

        for (int i = ansIndex + 1; i < ansNumberSize; i++) {
            System.out.println(ansArr[i]);
        }
    }
}
