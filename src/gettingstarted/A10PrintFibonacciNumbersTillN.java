package gettingstarted;

import java.util.Scanner;

public class A10PrintFibonacciNumbersTillN {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        int currentFibNum = 0;
        int nextFibNum = 1;

        for (int i = 0; i < n; i++) {
            System.out.println(currentFibNum);

            int temp = currentFibNum + nextFibNum;
            currentFibNum = nextFibNum;
            nextFibNum = temp;
        }
    }
}
