package kw9.collections.list.slllinkedlist;

import kw9.collections.list.MyAbstractList;
import kw9.collections.list.baselinkedlist.Abstract_B_ListTest_Contains;
import kw9.collections.list.linkedlist.SinglyLinkedList;

public class SLL_B_Test_Contains extends Abstract_B_ListTest_Contains {

	@Override
	protected MyAbstractList<Integer> getListInstance() {
		return new SinglyLinkedList<Integer>();
	}
	
}
