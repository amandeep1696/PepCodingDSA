package gettingstarted;

import java.util.Scanner;

public class A07TakeInputInJava {
    public static void main(String[] args) {
/*        Scanner scn = new Scanner(System.in);
//        int n = scn.nextInt();
//
//        for(int i = 0; i <= n; i++) {
//            System.out.println(i);
//        }

        String name = scn.nextLine();
        System.out.println("Hello " + name);*/


        // Integer and String input in same program can give problems.
        // To deal with that take input as string but then convert to integer.

        Scanner scn = new Scanner(System.in);

        int n = Integer.parseInt(scn.nextLine());
        String s = scn.nextLine();

        System.out.println(n + " " + s);

    }
}
