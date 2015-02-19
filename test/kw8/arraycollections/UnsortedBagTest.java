package kw8.arraycollections;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

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

    @Test
    public void testLinearSearch(){
        Integer[] numbers = new Integer[]{6, 10, 8, 5, 1};
        addNumbersToBag(numbers);
        assertTrue(bag.contains(1));
    }
}
