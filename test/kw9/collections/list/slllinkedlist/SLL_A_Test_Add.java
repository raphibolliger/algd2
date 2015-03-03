package kw9.collections.list.slllinkedlist;

import kw9.collections.list.MyAbstractList;
import kw9.collections.list.baselinkedlist.Abstract_A_ListTest_Add;
import kw9.collections.list.linkedlist.SinglyLinkedList;


/**
 * Tests adding numbers to the list. Doesn't matter if head or tail add.
 * 
 * @author Michael
 */
public class SLL_A_Test_Add extends Abstract_A_ListTest_Add {

	@Override
	protected MyAbstractList<Integer> getListInstance() {
		return new SinglyLinkedList<Integer>();
	}

}
