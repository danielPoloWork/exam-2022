package it.euris.exam.test2.mySolution2;

public class Subtraction implements CalculatorInterface {

  private Operation operation;

  public Subtraction(Operation operation) {
    this.operation = operation;
  }

  @Override
  public void execute() {
    operation.subtraction();
  }
}
