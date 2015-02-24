package kw9.collections.list.linkedlist;

import java.util.Arrays;

import kw9.collections.list.MyAbstractList;

public class MyLinkedList<E> extends MyAbstractList<E> {

    private int size = 0;
	private Node<E> first;

	@Override
	public boolean add(E e) {

        if (first == null) {
            first = new Node<E>(e);
            ++size;
            return true;
        }

        Node<E> pointer = first;

        while (pointer.next != null){
            pointer = pointer.next;
        }

        pointer.next = new Node<E>(e);
        ++size;
        return true;

	}

	@Override
	public void add(int index, E element) {

        if (index < 0 || index > size) throw new IndexOutOfBoundsException();

        if (index == 0) {
            Node<E> temp = first;
            first = new Node<E>(element, temp);
            ++size;
            return;
        }

        Node<E> pointer = getNode(index-1);
        Node<E> after = pointer.next;
        ++size;

        pointer.next = new Node<E>(element, after);

	}

	@Override
	public boolean remove(Object o) {

        if (first == null) return false;

        if (first.elem.equals(o)){
            first = first.next;
            size--;
            return true;
        }

        Node<E> before = first;
        Node<E> pointer = first.next;

        while (pointer != null) {
            if (pointer.elem.equals(o)){
                before.next = pointer.next;
                --size;
                return true;
            }
            before = before.next;
            pointer = pointer.next;
        }

        return false;

	}

	@Override
	public E remove(int index) {

        if (first == null) throw new IndexOutOfBoundsException();
        if (index >= size) throw new IndexOutOfBoundsException();

        if (index == 0){
            Node<E> temp = first;
            first = first.next;
            --size;
            return temp.elem;
        }

        Node<E> before = getNode(index-1);
        Node<E> temp = before.next;
        before.next = temp.next;
        --size;

        return temp.elem;

	}

	@Override
	public boolean contains(Object o) {
        Node<E> pointer = first;
        while (pointer != null){
            if (pointer.elem.equals(o)) return true;
            pointer = pointer.next;
        }
        return false;
	}

	@Override
	public E get(int index) {
        if (first == null) throw new IndexOutOfBoundsException();

        Node<E> pointer = first;

        for (int i = 0; i < index; i++){
            pointer = pointer.next;
        }

        return pointer.elem;

	}

    private Node<E> getNode(int index){
        if (first == null) throw new IndexOutOfBoundsException();

        Node<E> pointer = first;

        for (int i = 0; i < index; i++){
            pointer = pointer.next;
        }

        return pointer;
    }

	@Override
	public Object[] toArray() {
		Object[] array = new Object[size];
		int index = 0;
		Node<E> current = first;
		while (current != null) {
			array[index++] = current.elem;
			current = current.next;
		}
		return array;
	}

	@Override
	public int size() {
		return size;
	}

	private static class Node<E> {

        private final E elem;
		private Node<E> next;

		private Node(E elem) {
			this.elem = elem;
		}

		private Node(E elem, Node<E> next) {
			this.elem = elem;
			this.next = next;
		}
	}

	public static void main(String[] args) {
		MyLinkedList<Integer> list = new MyLinkedList<Integer>();

        list.add(0, new Integer(5));
        list.add(0, new Integer(4));
        list.add(0, new Integer(3));
        list.add(0, new Integer(2));
        list.add(0, new Integer(1));

		System.out.println(Arrays.toString(list.toArray()));
	}
}
