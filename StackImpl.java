package com.bootcamp.java.stacks;

import java.util.LinkedList;

public class StackImpl<E> implements Stack<E> {
    LinkedList<E> linkedList = new LinkedList<>();

    @Override
    public int size() {
        return linkedList.size();
    }

    @Override
    public boolean empty() {
        return size() == 0;
    }

    @Override
    public E push(E item) {
        linkedList.add(item);
        return item;
    }

    @Override
    public E pop() {
        if (empty()) throw new EmptyStackException();
        return linkedList.remove(linkedList.size() - 1);
    }

    @Override
    public E peek() {
        if (empty()) throw new EmptyStackException();
        return linkedList.get(linkedList.size() - 1);
    }
}
