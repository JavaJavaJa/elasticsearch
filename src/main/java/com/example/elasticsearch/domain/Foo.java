package com.example.elasticsearch.domain;

public class Foo {
    String str = new String("good");
    char[] ch = {'a', 'b', 'c'};

  public static void main(String[] args) {
    String s = "ss";
    System.out.println("s =" + s);
  }

  public void change(String str, char[] ch) {
    str = "test ok";
    ch[0] = 'g';
  }
}
