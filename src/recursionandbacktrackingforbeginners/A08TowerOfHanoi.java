package recursionandbacktrackingforbeginners;

import java.util.Scanner;

public class A08TowerOfHanoi {
    public static void main(String[] args) {
        // 0 <= n <= 9 10 <= n1, n2, n3 <= 10^9 n1 != n2 != n3
        // Finally all disks should be in n2. n3 can be used as intermediate staging ting.
        // Let's say I have to do toh(3, A, B, C). I have faith that toh(2, A, B, C) works.
        // We have faith that tower of Hanoi function knows how to move two disks according to rules.
        // How can I use that to do toh(3, A, B, C)
        // We can use toh(2, A, C, B). We can assume it works. It will keep disk 1 and 2 on intermediate disk C.
        // This will be done following all the given instructions. We have faith it will do its job.
        // Now print instruction 3[A -> B]. Third disk is moved from A to B.
        // Now we can use toh(2, C, B, A). Take disks 1 and 2 from C and put them on B using A as intermediate disk.
        // This will be done following all the given instructions. We have faith it will do its job.
        // Can watch video again to revise.
        // Time complexity O(2^n). Space complexity O(n) recursion stack space.
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int n1 = scn.nextInt();
        int n2 = scn.nextInt();
        int n3 = scn.nextInt();

        printTowerOfHanoi(n, n1, n2, n3);
    }

    private static void printTowerOfHanoi(int numOfDisks, int id1, int id2, int id3) {
        if (numOfDisks == 0) {
            return;
        }

        // Will print instructions to move top n-1 disks to 3rd tower using 2nd as intermediate.
        printTowerOfHanoi(numOfDisks - 1, id1, id3, id2);

        // Instruction to  move largest disk from 1st tower to 2nd tower.
        System.out.println(numOfDisks + "[" + id1 + " -> " + id2 + "]");

        // Will print instructions to move n-1 disks to 2nd tower using 1st as intermediate.
        printTowerOfHanoi(numOfDisks - 1, id3, id2, id1);

    }
}
