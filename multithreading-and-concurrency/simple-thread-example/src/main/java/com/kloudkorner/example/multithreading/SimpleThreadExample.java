package com.kloudkorner.example.multithreading;

public class SimpleThreadExample
{
  public static void printHelloUsingThread()
  {
    Runnable myThread = () ->
    {
      System.out.println("Hello Word --> " + Thread.currentThread().getName());
    };

    Thread t = new Thread(myThread);
    t.start();
  }

  public static void main(String[] args)
  {
    System.out.println("Current Thread Name : " + Thread.currentThread().getName());
    printHelloUsingThread();
  }
}
