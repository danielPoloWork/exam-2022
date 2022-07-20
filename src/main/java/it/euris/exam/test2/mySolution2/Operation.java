package it.euris.exam.test2.mySolution2;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Operation {

  private double left;
  private double right;
  private double result;

  public Operation(double left, double right) {
    this.left = left;
    this.right = right;
  }

  public void multiplication() {
    this.result = this.left * this.right;
    System.out.printf("Multiplication: %s", this.result);
  }

  public void division() {
    this.result = this.left / this.right;
    System.out.printf("Division: %s", this.result);
  }

  public void subtraction() {
    this.result = this.left - this.right;
    System.out.printf("Subtraction: %s", this.result);
  }

  public void sum() {
    this.result = this.left + this.right;
    System.out.printf("Sum: %s", this.result);
  }
}
