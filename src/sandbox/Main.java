package sandbox;

import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;

public class Main {

    public static void main(String[] args){

        LinkedList<Integer> list = new LinkedList<Integer>();

        list.add(1);
        list.add(2);
        list.add(3);

        Iterator<Integer> it = list.iterator();

        it.next();
        it.next();
        it.next();
        it.remove();

        System.out.println(Arrays.toString(list.toArray()));


    }

}
