package stringdynamicstringanddynamicarray;

import java.util.Scanner;

public class A03StringCompression_02ReturnString {
    public static void main(String[] args) {
        // It can most likely be improved using StringBuilder. I'll do it again once I have the knowledge.
        // IntelliJ is giving suggestion to convert to StringBuilder.
        // We'll get the knowledge on all time complexities of StringBuilder compared to + operator for string.
        // From stackoverflow : Java compiler will convert '+' into StringBuilder to increase the performance
        // of repeated string concatenation. ts when you are concatenating in a loop compiler can't
        // substitute StringBuilder by itself that's when you should consider from concatenation to StringBuilder.
        // Some sources say s1.concat(s2) is the fastest. On further reading Ignore this.
        // Need more research into this. Maybe check how AlgoExpert does it. Is there a way like C++ to create
        // a character array of required size, create your answer in it and then return by converting to string.
        // At the point where you're concatenating in a loop -
        // that's usually when the compiler can't substitute StringBuilder by itself.

        /*
        The key is whether you are writing a single concatenation all in one place or accumulating it over time.

For the example you gave, there's no point in explicitly using StringBuilder.
(Look at the compiled code for your first case.)

But if you are building a string e.g. inside a loop, use StringBuilder.

To clarify, assuming that hugeArray contains thousands of strings, code like this:

String result = "";
for (String s : hugeArray) {
    result = result + s;
}

is very time- and memory-wasteful compared with:

StringBuilder sb = new StringBuilder();
for (String s : hugeArray) {
    sb.append(s);
}
String result = sb.toString();

StringBuilder doesn't need to re-create the String object over and over

Basically the conclusion is use StringBuilder for multiple appends. Basically in a loop use StringBuilder.
Otherwise, it won't make any difference as compiler converts += to StringBuilder anyways if it's outside loop.

https://redfin.engineering/java-string-concatenation-which-way-is-best-8f590a7d22a8
See the above article. Our conclusion is confirmed in it.
        * */

        // 1 <= length of string <= 1000
        Scanner scn = new Scanner(System.in);
        String str = scn.next();
        System.out.println(compression1(str));
        System.out.println(compression2(str));
    }

    private static String compression1(String str){
        String ans = str.charAt(0) + ""; // Added "" to make RHS string. Otherwise, can also do substring(0, 1)

        for (int i = 1; i < str.length(); i++) {
            char currentCharacter = str.charAt(i);
            char previousCharacter = str.charAt(i - 1);
            if (currentCharacter != previousCharacter) {
                ans += currentCharacter;
            }
        }

        return ans;
    }

    private static String compression2(String str){
        String ans = str.charAt(0) + "";
        int count = 1;

        for (int i = 1; i < str.length(); i++) {
            char currentCharacter = str.charAt(i);
            char previousCharacter = str.charAt(i - 1);
            if (currentCharacter != previousCharacter) {
                if (count > 1) {
                    ans += count;
                }
                count = 1;
                ans += currentCharacter;  // string += s.charAt is possible. string = s.charAt is invalid.
            } else {
                count++;
            }
        }
        if (count > 1) {
            ans += count;
        }

        return ans;
    }
}
