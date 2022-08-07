package stringdynamicstringanddynamicarray;

import java.util.Scanner;

public class A01IntroductionToStringsStringBuilderAndArrayList {
    public static void main(String[] args) {
//        String s1 = "Hello World";
        String s2 = new String("Hello World");
        System.out.println(s2);
//        System.out.println(s1);

        Scanner scn = new Scanner(System.in);
//        String s1 = scn.next(); // Reads till newline or space
//        String s2 = scn.next();
//        System.out.println(s1);
//        System.out.println(s2);

//        String s1 = scn.nextLine(); // Reads till newline
//        String s2 = scn.nextLine();
//        System.out.println(s1);
//        System.out.println(s2);

//        String s = scn.nextLine();
//        System.out.println(s);
//        System.out.println(s.length()); // In array length is data member. In string length is function.
//
//        char ch = s.charAt(2);
//        System.out.println(ch);
//
//        for (int i = 0; i < s.length(); i++) {
//            char ch1 = s.charAt(i);
//            System.out.println(ch1);
//        }
//
//        // There is nothing like setChar in string. In Java string is immutable.
//

        //String s = "abcd";
//        System.out.println(s.substring(1,3)); // EndIndex not included
//        System.out.println(s.substring(0,0)); // Blank
//        System.out.println(s.substring(0,1)); // First character
//        System.out.println(s.substring(0,2));
//        System.out.println(s.substring(1)); // Till end

        // Print all substrings
//        for (int beginIndex = 0; beginIndex < s.length(); beginIndex++) {
//            for (int endIndex = beginIndex + 1; endIndex <= s.length(); endIndex++) {
//                System.out.println(s.substring(beginIndex, endIndex));
//            }
//        }

        // String addition
//        String s1 = "hello";
//        String s2 = "world";
//        String s3 = s1 + " " + s2;
//        System.out.println(s3);
//        s1 += ' ';
//        s1 += 'w';
//        s1 += 'o';
//        System.out.println(s1);
//        s1 += "dsffds";
//        System.out.println(s1);
//        s1 += 10; // Will convert 10 to string and add
//        System.out.println(s1);
//
//        System.out.println("hello" + 10 + 20); // Because of left to eight evaluation it prints hello1020
//        // First hello and 10 are added. 10 is converted to string. Then hello10 and 20 are added.
//        System.out.println(10 + 20 + "hello"); // Prints 30hello

//        String s = "abc def ghi jkl mno";
//        String[] parts = s.split(" ");
//        for (int i = 0; i < parts.length; i++) {
//            System.out.println(parts[i]);
//        }

        String s1 = "abc,def,ghi,jkl mno";
        String[] parts1 = s1.split(",");
        for (String part : parts1) {
            System.out.println(part);
        }
    }
}
