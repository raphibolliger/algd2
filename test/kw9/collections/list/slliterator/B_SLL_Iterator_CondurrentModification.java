package kw9.collections.list.slliterator;

import kw9.collections.list.MyAbstractList;
import kw9.collections.list.baseiterator.Abstract_B_ListIterator_CondurrentModification;
import kw9.collections.list.linkedlist.SinglyLinkedList;

public class B_SLL_Iterator_CondurrentModification extends
        Abstract_B_ListIterator_CondurrentModification {

	@Override
	protected MyAbstractList<Integer> createInstance() {
		return new SinglyLinkedList<Integer>();
	}

}
