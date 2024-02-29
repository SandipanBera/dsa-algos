package java_dsa;

import java.util.Stack;

public class Stackimplementation {
    public static void insertAtAnyIndex(int idx, int data, Stack<Integer> st) {
        Stack<Integer> temp = new Stack<>();
        while (st.size() > idx) {
            temp.push(st.pop());
        }
        st.push(data);
        while (!temp.isEmpty()) {
            st.push(temp.pop());
        }
        System.out.println(st);
    }
    public static void deleteAtAnyIndex(int idx, Stack<Integer> st) {
         Stack<Integer> temp = new Stack<>();
         while (st.size() > idx + 1) {
             temp.push(st.pop());
         }
         st.pop();
         while (!temp.isEmpty()) {
             st.push(temp.pop());
         }
         System.out.println(st);
    }
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);
        System.out.println(st);
        int idx=2;
        int data=6;
        insertAtAnyIndex(idx, data, st);
        deleteAtAnyIndex(idx, st);
        System.out.println(st.peek());
       

        
    }
    }
    

