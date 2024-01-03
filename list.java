package linkedlist;

public class list {
    Node head;
    Node tail;
    int size;

    list() {
        this.size = 0;
    }

    public void insert(int val) {
        Node node = new Node(val);
        node.next = head;
        head = node;
        if (tail == null) {
            tail = head;
        }
        size++;
    }

    public void insertLast(int val) {
        if (tail == null) {
            insert(val);
            return;
        }
        Node node = new Node(val);
        tail.next = node;
        tail = node;
        size++;
    }

    public void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.val + " -> ");
            temp = temp.next;
        }
        System.out.println("End");
    }

    public void insertAny(int val, int index) {
        if (index == 0) {
            insert(val);
            return;
        }
        if (index == size) {
            insertLast(val);
        }
        Node temp = head;
        for (int i = 1; i < index; i++) {
            temp = temp.next;
        }
        Node node = new Node(val, temp.next);
        temp.next = node;
        size++;
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

    public static void main(String[] args) {
        list obj = new list();
        obj.insert(3);
        obj.insert(13);
        obj.insert(12);
        obj.insert(45);
        obj.insert(56);
        obj.insert(90);
        obj.insert(333);
        obj.insertAny(99, 2);
        obj.display();
    }
}
