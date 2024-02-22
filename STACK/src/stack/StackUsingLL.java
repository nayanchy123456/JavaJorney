package stack;

public class StackUsingLL {
    Node head = null;

    public class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null; // Corrected initialization
        }
    }

    public void push(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            newNode.next = head;
            head = newNode;
        }
    }

    public int pop() {
        if (head == null) {
            System.out.println("Stack is empty");
            return -1; // Return a default value indicating stack underflow
        } else {
            int poppedValue = head.data;
            head = head.next;
            System.out.println("the poped value is:" + poppedValue);
            return poppedValue;
        }
    }

    public void displayStack() {
        if (head == null) {
            System.out.println("Stack is empty");
            return;
        }
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }
    }

    public static void main(String[] args) {
        StackUsingLL stack = new StackUsingLL();
        stack.push(55);
        stack.push(554);
//        stack.pop();
        stack.displayStack();
    }
}

