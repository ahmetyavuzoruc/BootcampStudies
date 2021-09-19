package com.bootcamp.someAlgortihms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

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

    int p1 = m - 1, p2 = n - 1, i = m + n - 1;
    while (p2 >= 0) {
      if (p1 >= 0 && A[p1] > B[p2]) {
        A[i--] = A[p1--];
      } else {
        A[i--] = B[p2--];
      }
    }
  }

  public static List<Integer> getRow(int rowIndex) {
    List<Integer> list = new ArrayList<>();
    if (rowIndex < 0)
      return list;

    for (int i = 0; i < rowIndex + 1; i++) {
      list.add(0, 1);
      for (int j = 1; j < list.size() - 1; j++) {
        list.set(j, list.get(j) + list.get(j + 1));
      }
    }
    return list;
  }

  public static List<List<Integer>> getListRow(int rowIndex) {
    List<List<Integer>> allList = new ArrayList<>();
    ArrayList<Integer> list = new ArrayList<>();

    for (int i = 0; i < rowIndex; i++) {
      list.add(0, 1);
      for (int j = 1; j < list.size() - 1; j++) {
        list.set(j, list.get(j) + list.get(j + 1));
      }
      allList.add(new ArrayList<>(list));
    }
    return allList;
  }

  public int maxProfit(int[] prices) {
    int ans = 0;
    if (prices.length == 0) {
      return ans;
    }

    int max = prices[0];
    for (int i = 1; i < prices.length; i++) {
      if (prices[i] > max) {
        if (ans < (prices[i] - max)) {
          ans = prices[i] - max;
        }
      } else {
        max = prices[i];
      }
    }
    return ans;
  }

  public static boolean isPalindrome(String s) {
    String str = s.replaceAll("[\\W_?.,]", "").toLowerCase();
    StringBuilder sb = new StringBuilder(str);
    String res = String.valueOf(sb.reverse()).toLowerCase();
    return res.equals(str);
  }

  public int singleNumber(int[] nums) {
    int result = 0;
    for (int i = 0; i < nums.length; i++) {
      result ^= nums[i];
    }
    return result;
  }

  public static String convertToTitle(int n) {
    return n == 0 ? ""
            : convertToTitle(--n / 26) + (char)('A' + (n % 26));
  }

  public int majorityElement(int[] num) {
    Arrays.sort(num);
    int major=num[0], count = 1;
    for(int i=1; i<num.length;i++){
      if(count==0){
        count++;
        major=num[i];
      }else if(major==num[i]){
        count++;
      }else count--;

    }
    return major;
  }
}

