package kw8.arraycollections;

import java.util.Arrays;
import java.util.Set;

public class SortedSet<E extends Comparable<? super E>> extends AbstractArrayCollection<E> implements Set<E> {

	public static final int DEFAULT_CAPACITY = 15;

	private Object[] data;
	private int size;

	public SortedSet()
	{
		this(DEFAULT_CAPACITY);
	}

	public SortedSet(int capacity)
	{
		data = new Object[capacity];
	}

	@Override
	public boolean add(E e)
	{
		if (size >= data.length) throw new IllegalStateException();
		if (contains(e)) return false;


        if (data[0] == null) {
            data[0] = e;size++;return true;
        }

        int index = 0;
        while (data[index] != null && e.compareTo((E)data[index]) != -1) {
            index++;
        }

        for (int i = size; i > index; i--) {
            data[i] = data[i-1];
        }

        data[index] = e;
        size++;
        return true;
	}

	@Override
	public boolean remove(Object o)
	{
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
	public boolean contains(Object o)
	{
		return Arrays.binarySearch(data, 0, size, o) >= 0;
	}

	@Override
	public Object[] toArray()
	{
		return Arrays.copyOf(data, size());
	}

	@Override
	public int size()
	{
		return size;
	}

	public static void main(String[] args)
	{
		SortedSet<Integer> bag = new SortedSet<Integer>();
		bag.add(2);
		bag.add(2);
		bag.add(1);
		bag.add(6);
		bag.add(3);
		bag.add(4);
		bag.add(8);
		bag.add(1);
		bag.remove(4);
        bag.remove(1);
        bag.remove(4);
		System.out.println(Arrays.toString(bag.toArray()));
	}
}
