package kw8.arraycollections;

import java.util.Arrays;
import java.util.Set;

public class UnsortedSet<E> extends AbstractArrayCollection<E> implements
		Set<E> {
	public static final int DEFAULT_CAPACITY = 100;
	private Object[] data;
    private int size;

	public UnsortedSet() {
		this(DEFAULT_CAPACITY);
	}

	public UnsortedSet(int capacity) {
		data = new Object[capacity];
	}

	@Override
	public boolean add(E e) {
        if (e == null) throw new NullPointerException();
        if (size >= data.length) throw new IllegalStateException();
        if (contains(e)) return false;

        data[size] = e;
        size++;
        return true;

	}

	@Override
	public boolean remove(Object o) {
        if (!contains(o) || size == 0) return false;

        int index = Arrays.binarySearch(data, 0, size, o);

        for (int i = index; i < size-1; i++) {
            data[i] = data[i+1];
        }

        data[size-1] = null;
        size--;
        return true;
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
		UnsortedSet<Integer> bag = new UnsortedSet<Integer>();
		bag.add(1);
		bag.add(1);
        bag.remove(1);
        System.out.println(bag.contains(1));
		System.out.println(Arrays.toString(bag.toArray()));
	}
}
