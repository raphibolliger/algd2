package kw9.collections.list.dlllinkedlist;

import kw9.collections.list.DoublyLinkedListFactory;
import kw9.collections.list.MyAbstractList;
import kw9.collections.list.baselinkedlist.Abstract_A_ListTest_Add;


/**
 * Tests adding numbers to the list. Doesn't matter if head or tail add.
 * 
 * @author Michael
 */
public class DLL_A_Test_Add extends Abstract_A_ListTest_Add {

	@Override
	protected MyAbstractList<Integer> getListInstance() {
		return DoublyLinkedListFactory.createInstance();
	}

}
