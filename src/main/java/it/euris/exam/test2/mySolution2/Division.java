package it.euris.exam.test2.mySolution2;

public class Division implements CalculatorInterface {

  private Operation operation;

  public Division(Operation operation) {
    this.operation = operation;
  }

  @Override
  public void execute() {
    operation.division();
  }
}
