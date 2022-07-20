package it.euris.exam.test2.mySolution2;

public class Multiplication implements CalculatorInterface {

  private Operation operation;

  public Multiplication(Operation operation) {
    this.operation = operation;
  }

  @Override
  public void execute() {
    operation.multiplication();
  }
}
