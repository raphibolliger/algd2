package kw8.arraycollections;

import java.util.Arrays;

public class SortedBag<E extends Comparable<? super E>> extends	AbstractArrayCollection<E> {

    public static final int DEFAULT_CAPACITY = 100;
	private Object[] data;
    private int size;

	public SortedBag() {
		this(DEFAULT_CAPACITY);
	}

	public SortedBag(int capacity) {
		data = new Object[capacity];
	}

	@Override
	public boolean add(E e) {
        if (size >= data.length) throw new IllegalStateException();

        if (data[0] == null) {
            data[0] = e;
            size++;
            return true;
        }
        else {
            int index = 0;
            while (data[index] != null && e.compareTo((E)data[index]) >= 0) {
                index++;
            }
            for (int i = size; i > index; i--) {
                data[i] = data[i-1];
            }
            data[index] = e;
            size++;
            return true;
        }
	}

	@Override
	public boolean remove(Object o) {
        if (!contains(o) || size == 0) {
            return false;
        }

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
		return Arrays.binarySearch(data, 0, size, o) >= 0;
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
		SortedBag<Integer> bag = new SortedBag<Integer>();
		bag.add(2);
		bag.add(1);
		System.out.println(Arrays.toString(bag.toArray()));
	}
}
