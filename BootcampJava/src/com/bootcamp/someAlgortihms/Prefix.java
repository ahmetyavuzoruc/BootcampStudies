package com.bootcamp.someAlgortihms;

public class Prefix {

  public static String prefix(String[] arr) {
    String pre = arr[0];
    for (int i = 1; i < arr.length; i++) {
      while (arr[i].indexOf(pre) != 0) {
        pre = pre.substring(0, pre.length() - 1);
        if (pre.isEmpty()) {
          return "";
        }
      }
    }
    return pre;
  }
}
