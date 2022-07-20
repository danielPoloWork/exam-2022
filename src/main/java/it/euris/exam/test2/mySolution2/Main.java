package it.euris.exam.test2.mySolution2;

public class Main {
  private static Calculator calculator;

  public static void main(String[] args) {
    calculator = Calculator.getInstance();

    Operation operation = new Operation(10, 5);

    calculator.calculate(new Sum(operation));
    calculator.calculate(new Subtraction(operation));
    calculator.calculate(new Multiplication(operation));
    calculator.calculate(new Division(operation));
  }
}
