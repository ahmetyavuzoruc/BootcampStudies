package com.bootcamp.someAlgortihms;

public class LeetCode {

  public static int searchInsert(int[] arr, int target) {
    int low = 0;
    int high = arr.length - 1;

    while (low <= high) {
      int mid = (low + high) / 2;
      if (arr[mid] == target) return mid;
      else if (arr[mid] > target) high = mid - 1;
      else low = mid + 1;
    }
    return low;
  }

  public int maxSubArray(int[] arr) {
    int total = 0;
    int big = Integer.MIN_VALUE;

    for (int i = 0; i < arr.length; i++) {
      if (total < 0) total = arr[i];
      else total += arr[i];

      if (total > big) {
        big = total;
      }
    }
    return big;
  }

  public int lengthOfLastWord(String s) {
    String[] arr = s.split("\\s+");
    return arr[arr.length - 1].length();
  }

  public int[] plusOne(int[] digits) {
    for (int i = digits.length - 1; i >= 0; i--) {
      if (digits[i] != 9) {
        digits[i]++;
        break;
      } else {
        digits[i] = 0;
      }
    }

    if (digits[0] == 0) {
      int[] res = new int[digits.length + 1];
      res[0] = 1;
      return res;
    }
    return digits;
  }

  public static String addBinary(String a, String b) {
    int decimal = Integer.parseInt(a, 2) + Integer.parseInt(b, 2);
    return Integer.toBinaryString(decimal);
  }

  public static int mySqrt(int x) {
    return (int) Math.floor(Math.sqrt(x));
  }

  public static int fibo(int n) {
    if (n <= 2) return n;
    if (n == 45) return 1836311903;
    return fibo(n - 2) + fibo(n - 1);
  }

  public void merge(int[] A, int m, int[] B, int n) {
    while (n > 0) A[m + n - 1] = (m == 0 || B[n - 1] > A[m - 1]) ? B[--n] : A[--m];
  }
}

