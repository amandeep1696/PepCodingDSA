package stringdynamicstringanddynamicarray;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;

public class A06RemovePrimesFromArrayList {
    public static void main(String[] args) {
        // Calling an audible and watching vid 550 and 551 from playlist before doing this question

        // Vid 550 - Introduction to Arraylists in Java

        /*ArrayList<Integer> list = new ArrayList<>();
        System.out.println(list + " -> " + list.size());

        list.add(10);
        list.add(20);
        list.add(30);
        System.out.println(list + " -> " + list.size());

        list.add(1, 1000);
        System.out.println(list + " -> " + list.size());

        int val = list.get(1); // Can't use list[1] here
        System.out.println(val);

        list.set(1, 2000); // Can't use list[1] = 2000
        System.out.println(list + " -> " + list.size());

        list.remove(1);
        System.out.println(list + " -> " + list.size());

        ArrayList<String> l2 = new ArrayList<>();
        l2.add("Hello");
        l2.add("Dello");
        l2.add("Cello");
        System.out.println(l2 + " -> " + l2.size());

//        for (int i = 0; i < list.size(); i++) {
//            int value = list.get(i);
//            System.out.println(value);
//        }

        for (int value : list) {
            System.out.println(value);
        }*/


        // Vid 551 - Arraylists, Stacks and Queues in Java for C++ coders

        // Analyze the internals of ArrayLists and their time complexities.
        /*Stack<Integer> st = new Stack<>();
        st.push(10);
        st.push(20);
        st.push(30);
        System.out.println(st);
        st.push(40);
        System.out.println(st);

        System.out.println(st.peek()); // Just returns
        System.out.println(st);

        System.out.println(st.pop()); // Returns as well as removes unlike C++ which did not return but just removed
        System.out.println(st);*/

        /*ArrayDeque<Integer> queue = new ArrayDeque<>();
        queue.addLast(10);
        queue.addLast(20);
        queue.addLast(30);
        System.out.println(queue);

        queue.addLast(40);
        System.out.println(queue);

        System.out.println(queue.getFirst()); // Just returns
        System.out.println(queue);

        System.out.println(queue.removeFirst()); // Removes and returns
        System.out.println(queue);*/


        // Solving question

        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        ArrayList<Integer> list = new ArrayList<>(n); // Mentioning initial capacity. Not needed though.
        for (int i = 0; i < n; i++) {
            list.add(scn.nextInt());
        }
        solution(list);
        System.out.println(list);
    }

    private static void solution(ArrayList<Integer> list) {
//        for (int i = 0; i < list.size(); i++) {
//            if (isPrime(list.get(i))) {
//                list.remove(i); // On removal the indices change. This can cause issues.
//            }
//        }

        // In arraylist whenever you are doing removals, start the loop from end.
        // Doing this will ensure that we do not skip any index when doing removals.
        // This is because removal only affects indices on the right side of removed element. Left indices remain same.

        for (int i = list.size() - 1; i >= 0; i--) {
            if (isPrime(list.get(i))) {
                list.remove(i);
            }
        }
    }

    private static boolean isPrime(int num) {
//        if (num == 0 || num == 1) {
//            return false;
//        }

        // Based on Judge 1 is prime

        for (int div = 2; div * div <= num; div++) {
            if (num % div == 0) {
                return false;
            }
        }
        return true;
    }
}
