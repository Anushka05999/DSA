void insertionSort(int* arr, int n) {
    // Code here
    for (int i = 1; i < n; i++) {
            int key = arr[i];   // Current element to be placed
            int j = i - 1;

            // Shift elements of arr[0..i-1] that are greater than key
            // one position ahead to make space for key
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }

            // Place key at the correct position
            arr[j + 1] = key;
        }
}
