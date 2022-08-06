package functionsandarray;

public class A18RotateAnArray_02Theirs {
    public static void main(String[] args) {
        // Think arrLength - k as P1 and Last k elements as P2.
        // Initially it is P1 + P2. We want answer as P2 + P1.
        // Reverse P1 and P2 individually. P1` + P2`. Then reverse the whole P2`` + P1`` = P2 + P1.

    }

    private static void rotateArray(int[] arr, int k) {
        int arrayLength = arr.length;
        if (arrayLength == 0 || arrayLength == 1) {
            return;
        }

        k = k % arrayLength;
        if (k < 0) {
            k = k + arrayLength;
        }

        reverseArray(arr, 0, arrayLength - k - 1);
        reverseArray(arr, arrayLength - k, arrayLength - 1);
        reverseArray(arr, 0, arrayLength - 1);
    }

    private static void reverseArray(int[] arr, int leftIndex, int rightIndex) {
        while (leftIndex < rightIndex) {
            int temp = arr[leftIndex];
            arr[leftIndex] = arr[rightIndex];
            arr[rightIndex] = temp;

            leftIndex++;
            rightIndex--;
        }
    }
}
