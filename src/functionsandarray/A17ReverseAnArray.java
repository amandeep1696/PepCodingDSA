package functionsandarray;

import java.util.Scanner;

public class A17ReverseAnArray {
    public static void main(String[] args) {

    }

    public static void reverseArray(int[] arr) {
        int leftIndex = 0;
        int rightIndex = arr.length - 1;
        while (leftIndex < rightIndex) {
            int temp = arr[leftIndex];
            arr[leftIndex] = arr[rightIndex];
            arr[rightIndex] = temp;

            leftIndex++;
            rightIndex--;
        }
    }
}
