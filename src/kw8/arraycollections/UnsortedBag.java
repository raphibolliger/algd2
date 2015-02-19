package kw8.arraycollections;

import java.util.Arrays;

public class UnsortedBag<E> extends AbstractArrayCollection<E> {
	public static final int DEFAULT_CAPACITY = 100;

    private Object[] data;
    private int size;

	public UnsortedBag() {
		this(DEFAULT_CAPACITY);
	}

	public UnsortedBag(int capacity) {
		data = new Object[capacity];
	}

	@Override
	public boolean add(E e) {
        if (e == null) throw new NullPointerException();
        if (size >= data.length) throw new IllegalStateException();
        data[size] = e;
        size++;
        return true;
	}

	@Override
	public boolean remove(Object o) {

        if (size == 0 || !contains(o)){
            return false;
        }

        int index = indexOf(o);

        for (int i = index; i < size-1; i++){
            data[i] = data[i+1];
        }
        data[size-1] = null;
        size--;
        return true;
	}

    private int indexOf(Object o){
        for (int i = 0; i < size; i++){
            if (data[i].equals(o)) return i;
        }
        return -1;
    }

	@Override
	public boolean contains(Object o) {
        if (o == null) throw new NullPointerException();
		for (int i = 0; i < size; i++) {
            if (data[i].equals(o)) return true;
        }
        return false;
	}

	@Override
	public Object[] toArray() {
		return Arrays.copyOf(data, size());
	}

	@Override
	public int size() {
		return size;
	}

	public static void main(String[] args) {
		UnsortedBag<Integer> bag = new UnsortedBag<Integer>();
        bag.add(1);
        bag.add(2);
        bag.add(3);
        bag.add(4);
        bag.add(5);
        bag.remove(5);
        System.out.println(bag.contains(1));
		System.out.println(Arrays.toString(bag.toArray()));
	}
}
