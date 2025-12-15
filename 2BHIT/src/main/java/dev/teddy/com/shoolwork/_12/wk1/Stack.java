package dev.teddy.com.shoolwork._12.wk1;

public class Stack<T> {
    private Node<T> top;

    private static class Node<T> {
        final T data;
        Node<T> next;

        Node(T data) {
            this.data =data;
        }
    }

    public void push(T element) {
        Node<T> newNode = new Node<>(element);
        newNode.next = top;
        top = newNode;
    }

    public T peek() {
        if (isEmpty())
            return null;
        return top.data;
    }

    public T pop() {
        if (top == null)
            return null;
        T data = top.data;
        top = top.next;
        return data;
    }

    public boolean isEmpty() {
        return top == null;
    }

    @Override
    public String toString() {
        if (isEmpty())
            return "Stack[empty]";

        StringBuilder sb = new StringBuilder("Stack[");
        Node<T> current = top;
        while (current != null) {
            sb.append(current.data);
            if (current.next != null)
                sb.append(" -> ");
            current = current.next;
        }
        sb.append("]");
        return sb.toString();
    }
}
