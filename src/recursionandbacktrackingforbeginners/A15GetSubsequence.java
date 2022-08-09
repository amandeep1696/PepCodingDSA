package recursionandbacktrackingforbeginners;

import java.util.ArrayList;
import java.util.Scanner;

public class A15GetSubsequence {
    // 0 <= str.length <= 20
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String s = scn.next();
        ArrayList<String> ans = gss(s);
        System.out.println(ans);
    }

    private static ArrayList<String> gss(String str) {
        ArrayList<String> subsequences = new ArrayList<>();
        if (str.length() == 0) {
            return subsequences;
        }

        StringBuilder sb = new StringBuilder();
        gssHelper(str, 0, subsequences, sb);
        return subsequences;
    }

    private static void gssHelper(String str, int index, ArrayList<String> subsequences, StringBuilder sb) {
        if (index == str.length()) {
            subsequences.add(sb.toString());
            return;
        }

        gssHelper(str, index + 1, subsequences, sb);
        sb.append(str.charAt(index));
        gssHelper(str, index + 1, subsequences, sb);
        sb.deleteCharAt(sb.length() - 1);
    }

    private static void gssHelperDifferentOrder(String str, int index, ArrayList<String> subsequences, StringBuilder sb) {
        if (index == str.length()) {
            subsequences.add(sb.toString());
            return;
        }

        sb.append(str.charAt(index));
        gssHelperDifferentOrder(str, index + 1, subsequences, sb);
        sb.deleteCharAt(sb.length() - 1);
        gssHelperDifferentOrder(str, index + 1, subsequences, sb);
    }
}
