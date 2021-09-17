package com.bootcamp.someAlgortihms;

public class Palindrome {
  public static boolean palindrome(int x) {
    String s = Integer.toString(x);
    StringBuilder sb = new StringBuilder(s);
    String rev = String.valueOf(sb.reverse());
    return s.equals(rev);
  }
}
