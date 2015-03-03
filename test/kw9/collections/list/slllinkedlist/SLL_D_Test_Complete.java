package kw9.collections.list.slllinkedlist;

import kw9.collections.list.MyAbstractList;
import kw9.collections.list.baselinkedlist.Abstract_D_ListTest_Complete;
import kw9.collections.list.linkedlist.SinglyLinkedList;

/**
 * Additional Tests: - Order (list-semantic: Tail adding) by reference - add
 * element at specific position (indexoutofbounds check) - remove element from
 * specific position (indexoutofbounds check)
 * 
 * @author Michael
 */
public class SLL_D_Test_Complete extends Abstract_D_ListTest_Complete {
	@Override
	protected MyAbstractList<Integer> getListInstance() {
		return new SinglyLinkedList<Integer>();
	}

}
