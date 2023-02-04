class Main {

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




//   Problem Statement #
// Given an array of numbers sorted in an ascending order, find the ceiling of a given number ‘key’. The ceiling of the ‘key’ will be the smallest element in the given array greater than or equal to the ‘key’.

// Write a function to return the index of the ceiling of the ‘key’. If there isn’t any ceiling return -1.

// Example 1:

// Input: [4, 6, 10], key = 6
// Output: 1
// Explanation: The smallest number greater than or equal to '6' is '6' having index '1'.
  public static int CeilingOfNumber(int[] arr, int k) {
    if(k > arr[arr.length -1]) //k is bigger than biggest number
      return -1;
    int start = 0;
    int end = arr.length - 1;
    while (start <= end) {
      int mid = start + (end - start) / 2;

        if (k < arr[mid]) {
          end = mid - 1;
        } else if (k > arr[mid]){
          start = mid + 1;
        } else {
          return mid;
        }

    }

    return start;
  }

  
  public static void main(String[] args) {
    System.out.println(Main.BinarySearch(new int[] { 4, 6, 10 }, 10));
    System.out.println(Main.CeilingOfNumber(new int[] { 1,3,8,10,15 }, 12));

  }
}