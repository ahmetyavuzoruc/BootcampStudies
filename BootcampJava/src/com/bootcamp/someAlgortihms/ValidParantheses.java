package com.bootcamp.someAlgortihms;

import java.util.Stack;

public class ValidParantheses {
  public static boolean valid(String s) {
    Stack<Character> stack = new Stack<>();
    char[] ch = s.toCharArray();

    for(char c : ch) {
      if(c == '{') {
        stack.push('}');
      } else if (c == '(') {
        stack.push(')');
      } else if (c == '[') {
        stack.push(']');
      } else if (stack.isEmpty() || stack.pop() != c) {
        return false;
      }
    }
    return  stack.isEmpty();
  }
}
