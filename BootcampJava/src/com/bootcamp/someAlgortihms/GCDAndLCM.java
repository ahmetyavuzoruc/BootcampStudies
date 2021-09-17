package com.bootcamp.someAlgortihms;

public class GCDAndLCM {
  //EBOB-EKOK

  public static int gcd(int a, int b) {
    int gcd = 1;
    for(int i = 2; i <= a && i <= b; i++) {
      if(a % i == 0 && b % i == 0){
        gcd = i;
      }
    }
    return gcd;
  }

  public static int lcm(int a, int b) {
    return (a*b) / gcd(a,b);
  }

}
