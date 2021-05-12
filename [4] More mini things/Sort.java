
/**
 * Bubble sort implementation.
 */
public class Sort {

    public int[] bubbleSort(int[] unsorted, boolean increasing) {

        for (int i = 0; i < unsorted.length - 1; i++) {
            for (int j = 1; j < unsorted.length - i; j++) {
                if (increasing ? unsorted[j - 1] > unsorted[j] : unsorted[j - 1] < unsorted[j]) {
                    int temp = unsorted[j];
                    unsorted[j] = unsorted[j - 1];
                    unsorted[j - 1] = temp;
                }
            }
        }
        return unsorted;
    }

}
