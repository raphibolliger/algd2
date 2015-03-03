package kw9.collections.list.dlliterator;

import kw9.collections.list.DoublyLinkedListFactory;
import kw9.collections.list.MyAbstractList;
import kw9.collections.list.baseiterator.Abstract_C_ListIterator_RemoveElement;

public class C_DLL_Iterator_RemoveElement extends
        Abstract_C_ListIterator_RemoveElement {

	@Override
	protected MyAbstractList<Integer> createInstance() {
		return DoublyLinkedListFactory.createInstance();
	}

}
