package algorytmy;

import algorytmy.structures.MyList;
import algorytmy.structures.MyListInterface;


public class Application {

    public static void main(String[] args) {

        MyListInterface myList = initMyList();
        MyListInterface clonedList = myList.clone();

        System.out.println(myList);
        System.out.println(clonedList);
        System.out.println();

        clonedList.add(110);

        System.out.println(myList);
        System.out.println(clonedList);
        System.out.println();

        clonedList.delete(4);

        System.out.println(myList);
        System.out.println(clonedList);
        System.out.println();

        clonedList.add(3, 555);

        System.out.println(myList);
        System.out.println(clonedList);
        System.out.println();

        clonedList.put(3, 5555);

        System.out.println(myList);
        System.out.println(clonedList);
        System.out.println();


    }

    private static MyList initMyList() {

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
        return myList;

    }
}
