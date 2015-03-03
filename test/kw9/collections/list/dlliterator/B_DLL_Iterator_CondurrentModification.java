package kw9.collections.list.dlliterator;

import kw9.collections.list.DoublyLinkedListFactory;
import kw9.collections.list.MyAbstractList;
import kw9.collections.list.baseiterator.Abstract_B_ListIterator_CondurrentModification;

public class B_DLL_Iterator_CondurrentModification extends
        Abstract_B_ListIterator_CondurrentModification {

	@Override
	protected MyAbstractList<Integer> createInstance() {
		return DoublyLinkedListFactory.createInstance();
	}
}
