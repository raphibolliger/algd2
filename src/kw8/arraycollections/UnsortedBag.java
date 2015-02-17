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

        while (contains(o)) {
            int index = Arrays.binarySearch(data, 0, size, o);
            for (int i = index; i < size-1; i++) {
                data[i] = data[i+1];
            }
            data[size-1] = null;
            size--;
        }

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
		UnsortedBag<Integer> bag = new UnsortedBag<Integer>();
		bag.add(2);
		bag.add(1);
        bag.add(2);
        bag.add(4);
        bag.remove(6);
		System.out.println(Arrays.toString(bag.toArray()));
	}
}
