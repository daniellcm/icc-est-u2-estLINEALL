package Controllers;

import java.util.EmptyStackException;
import Models.NodeGeneric;

public class QueueG<Persona> {

    private NodeGeneric<Persona> primero; // head - front
    private NodeGeneric<Persona> ultimo; // back - rear - taill
    private int size;

    public QueueG() {
        this.primero = null;
        this.ultimo = null;
        this.size = 0;
    }

    public void add(Persona value) {
        NodeGeneric<Persona> newNode = new NodeGeneric<Persona>(value);
        if (isEmpty()) {
            primero = newNode;
            ultimo = newNode;
        } else {
            ultimo.setNext(newNode);
            ultimo = newNode;
        }
        size++;
    }

    public Persona remove() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }

        Persona aux = primero.getValue();
        primero = primero.getNext();
        size--;
        return aux;
    }

    public Persona peek() {
        if (isEmpty())
            throw new EmptyStackException();
        return primero.getValue();
    }

    public void printCola() {
        NodeGeneric<Persona> rep = primero;
        while (rep != null) {
            System.out.print(rep.getValue() + " ");
            rep = rep.getNext();
        }
        System.out.println();
    }

    public Persona findByName() {
        NodeGeneric<Persona> rep = primero;

    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return primero == null;
    }

}
