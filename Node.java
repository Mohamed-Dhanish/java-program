


class Node {
    int data;
    Node next;
    Node(int data){
        this.data = data;
        this.next = null;
    }
}

class Stack {
    private Node head;
    public Stack() {
        this.head = null;
    }
    public boolean isEmpty() {
        return head == null;
    }
    public void push(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
        System.out.println(newNode + "pushed onto the stack");
    }
    public int pop() {
        if(isEmpty()) {
            System.out.println("Stack underflow.");
            return -1;
        }
        int popped = head.data;
        head = head.next;
        System.out.println(popped + "pushed from the stack");
        return popped;
    }
    public int peek() {
        if(isEmpty()) {
            System.out.println("Stack is empty.");
            return -1;
        }
        return head.data;
    }
    public int display() {
        if(isEmpty()) {
            System.out.println("Stack is empty.");
            return -1;
        } else {
            Node current = head;
            while(current != null) {
                System.out.print(current + " ");
                current = current.next;
            }
        }
        System.out.println();
        return -1;
    }
}

public class node {
    public static void main(String[] args) {
        Stack st = new Stack();
        st.push(10);
        st.push(20);
        st.push(30);
        st.display();
        System.out.println("peek element" + st.peek());
        st.pop();
        st.pop();
        st.display();
        st.pop();
    }
    
}