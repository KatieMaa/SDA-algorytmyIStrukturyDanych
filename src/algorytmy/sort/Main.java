package algorytmy.sort;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

/**
 * Created by RENT on 2017-02-22.
 */
public class Main {

    public static void main(String[] args) {
        Sort bubbleSort = new BubbleSort();
        Sort countSort = new CountSort();
        Sort selectionSort = new SelectionSort();

        List<Sort> sorterList = new ArrayList<>();
        sorterList.add(bubbleSort);
        sorterList.add(selectionSort);
        sorterList.add(countSort);

        int[] listToSort = new int[100];
        for (int i = 0; i < 100; i++) {
            Random rand = new Random();
            listToSort[i] = rand.nextInt(100);
        }

        List<int[]> listOfResults = new ArrayList<>();

        for (Sort sorter : sorterList) {
            listOfResults.add(sorter.ascSort(listToSort));
        }
        for (int[] result : listOfResults) {
            System.out.println(Arrays.toString(result));
        }
    }
}
