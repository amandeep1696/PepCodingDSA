package functionsandarray;

public class A21SubsetsOfAnArray {
    public static void main(String[] args) {
        // If you want to do this without bitmask, you can see their solution using StringBuilder.
        // We'll do this thing again once I get an understanding of StringBuilder.
        // It's still using string + though which isn't the best thing.
        int[] arr = {10, 20, 30};
        printAllSubsets(arr);
    }

    private static void printAllSubsets(int[] arr) {
        int numberOfElementsArray = arr.length;
        int numberOfSubsets = (int) Math.pow(2, numberOfElementsArray);

        for (int i = 0; i < numberOfSubsets; i++) {
            int bitMask = 1 << (numberOfElementsArray - 1); // Did it in this order for the judge.
            for (int element : arr) {
                if ((i & bitMask) != 0) {
                    System.out.print(element + "\t");
                } else {
                    System.out.print("-\t");
                }

                bitMask = bitMask >> 1;
            }
            System.out.println();
        }
    }

    private static void printAllSubsetsAnotherOrder(int[] arr) {
        int numberOfElementsArray = arr.length;
        int numberOfSubsets = (int) Math.pow(2, numberOfElementsArray);

        for (int i = 0; i < numberOfSubsets; i++) {
            for (int j = 0; j < numberOfElementsArray; j++) {
                int currentSubset = i;
                int bitToCheck = j;
                if ((currentSubset & (1 << bitToCheck)) != 0) {
                    System.out.print(arr[j] + "\t");
                } else {
                    System.out.print("-\t");
                }
            }
            System.out.println();
        }
    }
}
