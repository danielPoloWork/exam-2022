package it.euris.exam.test2.mySolution2;

public class Sum implements CalculatorInterface {

  private Operation operation;

  public Sum(Operation operation) {
    this.operation = operation;
  }

  @Override
  public void execute() {
    operation.sum();
  }
}
