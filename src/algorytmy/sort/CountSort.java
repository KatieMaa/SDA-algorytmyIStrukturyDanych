package algorytmy.sort;

import java.util.Arrays;

/**
 * Created by RENT on 2017-02-14.
 */
public class CountSort implements Sort {

    public static void main(String[] args) {

        CountSort countSort = new CountSort();
        int[] array = {1, 2, 4, 5, 6, 7, -7, -8, -3, -2, 4, 6, 5, 2, 0, 0};

        System.out.println(Arrays.toString(countSort.ascSort(array)));
    }

    public int[] ascSort(int[] array) {

        int max = SortUtils.max(array);
        int min = SortUtils.min(array);
        int range = max - min + 1;
        int[] rangeArray = new int[range];
        for (int i = 0; i < array.length; i++) {
            rangeArray[array[i] - min]++;
        }
        int index = 0;
        for (int i = 0; i < rangeArray.length; i++) {
            for (int j = 0; j < rangeArray[i]; j++) {
                array[index] = i + min;
                index++;
            }
        }
        return array;
    }

    public int[] descSort(int[] array) {
        int[] tempArray = ascSort(array);
        int[] result = new int[tempArray.length];
        for (int i = 0; i < tempArray.length; i++) {
            result[i] = tempArray[tempArray.length - i - 1];
        }
        return result;
    }
}