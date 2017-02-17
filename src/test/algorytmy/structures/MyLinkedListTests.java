package test.algorytmy.structures;

import algorytmy.structures.MyLinkedList;
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

        MyListInterface otherList = new MyLinkedList();
        otherList.add(1);
        otherList.add(1);
        otherList.add(1);
        otherList.add(1);
        otherList.add(1);

        myLinkedList.addAll(1, otherList);

    }
}
