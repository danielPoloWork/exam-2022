package it.euris.exam.test2.mySolutionWrong;

public class Main {

    private static Calculator calculator;

    public static void main(String[] args) {
        calculator = Calculator.getInstance();

        Operation sum = new Operation();
        Operation division = new Operation();
        Operation subtraction = new Operation();

        sum.setRight(10);
        sum.setLeft(5);

        try {
            sum.calculate();
            System.out.println(sum.getResult());
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }

        subtraction.setRight(10);
        subtraction.setLeft(5);

        try {
            subtraction.calculate();
            System.out.println(subtraction.getResult());
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }

        division.setRight(10);
        division.setLeft(5);

        try {
            division.calculate();
            System.out.println(division.getResult());
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }

    }

}