package com.kloudkorner.example.multithreading;

import java.util.concurrent.Callable;

public class NumberAdder implements Callable<Integer>
{

  private final int[] numArray;

  public NumberAdder(int... numbers)
  {
    numArray = new int[numbers.length];
    int index = 0;
    for (int num : numbers)
    {
      numArray[index] = num;
      index++;
    }
  }

  @Override
  public Integer call() throws Exception
  {
    int sum = 0;
    for (int num : numArray)
    {
      sum += num;
    }
    return sum;
  }
}
