package functionsandarray;

public class A20SubArraysOfAnArray {
    public static void main(String[] args) {
        // Print all subArrays of an array
        int[] arr = {10, 20, 30};
        printAllSubArrays(arr);
    }

    private static void printAllSubArrays(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                for (int k = i; k <= j; k++) {
                    System.out.print(arr[k] + " ");
                }
                System.out.println();
            }
        }
    }
}
