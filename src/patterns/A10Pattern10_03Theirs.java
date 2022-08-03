package patterns;

import java.util.Scanner;

public class A10Pattern10_03Theirs {
    public static void main(String[] args) {
        // They saw pattern of outer and inner space
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        int nos = n / 2;
        int nis = -1;

        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= nos; j++){
                System.out.print("\t");
            }
            System.out.print("*\t");

            for(int j = 1; j <= nis; j++){
                System.out.print("\t");
            }
            if(i > 1 && i < n){
                System.out.print("*\t");
            }

            if(i <= n / 2){
                nos--;
                nis += 2;
            } else {
                nos++;
                nis -= 2;
            }

            System.out.println();
        }
    }
}
