package OrderHandling;

import java.util.Comparator;
import java.util.List;

/**
 * @author Semisi Rigby
 * Class to handle the sorting of objects with the use of a comparator class to handle the return logic.
 * @param <T>   Generic type to allow for implementing the Order class
 */
public class MergeSortOrders<T> {

    /**
     * Method for implementing the mergeSort algorithm for custom sorting via recursion
     * @param orderList     List of generic object types to be sorted
     * @param comparator    Comparator for generic types to handle the comparison logic
     */
    public void mergeSort(List<T> orderList, Comparator<T> comparator) {

        // base case for recursive calls
        if (orderList.size() <= 1) {
            return;
        }

        // find midpoint and create left and right lists
        int mid = orderList.size() / 2;
        List<T> leftSide = orderList.subList(0, mid);
        List<T> rightSide = orderList.subList(mid, orderList.size());

        // recursive calls to divide the list
        mergeSort(leftSide, comparator);
        mergeSort(rightSide, comparator);

        // create counters for iteration
        int i = 0; // left counter
        int j = 0; // right counter
        int k = 0; // merged list counter

        while (i < leftSide.size() && j < rightSide.size()) {
            // compare merging left and right sides after dividing
            if (comparator.compare(leftSide.get(i), rightSide.get(j)) >= 0) {
                orderList.set(k, leftSide.get(i));
                i++;
            }
            else {
                orderList.set(k, rightSide.get(j));
                j++;
            }
            k++;
        } // end of while loop 1

        // while left has leftover elements, add to merged list
        while (i < leftSide.size()) {
            orderList.set(k, leftSide.get(i));
            i++;
            k++;
        } // end of while loop 2

        // while right has leftover elements, add after left side
        while (j < rightSide.size()) {
            orderList.set(k, rightSide.get(j));
            j++;
            k++;
        } // end of while loop 3

    } // end of mergeSort method

} // end of class
