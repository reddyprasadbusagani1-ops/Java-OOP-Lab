/*
Aim: Search for an element in a sorted list using binary search.
File name: BinarySearch.java
*/

import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] a = {10, 20, 30, 40, 50, 60, 70};

        System.out.print("Array elements: ");
        for (int value : a) {
            System.out.print(value + " ");
        }

        System.out.print("\nEnter element to search: ");
        int key = sc.nextInt();

        int low = 0;
        int high = a.length - 1;
        int position = -1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (a[mid] == key) {
                position = mid + 1;
                break;
            } else if (a[mid] < key) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        if (position == -1) {
            System.out.println("Element not found.");
        } else {
            System.out.println("Element found at position " + position + ".");
        }

        sc.close();
    }
}

/*
Sample output:
Array elements: 10 20 30 40 50 60 70
Enter element to search: 40
Element found at position 4.

Note: Binary search requires the array to be sorted.
*/
