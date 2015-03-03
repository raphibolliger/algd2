package kw9.collections.list.slliterator;

import kw9.collections.list.MyAbstractList;
import kw9.collections.list.baseiterator.Abstract_C_ListIterator_RemoveElement;
import kw9.collections.list.linkedlist.SinglyLinkedList;

public class C_SLL_Iterator_RemoveElement extends
        Abstract_C_ListIterator_RemoveElement {

	@Override
	protected MyAbstractList<Integer> createInstance() {
		return new SinglyLinkedList<Integer>();
	}

}
