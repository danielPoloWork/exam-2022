package it.euris.exam.test2;

public class Calculator {

    public void calculate(CalculatorOperation operation) throws Exception {

        if(operation == null){
            throw new Exception("Operation is null");
        }

        if(operation instanceof  AdditionOperation){
            AdditionOperation addOperation = (AdditionOperation) operation;
            addOperation.setResult(addOperation.getLeft() + addOperation.getRight());
        }

        if(operation instanceof  SubstractionOperation){
            SubstractionOperation subOperation = (SubstractionOperation) operation;
            subOperation.setResult(subOperation.getLeft() - subOperation.getRight());
        }

    }
}
