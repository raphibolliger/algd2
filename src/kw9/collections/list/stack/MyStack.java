package kw9.collections.list.stack;

import kw9.collections.list.linkedlist.MyLinkedList;

import java.util.EmptyStackException;

public class MyStack<E> implements IStack<E> {

    private MyLinkedList<E> stack = new MyLinkedList<E>();

	@Override
	public E pop() {
        if (empty()) throw new EmptyStackException();
		return stack.remove(0);
	}

	@Override
	public E push(E item) {
		stack.add(0, item);
        return item;
	}

	@Override
	public E peek() {
        if (empty()) throw new EmptyStackException();
		return stack.get(0);
	}

	@Override
	public boolean empty() {
		boolean test = stack.size() <= 0;
        return test;
	}

	public static void main(String[] args) {
		MyStack<Integer> stack = new MyStack<Integer>();
		System.out.println("Pushing numbers to stack (0 to 9)");
		for (int i = 0; i < 10; i++) {
			stack.push(i);
		}
		System.out.println("Pop numbers from stack");
		while (!stack.empty()) {
			System.out.println(stack.pop());
		}
	}
}
