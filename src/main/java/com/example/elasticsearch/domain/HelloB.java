package com.example.elasticsearch.domain;

import java.math.BigDecimal;

public class HelloB extends HelloA{
  public HelloB() {
    System.out.println("HelloB");
  }

  {
    System.out.println("I'm B class");
    }

    static {
    System.out.println("static B");
    }

  public static void main(String[] args) {
    new HelloB();

  }
}
