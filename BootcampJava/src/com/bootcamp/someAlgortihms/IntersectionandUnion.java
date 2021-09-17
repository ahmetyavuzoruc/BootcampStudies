package com.bootcamp.someAlgortihms;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class IntersectionandUnion {

  public static <T> Set<T> union(Set<T> set1, Set<T> set2) {
    Set<Integer> s1 = new HashSet<Integer>(Arrays.asList());
    return Stream.concat(set1.stream(), set2.stream()).collect(Collectors.toSet());
  }

  public static <T> Set<T> intersection(Set<T> set1, Set<T> set2) {
    return set1.stream().filter(set2::contains).collect(Collectors.toSet());
  }

  public static int[] intersection(int[] a1, int[] a2) {

    if (a1.length == 0 || a2.length == 0) return new int[0];

    Arrays.sort(a1);
    Arrays.sort(a2);

    int i = 0;
    int j = 0;

    List<Integer> list = new ArrayList<>();

    while (i < a1.length && j < a2.length) {
      if (a1[i] == a2[j]) {
        list.add(a1[i]);
        i++;
        j++;
      } else if (a1[i] < a2[i]) {
        i++;
      } else {
        j++;
      }
    }
    int[] result = new int[list.size()];
    for (int k = 0; k < list.size(); k++) {
      result[k] = list.get(k);
    }
    return result;
  }
}
