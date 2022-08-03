package gettingstarted;

public class A04ConditionalsInJava {
    public static void main(String[] args) {
        /*
        int x = 10;

        if (x % 2 == 0) {
            System.out.println(x + " is even");
        }
        else {
            System.out.println(x + "is odd");
        }

        System.out.println("Hard work");
        */

        int n1 = 20;
        int n2 = 30;

        if (n1 == n2) {
            System.out.println("Equal");
        }
        else if (n1 > n2) {
            System.out.println("n1 greater");
        }
        else {
            System.out.println("n2 greater");
        }
    }
}
