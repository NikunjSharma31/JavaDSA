package linkedlist;

public class Mover {
    Node head;
    int size;

    Mover() {
        this.size = 0;
    }

    class Node {
        Node next;
        int val;

        Node(int val) {
            this.val = val;
        }

        Node(int val, Node next) {
            this.val = val;
            this.next = next;
        }
    }

    public void insert(int val) {
        Node node = new Node(val);
        if (head == null) {
            head = node;
            return;
        }
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = node;
    }

    void display() {
        Node current = head;
        while (current != null) {
            System.out.print(current.val + " -> ");
            current = current.next;
        }
        System.out.println("End");
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5 };
        int n = arr.length;
        Mover obj = new Mover();
        for (int i = 0; i < n; i++) {
            obj.insert(arr[i]);
        }
        System.out.println("The Array to Linked list is :");
        obj.display();

    }
}
