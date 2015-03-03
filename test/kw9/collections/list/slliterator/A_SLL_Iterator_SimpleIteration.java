package kw9.collections.list.slliterator;

import kw9.collections.list.MyAbstractList;
import kw9.collections.list.baseiterator.Abstract_A_ListIterator_SimpleIteration;
import kw9.collections.list.linkedlist.SinglyLinkedList;

/**
 * Checks simple iteration over empty and integer list.
 * 
 * @author Michael
 */
public class A_SLL_Iterator_SimpleIteration extends
        Abstract_A_ListIterator_SimpleIteration {

	@Override
	protected MyAbstractList<Integer> createInstance() {
		return new SinglyLinkedList<Integer>();
	}

}
