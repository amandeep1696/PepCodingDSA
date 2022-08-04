package functionsandarray;

import java.util.Scanner;

public class A16DifferenceOfTwoArrays {
    public static void main(String[] args) {
        // arr2 is greater than arr 1
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

        int ansNumberSize = n2;
        int[] ansArr = new int[ansNumberSize];

        int index1 = n1 - 1;
        int index2 = n2 - 1;
        int borrow = 0;
        int ansIndex = ansNumberSize - 1;
        while (ansIndex >= 0) {
            int digit1 = (index1 >= 0) ? arr1[index1] : 0;
            int digit2 = arr2[index2];

            int ansDigit = digit2 - digit1 + borrow;
            if (digit2 + borrow < digit1) {
                ansDigit = ansDigit + 10;
                borrow = -1;
            } else {
                borrow = 0;
            }

            ansArr[ansIndex] = ansDigit;

            index1--;
            index2--;
            ansIndex--;
        }

        boolean isLeadingZero = true;
        for (int digit : ansArr) {
            if (digit == 0 && isLeadingZero) {
                continue;
            } else {
                isLeadingZero = false;
                System.out.println(digit);
            }
        }
        if (isLeadingZero) {
            System.out.println("0");
        }
    }
}
