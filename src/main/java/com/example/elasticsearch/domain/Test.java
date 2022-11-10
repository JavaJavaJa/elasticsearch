package com.example.elasticsearch.domain;

public class Test {
  public static void main(String[] args) {
    System.out.println(get(1));
  }

  public static int get(int i) {
    int result = 0;
    switch (i) {
      case 1 : result = result + i;
      case 2 : result = result + i * 2;
      case 3 : result = result + i * 3;
    }
    return result;
  }
}
