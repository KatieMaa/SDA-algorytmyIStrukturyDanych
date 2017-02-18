package test.algorytmy.structures;

import algorytmy.structures.MyLinkedList;
import algorytmy.structures.MyList;
import algorytmy.structures.MyListInterface;

/**
 * Created by RENT on 2017-02-16.
 */
public class MyLinkedListTests {

    public static void main(String[] args) {

        MyListInterface myLinkedList = new MyLinkedList();
        System.out.println((myLinkedList.get(0)) + myLinkedList.toString());

        myLinkedList.add(5);
        System.out.println(myLinkedList.get(0));

        myLinkedList.add(3);
        myLinkedList.add(5);
        myLinkedList.add(-2);
        myLinkedList.add(-1);
        myLinkedList.add(-3);
        myLinkedList.add(6);
        System.out.println(myLinkedList);
        myLinkedList.delete(3);
        System.out.println();
        System.out.println("After removing 3rd element: \n" + myLinkedList);
        System.out.println();

        myLinkedList.put(3, 333);
        System.out.println(myLinkedList);
        System.out.println();

        MyListInterface someList = new MyList();
        someList.add(2);
        someList.add(4);
        someList.add(-2);
        System.out.println("Before and after adding some list");
        System.out.println(myLinkedList);
        myLinkedList.addAll(someList);
        System.out.println(myLinkedList);
        System.out.println();

        MyListInterface clonedList = myLinkedList.clone();
        clonedList.delete(2);
        System.out.println("After removing value from cloned list");
        System.out.println(myLinkedList);
        System.out.println(clonedList);
        System.out.println();

        System.out.println("Before and added element at index 2");
        System.out.println(myLinkedList);
        myLinkedList.add(2, 555);
        System.out.println(myLinkedList);
        myLinkedList.add(0, 1234132);
        System.out.println(myLinkedList);

        System.out.println("Before and after added all into");
        System.out.println(myLinkedList);
        myLinkedList.addAll(2, someList);
        System.out.println(myLinkedList);

    }
}
