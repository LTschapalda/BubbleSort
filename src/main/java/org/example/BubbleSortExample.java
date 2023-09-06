package org.example;

public class BubbleSortExample {

    public static void main(String[] args) {
        int[] numbers = {5, 2, 9, 1, 5, 6};

        System.out.println("Unsorted array:");
        for (int number : numbers) {
            System.out.print(number + " ");
        }

        bubbleSort(numbers);

        System.out.println("\nSorted array:");
        for (int number : numbers) {
            System.out.print(number + " ");
        }
    }

    // Bubble Sort Algorithm
    public static void bubbleSort(int[] arr) {
        int length = arr.length;
        boolean swapped;

        do {
            swapped = false;

            for (int i = 1; i < length; i++) {
                if (arr[i - 1] > arr[i]) {
                    swap(arr, i - 1, i);
                    swapped = true;
                }
            }
            length--;
        } while (swapped);
    }

    // Helper method to swap two elements in an array
    private static void swap(int[] arr, int index1, int index2) {
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }
}
