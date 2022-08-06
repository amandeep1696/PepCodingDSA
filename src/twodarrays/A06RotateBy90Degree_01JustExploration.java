package twodarrays;

public class A06RotateBy90Degree_01JustExploration {
    public static void main(String[] args) {
        // Square matrix. 1 <= n <= 10^2. Clockwise rotation.
        // First row becomes last column. Second row becomes second last column and so on.
//        Scanner scn = new Scanner(System.in);
//        int n = scn.nextInt();
//        int[][] arr = new int[n][n];
//        for (int i = 0; i < n; i++) {
//            for (int j = 0; j < n; j++) {
//                arr[i][j] = scn.nextInt();
//            }
//        }

        // Using extra space
        /*int [][] rotatedArr = new int[n][n];
        for (int arrRow = 0, rotatedArrCol = n-1; arrRow < n; arrRow++, rotatedArrCol--) {
            for (int index = 0; index < n; index++) {
                rotatedArr[index][rotatedArrCol] = arr[arrRow][index];
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(rotatedArr[i][j] + " ");
            }
            System.out.println();
        }*/


        // Without extra space

        // Just trying things out
//        int[][] arr = {{1, 2}, {3, 4}};
//        System.out.println(arr[0][0] + " " + arr[0][1]);
//        System.out.println(arr[1][0] + " " + arr[1][1]);
//        int temp = arr[0][0];
//        arr[0][0] = arr[1][0];
//        arr[1][0] = arr[1][1];
//        arr[1][1] = arr[0][1];
//        arr[0][1] = temp;
//        System.out.println(arr[0][0] + " " + arr[0][1]);
//        System.out.println(arr[1][0] + " " + arr[1][1]);

        //int[][] arr = {{1,2,3,4}, {5,6,7,8}, {9,10,11,12}, {13,14,15,16}};
        int[][] arr = {{1,2,3}, {5,6,7}, {9,10,11}, {13,14,15}};
        int topRow = 0;
        int bottomRow = 2;
        int leftColumn = 0;
        int rightColumn = 2;

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();

        while (topRow < bottomRow) {
            for (int i = 0; i <= bottomRow-topRow-1; i++) {
                // I'll improve it once I learn about collections like Pair or something
                int firstCoordinateRow = topRow;
                int firstCoordinateCol = leftColumn + i;
                int secondCoordinateRow = topRow + i;
                int secondCoordinateCol = rightColumn;
                int thirdCoordinateRow = bottomRow;
                int thirdCoordinateCol = rightColumn - i;
                int fourthCoordinateRow = bottomRow - i;
                int fourthCoordinateCol = leftColumn;

                int temp = arr[firstCoordinateRow][firstCoordinateCol];
                arr[firstCoordinateRow][firstCoordinateCol] = arr[fourthCoordinateRow][fourthCoordinateCol];
                arr[fourthCoordinateRow][fourthCoordinateCol] = arr[thirdCoordinateRow][thirdCoordinateCol];
                arr[thirdCoordinateRow][thirdCoordinateCol] = arr[secondCoordinateRow][secondCoordinateCol];
                arr[secondCoordinateRow][secondCoordinateCol] = temp;
            }

            topRow++;
            bottomRow--;
            leftColumn++;
            rightColumn--;
        }


        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
