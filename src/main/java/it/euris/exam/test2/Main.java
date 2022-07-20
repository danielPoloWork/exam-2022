package it.euris.exam.test2;


class Main {

    public static void main(String[] args) {

        Calculator calculator = new Calculator();

        AdditionOperation currentOperation = new AdditionOperation();
//        SubstractionOperation currentOperation = new SubstractionOperation();

        currentOperation.setLeft(10);
        currentOperation.setRight(5);
        try {
            calculator.calculate(currentOperation);
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }

        System.out.println(currentOperation.getResult());

    }

}