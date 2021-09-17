package com.bootcamp.homeworks;

public class ArrayHomeworks {

  public int biggestNumber() {
    int[] arr = {1, 2, 3, 4, 67, 99, 1, 4, 5};

    int bigNumber = arr[0];

    for (int i = 0; i < arr.length; i++) {
      if (arr[i] > bigNumber) {
        bigNumber = arr[i];
      }
    }
    return bigNumber;
  }

  public int secondBiggestNumber() {
    int[] arr = {100, 2, 3, 4, 67, 99, 99, 1, 4, 5};

    int bigNumber = arr[0];
    int secondBigNumber = 0;

    for (int i = 0; i < arr.length; i++) {
      if (arr[i] > bigNumber) {
        secondBigNumber = bigNumber;
        bigNumber = arr[i];
      } else {
        if (arr[i] > secondBigNumber && arr[i] != bigNumber) {
          secondBigNumber = arr[i];
        }
      }
    }
    return secondBigNumber;
  }

  public void oddAndEvenArray() {
    int[] arr = {100, 2, 3, 4, 67, 99, 99, 1, 4, 5};

    int odd = 0;
    int even = 0;

    for (int i = 0; i < arr.length; i++) {
      if (arr[i] % 2 == 0) {
        even++;
      } else {
        odd++;
      }
    }

    int[] oddArray = new int[odd];
    int[] evenArray = new int[even];

    for (int i = 0, j= 0, k = 0; k < arr.length; k++) {
      if (arr[k] % 2 == 0) {
        evenArray[i] = arr[k];
        i++;
      } else {
        oddArray[j] = arr[k];
        j++;
      }
    }

    System.out.println("Odd : ");
    for(int i = 0; i<oddArray.length ; i++){
      System.out.print(" " + oddArray[i] + ",");
    }

    System.out.println();

    System.out.println("Even : ");
    for(int i = 0; i<evenArray.length ; i++){
      System.out.print(" " + evenArray[i] + ",");
    }
  }

  public int[] reverse() {
    int[] arr = {100, 2, 3, 4, 67, 99, 99, 1, 4, 5};
    int[] rev = new int[arr.length];

    for(int i = 0, j = arr.length-1; i<arr.length; i++, j--) {
      rev[i] = arr[j];
    }

    for(int i = 0; i< rev.length; i++){
      System.out.print(rev[i] + ",");
    }
    return rev;
  }
}
