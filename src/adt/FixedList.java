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
    
    @Override
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

    @Override
    public boolean isFull() { return false; }

    @Override
    public boolean isEmpty() { return false; }

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
