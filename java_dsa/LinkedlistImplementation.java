package java_dsa;

public class LinkedlistImplementation {
    /**
     * Node
     */
    public static class Node {
        int data;
        Node next = null;

        // constructor to initialize the node with given value and pointer.
        Node(int data) {
            this.data = data;
        }
        /**
         * linkedlist
         */

    }

    public static  class linkedlist {
        Node head = null;
        Node tail = null;

        void insertAtEnd(int val) {
            Node temp = new Node(val);
            if (head == null) {
                head = temp;
            } else {
                tail.next = temp;
            }
            tail = temp;
        }

        // print all nodes in a list
        // time complexity O(n), space complexity O(1).
        void insertAtBeg(int val) {
            Node temp = new Node(val);
            // check for empty case, where we have only one element.
            if (head == null) {
                head = temp;
            } else {
                temp.next = head;
            }
            head = temp;
        }

        void display() {
            Node temp;
            temp = head;
            while (temp != null) {
                System.out.println(temp.data);
                temp = temp.next;
            }
        }

        int size() {
            int count = 0;
            Node temp;
            temp = head;
            while (temp != null) {
                count++;
                temp = temp.next;
            }
            return count;
        }
    }

    public static void main(String[] args) {
        linkedlist ll =new linkedlist();
        // inserting elements at end of LL using insertion method.
        ll.insertAtEnd(6);
        ll.insertAtEnd(8);
        ll.insertAtEnd(78);
        ll.insertAtEnd(62);
        ll.insertAtEnd(45);
        ll.insertAtEnd(96);
        ll.insertAtEnd(80);
        ll.insertAtEnd(26);
        ll.insertAtBeg(69);
        // printing the inserted values
        ll.display();
        // finding length/size of LL
        System.out.println("Size: " + ll.size());
        // System.out.println(ll.head);

    }
}
