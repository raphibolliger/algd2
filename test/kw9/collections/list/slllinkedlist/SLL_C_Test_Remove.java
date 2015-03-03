package kw9.collections.list.slllinkedlist;

import kw9.collections.list.MyAbstractList;
import kw9.collections.list.baselinkedlist.Abstract_C_ListTest_Remove;
import kw9.collections.list.linkedlist.SinglyLinkedList;

public class SLL_C_Test_Remove extends Abstract_C_ListTest_Remove {
	@Override
	protected MyAbstractList<Integer> getListInstance() {
		return new SinglyLinkedList<Integer>();
	}

}
