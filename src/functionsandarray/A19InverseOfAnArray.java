package functionsandarray;

public class A19InverseOfAnArray {
    public static void main(String[] args) {
        // Range of values is 0 to n - 1
        int[] arr = {4, 0, 2, 3, 1};
        int[] inverseArr = getInverseArray(arr);
        for (int element : inverseArr) {
            System.out.println(element);
        }
    }

    private static int[] getInverseArray(int[] arr) {
        int[] inverseArray = new int[arr.length];
        for (int originalArrayIndex = 0; originalArrayIndex < arr.length; originalArrayIndex++) {
            int originalArrayValue = arr[originalArrayIndex];
            int inverseArrayIndex = originalArrayValue;
            int inverseArrayValue = originalArrayIndex;

            inverseArray[inverseArrayIndex] = inverseArrayValue;
        }
        return inverseArray;
    }
}
