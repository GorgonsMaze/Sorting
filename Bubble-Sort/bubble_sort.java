/* Bubble Sort - Java */

public class Main {

    public static void main(String[] args) {
        // Declare an array of integers
        int[] unsortedArray1 = new int[] {0};
        int[] unsortedArray2 = new int[] {5,4,2,3,1};
        int[] unsortedArray3 = new int[] {1,2,3,4,5};
        int[] unsortedArray4 = new int[] {5,2,18,6,3,25,22,1};
        int[] unsortedArray5 = new int[]{19, 11, 18, 22, 6, 55, 2, 15};

        BubbleSort(unsortedArray1);
        BubbleSort(unsortedArray2);
        BubbleSort(unsortedArray3);
        BubbleSort(unsortedArray4);
        BubbleSort(unsortedArray5);
    }

    /**
     * Bubble Sort Method
     * @param lst
     */
    private static void BubbleSort(int[] lst) {
        int j;
        boolean not_sorted = true;

        while (not_sorted) {
            not_sorted = false;

            for (j = 0; j < lst.length - 1; j++) {
                if (lst[j] > lst[j + 1]) {
                    int temp = lst[j + 1];
                    lst[j + 1] = lst[j];
                    lst[j] = temp;
                    not_sorted = true;

                }
            }

        }

        System.out.println("The sorted output is: " + java.util.Arrays.toString(lst));

    }

}
