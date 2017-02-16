package algorytmy.structures;

/**
 * Created by RENT on 2017-02-15.
 */
public class MyList implements MyListInterface {

    private int[] array;
    private final int INITIAL_SIZE = 10;
    private int size;

    public MyList() {

        this.array = new int[INITIAL_SIZE];
        this.size = 0;
    }

    public void put(int index, int value) {

        if (checkIndex(index)) {
            this.array[index] = value;
        }
    }

    public void add(int index, int value) {

        if (checkIndex(index)) {
            if (this.size >= this.array.length) {
                doubleCapacity();
            }
            for (int i = this.size; i > index; i--) {
                this.array[i] = this.array[i - 1];
            }
            this.size++;
            this.array[index] = value;
        }
    }

    public void addAll(MyListInterface myList) {

        for (int i = 0; i < myList.getSize(); i++) {
            this.add(myList.get(i));

        }
    }

    public void addAll(int index, MyListInterface myList) {

        for (int i = 0; i < myList.getSize(); i++) {
            add(index + i, myList.get(i));
        }
    }


    public int get(int index) {

        if (checkIndex(index)) {
            return array[index];
        } else {
            System.out.println("Wrong index");
            return 0;
        }
    }

    private boolean checkIndex(int index) {
        return index >= 0 && index <= size;
    }

    public void add(int value) {
        if (size == array.length) {
            doubleCapacity();
        }
        array[size] = value;
        size++;
    }

    public void delete(int index) {
        if (checkIndex(index)) {
            for (int i = index; i < size - 1; i++) {
                swap(index, index + 1);
            }
            size--;
        }
    }

    public void swap(int index1, int index2) {
        int tmp = this.array[index1];
        this.array[index1] = this.array[index2];
        this.array[index2] = tmp;

    }


    public MyList clone() {
        MyList myList = new MyList();
        myList.array = rewrite(new int[this.array.length]);
        myList.size = this.size;
        return myList;
    }

    @Override
    public int getSize() {
        return size;
    }

    public void doubleCapacity() {
        int[] tmpArray = new int[size * 2];
        this.array = rewrite(tmpArray);
    }

    private int[] rewrite(int[] tmpArray) {
        for (int i = 0; i < array.length; i++) {
            tmpArray[i] = this.array[i];
        }
        return tmpArray;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("[");
        for (int i = 0; i < this.size; i++) {
            stringBuilder.append(array[i]);
            if (i != size - 1) {
                stringBuilder.append(", ");
            }
        }
        stringBuilder.append(" ]");
        return stringBuilder.toString();
    }
}