package functionsandarray;

public class A18RotateAnArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        rotateArraySpaceOptimized(arr, -1);

        for (int element : arr) {
            System.out.println(element);
        }
    }

    public static void rotateArraySpaceOptimized(int[] arr, int k) {
        if (arr.length == 0 || arr.length == 1) {
            return;
        }

        k = k % arr.length;
        if (k < 0) {
            k = k + arr.length;
        }

        for (int i = 0; i < k; i++) {
            int lastElementInArray = arr[arr.length-1];
            for (int j = arr.length - 1; j >= 0; j--) {
                if (j == 0) {
                    arr[j] = lastElementInArray;
                } else {
                    arr[j] = arr[j-1];
                }
            }
        }
    }

    public static void rotateArrayTimeOptimized(int[] arr, int k) {

    }
}
