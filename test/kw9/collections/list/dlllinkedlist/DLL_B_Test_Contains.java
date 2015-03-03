package kw9.collections.list.dlllinkedlist;

import kw9.collections.list.DoublyLinkedListFactory;
import kw9.collections.list.MyAbstractList;
import kw9.collections.list.baselinkedlist.Abstract_B_ListTest_Contains;

public class DLL_B_Test_Contains extends Abstract_B_ListTest_Contains {

	@Override
	protected MyAbstractList<Integer> getListInstance() {
		return DoublyLinkedListFactory.createInstance();
	}
	
}
