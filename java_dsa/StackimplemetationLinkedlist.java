package java_dsa;

public class StackimplemetationLinkedlist {
    /**
     * InnerStackimplemetationLinkedlist
     */
     static class Node {
        int data;
        Node next;
        public Node(int data) {
            this.data = data;
        }   
    }

    static class stack {
         Node head = null;
        // Push operation
        void push(int newData) {
            Node temp = new Node(newData);
            if (head == null) {
                head = temp;
   
            } else {
                temp.next = head;
                head = temp;
             
            }
        }

        void display() {
            Node ptr = head;
            while (ptr != null) {
                System.out.print(" " + ptr.data);
                ptr = ptr.next;
            }

        }
    }

 public static void main(String[] args) {
     // Create a new stack using linked list implementation.

     stack st = new stack();
     st.push(6);
     st.push(9);
     st.push(56);
     st.display();
 }   
}
