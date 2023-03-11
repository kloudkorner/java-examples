package com.kloudkorner.example.multithreading;

public class PrintMessageTask implements Runnable
{
  private final String messageToPrint;

  public PrintMessageTask(String messageToPrint)
  {
    this.messageToPrint = messageToPrint;
  }

  @Override
  public void run()
  {
    System.out.println(messageToPrint);
  }
}
