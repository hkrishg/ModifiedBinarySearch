class Main {

  public static int BinarySearch(int[] arr, int k) {
    int start = 0;
    int end = arr.length - 1;
    while (start <= end) {
      int mid = start + (end - start) / 2;

      if (k == arr[mid])
        return mid;

      if (arr[start] < arr[end]) {
        if (k < arr[mid]) {
          end = mid - 1;
        } else {
          start = mid + 1;
        }
      } else {
        if (k > arr[mid]) {
          end = mid - 1;
        } else {
          start = mid + 1;
        }
      }
    }

    return -1;
  }

  // Problem Statement #
  // Given a sorted array of numbers, find if a given number ‘key’ is present in
  // the array. Though we know that the array is sorted, we don’t know if it’s
  // sorted in ascending or descending order. You should assume that the array can
  // have duplicates.

  // Write a function to return the index of the ‘key’ if it is present in the
  // array, otherwise return -1.

  // Example 1:

  // Input: [4, 6, 10], key = 10
  // Output: 2
  public static void main(String[] args) {
    System.out.println(Main.BinarySearch(new int[] { 4, 6, 10 }, 10));
  }
}