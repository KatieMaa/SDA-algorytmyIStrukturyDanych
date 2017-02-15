package Algorytmy;

import Algorytmy.structures.MyList;


public class Application {
    public static void main(String[] args) {
        MyList myList = new MyList();
        myList.add(2);
        myList.add(4);
        myList.add(-8);
        myList.add(3);
        myList.add(5);
        myList.add(-1);
        myList.add(-1);
        myList.add(7);
        myList.add(-2);
        myList.add(3);
        myList.add(-7);
        myList.add(4);
        myList.add(3);
        System.out.println(myList.get(9));
    }
}
