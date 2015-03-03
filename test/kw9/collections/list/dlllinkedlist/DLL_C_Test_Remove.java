package kw9.collections.list.dlllinkedlist;

import kw9.collections.list.DoublyLinkedListFactory;
import kw9.collections.list.MyAbstractList;
import kw9.collections.list.baselinkedlist.Abstract_C_ListTest_Remove;

public class DLL_C_Test_Remove extends Abstract_C_ListTest_Remove {
	@Override
	protected MyAbstractList<Integer> getListInstance() {
		return DoublyLinkedListFactory.createInstance();
	}

}
