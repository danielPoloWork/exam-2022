package it.euris.exam.test2.mySolutionWrong.operations;

import it.euris.exam.test2.mySolutionWrong.Operation;


public class Sum extends Operation{

  public void calculate() {
    super.setResult(super.getLeft() + super.getRight());
  }
}
