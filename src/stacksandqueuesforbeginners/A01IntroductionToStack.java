package stacksandqueuesforbeginners;

import java.util.Stack;

public class A01IntroductionToStack {
    public static void main(String[] args) {
        // If there is nothing in stock then peek and pop will give runtime error
        Stack<Integer> st = new Stack<>();

        st.push(10);
        st.push(20);
        System.out.println(st);

        st.push(30);
        System.out.println(st);

        st.push(40);
        System.out.println(st);

        System.out.println(st.peek() + " " + st.size());

        st.pop();
        System.out.println(st.peek() + " " + st.size());

        st.pop();
        System.out.println(st.peek() + " " + st.size());

        st.pop();
        System.out.println(st.peek() + " " + st.size());
    }
}
