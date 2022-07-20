package it.euris.exam.test2.mySolutionWrong;

public class Calculator {

    private static Calculator instance;

    private Calculator() {}

    public static Calculator getInstance() {
        if (instance == null) {
            instance = new Calculator();
        }
        return instance;
    }

    public void calculate() {}
}
