package com.bootcamp.java.stacks;

import java.util.ArrayList;
import java.util.List;

/*
    Implement a queue using a single stack (and call stack)
 */
public class OneStackAsQueue<E> implements Queue<E> {
    private final Stack<E> stack;

    private final List<E> arr = new ArrayList<>();

    public OneStackAsQueue() {
        this.stack = new StackImpl<>();
    }

    @Override
    public boolean offer(E e) {
        arr.add(e);
        return true;
    }

    @Override
    public E poll() {
        if (stack.empty()){
            transfer();
        }

        return stack.pop();
    }

    private void transfer () {
        if (arr.isEmpty()) {
            stack.push(null);
            return;
        }

        for (int i = arr.size() - 1; i >= 0 ; i--) {
            stack.push(arr.get(i));
        }
    }
}
