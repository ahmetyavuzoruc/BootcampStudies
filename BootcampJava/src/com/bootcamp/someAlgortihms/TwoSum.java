package com.bootcamp.someAlgortihms;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {

  public static int[] twoSum(int[] arr, int target) {
    int result[] = new int[2];

    Map<Integer, Integer> map = new HashMap<>();

    for (int i = 0; i < arr.length; i++) {
      if (map.containsKey(target - arr[i])) {
        result[1] = i;
        result[0] = map.get(target - arr[i]);
        return result;
      }
      map.put(arr[i], i);
    }
    return result;
  }

  public static int reverse(int x) {
    String result = "";
    String num = Integer.toString(x);
    char[] ch = num.toCharArray();
    if (ch[0] == '-') {
      result = "-";
      for (int i = num.length() - 1; i >= 1; i--) {
        result = result + num.substring(i, i + 1);
      }
      try {
        return Integer.parseInt(result);
      } catch (NumberFormatException e) {
        return 0;
      }
    } else {
      for (int i = num.length() - 1; i >= 0; i--) {
        result = result + num.substring(i, i + 1);
      }
      try {
        return Integer.parseInt(result);
      } catch (NumberFormatException e) {
        return 0;
      }
    }

  }

}
