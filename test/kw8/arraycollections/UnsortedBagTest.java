package kw8.arraycollections;

import static org.junit.Assert.assertFalse;

import org.junit.Test;

import kw8.arraycollections.general.AbstractBagTest;

public class UnsortedBagTest extends AbstractBagTest {
	@Override
	protected AbstractArrayCollection<Integer> createIntegerCollection(int size) {
		return new UnsortedBag<Integer>(size);
	}

	@Override
	protected Integer[] getExpectedOrderFor(Integer[] values) {
		return values;
	}

	@Test
	public void containsOtherObject() {
		Integer[] numbers = new Integer[] { 1, 2, 3 };
		addNumbersToBag(numbers);
		assertFalse(bag.contains("Asdf"));
	}
}
