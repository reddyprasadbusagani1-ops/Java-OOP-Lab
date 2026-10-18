/*
Aim: Sort a list of elements in ascending order using bubble sort.
File name: BubbleSort.java
*/

public class BubbleSort {
    public static void main(String[] args) {
        int[] a = {50, 20, 40, 10, 30};

        System.out.print("Original array: ");
        for (int value : a) {
            System.out.print(value + " ");
        }

        for (int i = 0; i < a.length - 1; i++) {
            for (int j = 0; j < a.length - 1 - i; j++) {
                if (a[j] > a[j + 1]) {
                    int temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                }
            }
        }

        System.out.print("\nSorted array: ");
        for (int value : a) {
            System.out.print(value + " ");
        }
        System.out.println();
    }
}

/*
Sample output:
Original array: 50 20 40 10 30
Sorted array: 10 20 30 40 50
*/
