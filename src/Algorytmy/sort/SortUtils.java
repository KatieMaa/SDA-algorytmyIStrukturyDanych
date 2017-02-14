package Algorytmy.sort;

/**
 * Created by RENT on 2017-02-14.
 */
public class SortUtils {
    public static void swap(int[] array, int index1, int index2) {
        int tmp = array[index1];
        array[index1] = array[index2];
        array[index2] = tmp;
    }
}
