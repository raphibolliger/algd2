package kw8.arraycollections.general;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

public abstract class AbstractBagTest extends AbstractCollectionTest {

	@Override
	protected void addNumbersToBag(Integer[] numbers) {
		for (Integer number : numbers) {
			assertTrue(bag.add(number));
		}
	}

    @Test
    public void removesOnlyOneInstance(){
        Integer[] numbers = new Integer[2];
        numbers[0] = new Integer(1);
        numbers[1] = new Integer(1);
        addNumbersToBag(numbers);
        assertTrue(bag.remove(new Integer(1)));
        assertTrue(bag.contains(new Integer(1)));
    }

}
