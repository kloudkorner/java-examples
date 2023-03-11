package com.kloudkorner.example.multithreading;

public class SimpleThreadExampleWithoutLambda
{
  public static void main(String[] args)
  {
    final String messageToPrint = "Hello Word";
    final PrintMessageTask myPrintMessageTask = new PrintMessageTask(messageToPrint);
    final Thread thread = new Thread(myPrintMessageTask);
    thread.start();
  }
}
