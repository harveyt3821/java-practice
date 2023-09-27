package com.bootcamp.java.stacks;

/*
    Implement a queue using two stacks
 */
public class TwoStackAsQueue<E> implements Queue<E> {
    private final Stack<E> stack1;
    private final Stack<E> stack2;

    public TwoStackAsQueue() {
        stack1 = new StackImpl<>();
        stack2 = new StackImpl<>();
    }

    @Override
    public boolean offer(E o) {
        stack1.push(o);

        return true;
    }

    @Override
    public E poll() {
        if (stack1.empty() && stack2.empty()) {
            return null;
        }

        if (!stack1.empty()) {
            stack1ToStack2();
        }

//        for additional items added to queue after polling all item from queue.
//        if (!stack1.empty() && stack2.empty()) {
//            stack1ToStack2();
//        }

        return stack2.pop();
    }

    private void stack1ToStack2 () {
        if (stack1.empty()) throw new EmptyStackException();

        var capacity1 = stack1.size();

        while (stack1.size() > 0) {
            stack2.push(stack1.pop());
        }

        if ( stack2.size() != capacity1 ) throw new IllegalStateException();
    }
}
