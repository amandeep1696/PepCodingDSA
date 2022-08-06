package twodarrays;

public class A07RingRotateShellRotate {
    public static void main(String[] args) {
        // 1 <= n <= 10^2
        // 1 <= m <= 10^2
        // 0 < s <= min(n, m) / 2.  This means if its just single line it won't be there. Only proper ring will be there
        // -10^9 <= r <= 10^9
        // Rotation anticlockwise

        // Trying to figure out how to do rotation in a 2*2 matrix.

//        int[][] arr = {{1, 2}, {3, 4}};
//        display(arr);
//        System.out.println();

        // Rotate by 1 manually
//        int temp = arr[0][0];
//        arr[0][0] = arr[0][1];
//        arr[0][1] = arr[1][1];
//        arr[1][1] = arr[1][0];
//        arr[1][0] = temp;
//        display(arr);

        // Rotate by 2 manually
//        int temp1 = arr[0][0];
//        arr[0][0] = arr[1][1];
//        arr[1][1] = temp1;
//        int temp2 = arr[1][0];
//        arr[1][0] = arr[0][1];
//        arr[0][1] = temp2;
//        display(arr);

        // Rotate by 3 manually
//        int temp = arr[0][0];
//        arr[0][0] = arr[1][0];
//        arr[1][0] = arr[1][1];
//        arr[1][1] = arr[0][1];
//        arr[0][1] = temp;
//        display(arr);

        // I'll keep a count of number of elements in a ring. Once that number is touched I'll stop.
        // This is because I don't know what is the relation between number of temp variables and even odd ting.
        // Actually as I think about it, a ring will always have even number of elements as it is rectangle.
        // Let me try to generalize for odd number of rotations and see where I can get.
        // I'll try on  a 4*4 matrix.
        // Could think a bit but seemed a bit complicated
        // In the interest of time and since this question does not seem too popular
        // unlike 90-degree rotation, I'm seeing solution.


    }

    private static void display(int[][] arr) {
        for (int[] row : arr) {
            for (int element : row) {
                System.out.print(element + " ");
            }
            System.out.println();
        }
    }
}
