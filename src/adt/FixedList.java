package adt;

public class FixedList<T> implements List<T> {
    private Node lastNode;
    private final int fix_size;
    private int list_size;

    public FixedList(int size) {
        this.lastNode = null;
        fix_size = size;
        list_size = 0;
    }

    public void insert(int number) {
        Node newNode = new Node(number);
        if (isEmpty()){
            newNode.next = newNode;
        } else if (isFull()){
            return;
        } else {
            newNode.next = lastNode.next;
            lastNode.next = newNode;
        }
        list_size++;
        lastNode = newNode;
    }

    public boolean isFull() {
        return list_size > fix_size;
    }

    public boolean isEmpty() {
        return lastNode == null;
    }

    @Override
    public String toString() {
        String str = "";
        Node currentNode = null;
        if (!isEmpty()){
            currentNode = lastNode.next;
        }
        do{
            str += currentNode.data + ", ";
            currentNode = currentNode.next;
        }while(currentNode != lastNode.next);

        return "[" + str.substring(0, str.length() - 2) + "]";
    }

    private class Node {
        private final int data;
        private Node next;

        public Node(int data) {
            this.data = data;
        }
    }
}
