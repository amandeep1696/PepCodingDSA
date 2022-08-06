package functionsandarray;

public class A18RotateAnArray_01Mine {
    public static void main(String[] args) {
        // Theirs solution is optimized for both space and time
        int[] arr = {1, 2};
        rotateArrayTimeOptimized(arr,-1);

        for (int element : arr) {
            System.out.println(element);
        }
    }

    public static void rotateArraySpaceOptimized(int[] arr, int k) {
        int arrayLength = arr.length;
        if (arrayLength == 0 || arrayLength == 1) {
            return;
        }

        k = k % arrayLength;
        if (k < 0) {
            k = k + arrayLength;
        }

        for (int i = 0; i < k; i++) {
            int lastElementInArray = arr[arrayLength-1];
            for (int j = arrayLength - 1; j >= 0; j--) {
                if (j == 0) {
                    arr[j] = lastElementInArray;
                } else {
                    arr[j] = arr[j-1];
                }
            }
        }
    }

    public static void rotateArrayTimeOptimized(int[] arr, int k) {
        int arrayLength = arr.length;
        if (arrayLength == 0 || arrayLength == 1) {
            return;
        }

        k = k % arrayLength;
        if (k < 0) {
            k = k + arrayLength;
        }

        int[] rotatedArr = new int[arrayLength];
        int targetIndex = k;
        for (int i = 0; i < arrayLength - k; i++) {
            rotatedArr[targetIndex] = arr[i];
            targetIndex++;
        }
        targetIndex = 0;
        for (int i = arrayLength - k; i < arrayLength; i++) {
            rotatedArr[targetIndex] = arr[i];
            targetIndex++;
        }

        System.arraycopy(rotatedArr, 0, arr, 0, arrayLength);

        /*for (int i = 0; i < arrayLength; i++) {
            arr[i] = rotatedArr[i];
        }*/
    }
}
