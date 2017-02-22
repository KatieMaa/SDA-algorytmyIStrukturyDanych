package algorytmy.sort;

import java.util.Arrays;

/**
 * Created by RENT on 2017-02-14.
 */
public class BubbleSort implements Sort {
    public static void main(String[] args) {
        BubbleSort bubbleSort = new BubbleSort();
        int[] array = {2, 5, 1, -5, 3, 7, -2, 0, 3, 8, 7, 6};
        int[] sortedArray = bubbleSort.ascSort(array);
        System.out.println(Arrays.toString(bubbleSort.ascSort(array)));
        System.out.println(Arrays.toString(bubbleSort.descSort(array)));
    }


    @Override
    public int[] ascSort(int[] array) {
        int counter = 0;
        boolean flag = true;
        for (int i = 0; i < array.length - 1; i++) {
            flag = true;
            for (int j = 0; j < array.length - 1 - i; j++) {
                counter++;
                if (array[j] > array[j + 1]) {
                    SortUtils.swap(array, j, j + 1);
                    flag = false;
                }
            }
            if (flag) {
                break;
            }
        }
        System.out.println(counter);
        return array;
    }

    @Override
    public int[] descSort(int[] array) {
        int counter = 0;
        boolean flag = true;
        for (int i = 0; i < array.length - 1; i++) {
            flag = true;
            for (int j = 0; j < array.length - 1 - i; j++) {
                counter++;
                if (array[j] < array[j + 1]) {
                    SortUtils.swap(array, j, j + 1);
                    flag = false;
                }
            }
            if (flag) {
                break;
            }
        }
        System.out.println(counter);
        return array;
    }
}
