package Controllers;

import java.util.EmptyStackException;
import Models.NodeGeneric;

public class StackG<T> {

    private NodeGeneric<T> top;
    private int size;

    public StackG() {
        this.top = null;
        this.size = 0;
    }

    public void push(T value) {
        NodeGeneric<T> nNode1 = new NodeGeneric<T>(value);
        nNode1.setNext(top);
        top = nNode1;
        size++;
    }

    public int pop() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        int value = (Integer) top.getValue();
        top = top.getNext();
        size--;
        return value;

    }

    public int peek() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        int value = (Integer) top.getValue();
        return value;
    }

    public boolean isEmpty() {
        return top == null;
    }

    public void printStack() {
        NodeGeneric<T> aux = top;
        System.out.println("");
        while (aux != null) {
            System.out.print(aux.getValue() + " | ");
            aux = aux.getNext();
        }
    }

    public int size() {
        return size;
    }
}