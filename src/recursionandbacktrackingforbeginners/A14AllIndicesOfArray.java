package recursionandbacktrackingforbeginners;

import java.util.ArrayList;
import java.util.Scanner;

public class A14AllIndicesOfArray {
    public static void main(String[] args) {
        // 1 <= n <= 10^4 0 <= n1, n2, .. n elements <= 10 ^ 3 0 <= x <= 10 ^ 3
        // We're doing this without using arraylist. Using arraylist will make it a lot easier.
        // I'll just do it anyways just to get some hands on with arraylist.
        // Had to create a helper function to achieve it. I've commented this approach out.
        // If we don't want to create arraylist, maybe we can run one helper fn to just get count of x.
        // Then create array of size count, pass its reference in another function with nextIndex to write in this array.
        // ++ this index whenever you write into this array. Then return this from the base function.
        // I'm not coding this up as this seems basic.
        // Another approach is to keep a count of found so far in the recursion itself. This is their solution.
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();
        }
        int x = scn.nextInt();

//        int[] indices = getAllIndices(arr, x);
//        for (int index : indices) {
//            System.out.println(index);
//        }

        int[] indices = allIndicesTheir(arr, x, 0, 0);
        for (int index : indices) {
            System.out.println(index);
        }
    }

    /*private static int[] getAllIndices(int[] arr, int x) {
        ArrayList<Integer> indices = new ArrayList<>();
        getAllIndicesHelper(arr, x, indices, 0);
        int[] arrIndices = new int[indices.size()];
        for (int i = 0; i < indices.size(); i++) {
            arrIndices[i] = indices.get(i);
        }
        return arrIndices;
    }

    private static void getAllIndicesHelper(int[] arr, int x, ArrayList<Integer> indices, int currentIndex) {
        if (currentIndex == arr.length) {
            return;
        }

        if (arr[currentIndex] == x) {
            indices.add(currentIndex);
        }
        getAllIndicesHelper(arr, x, indices, currentIndex + 1);
    }*/

    private static int[] allIndices(int[] arr, int x, int idx, int fsf) {
        if (idx == arr.length) {
            int[] indices = new int[fsf];
            return indices;
        }

        int[] indices;
        if (arr[idx] == x) {
            indices = allIndices(arr, x, idx + 1, fsf + 1);
        } else {
            indices = allIndices(arr, x, idx + 1, fsf);
        }

        if (arr[idx] == x) {
            indices[fsf] = idx;
        }

        return indices; // Just the reference keeps getting returned. No new array created everytime. Hence, efficient.
    }

    private static int[] allIndicesTheir(int[] arr, int x, int idx, int fsf) {
        if(idx == arr.length){
            return new int[fsf];
        }

        int[] iArr;

        if(arr[idx] == x){
            iArr = allIndicesTheir(arr, x, idx + 1, fsf + 1);
            iArr[fsf] = idx;
        } else {
            iArr = allIndicesTheir(arr, x, idx + 1, fsf);
        }

        return iArr;
    }
}
