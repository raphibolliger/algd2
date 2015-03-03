package kw9.collections.list.dlliterator;

import kw9.collections.list.DoublyLinkedListFactory;
import kw9.collections.list.MyAbstractList;
import kw9.collections.list.baseiterator.Abstract_A_ListIterator_SimpleIteration;

/**
 * Checks simple iteration over empty and integer list.
 * 
 * @author Michael
 */
public class A_DLL_Iterator_SimpleIteration extends
        Abstract_A_ListIterator_SimpleIteration {

	@Override
	protected MyAbstractList<Integer> createInstance() {
		return DoublyLinkedListFactory.createInstance();
	}

}
