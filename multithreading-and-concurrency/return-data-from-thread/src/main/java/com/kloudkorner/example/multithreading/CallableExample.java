package com.kloudkorner.example.multithreading;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class CallableExample
{
  public static void main(String[] args) throws ExecutionException, InterruptedException
  {
    final NumberAdder numberAdder = new NumberAdder(10, 20, 30);
    final ExecutorService executorService = Executors.newFixedThreadPool(1);
    final Future<Integer> response = executorService.submit(numberAdder);
    final int sum = response.get();
    System.out.println("sum = " + sum);
  }
}
