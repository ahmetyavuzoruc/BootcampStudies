package com.bootcamp.someAlgortihms;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SortandSearch {

  public static List sort(List<String> list) {
    Collections.sort(list);
    return list;
  }

  public static int[] sort(int[] array) {
    Arrays.sort(array);
    return array;
  }
}
