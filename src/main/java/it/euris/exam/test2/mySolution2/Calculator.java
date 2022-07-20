package it.euris.exam.test2.mySolution2;

import java.util.ArrayList;
import java.util.List;

public class Calculator {

  private static Calculator instance;
  private final List<CalculatorInterface> operations = new ArrayList<>();

  private Calculator() {}

  public static Calculator getInstance() {
    if (instance == null) {
      instance = new Calculator();
    }
    return instance;
  }

  public void calculate(CalculatorInterface operation) {
    operations.add(operation);
    operation.execute();
  }
}
