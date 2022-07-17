package com.startjava.FinalHW;
//import java.util.Arrays;

public class CalculatorFinal {

    private int firstNumber;
    private int secondNumber;
    private char mathOperation;

    private String mathExpression;

    public String getMathExpression() {
        return mathExpression;
    }

    public void setMathExpression(String mathExpression) {
        this.mathExpression = mathExpression;
    }

    public int getFirstNumber() {
        return firstNumber;
    }

    public int getSecondNumber() {
        return secondNumber;
    }

    public char getMathOperation() {
        return mathOperation;
    }

    public void setFirstNumber(int firstNumber) {
        this.firstNumber = firstNumber;
    }

    public void setSecondNumber(int secondNumber) {
        this.secondNumber = secondNumber;
    }

    public void setMathOperation(char mathOperation) {
        this.mathOperation = mathOperation;
    }

    public void calculateMathExpr (String MathExpr) {

        String[] arr = new String[3];
        arr = MathExpr.split(" ");

        calculate(Integer.parseInt(arr[0]), Integer.parseInt(arr[2]), arr[1].charAt(0));

    }

    public void calculate(int firstNumber, int secondNumber, char mathOperation) {

        switch (mathOperation) {
            case '+':
//                System.out.println(firstNumber + secondNumber);
                System.out.println(Math.addExact(firstNumber, secondNumber));
                break;
            case '-':
                System.out.println (firstNumber - secondNumber);
                break;
            case '*':
                System.out.println(Math.multiplyExact(firstNumber, secondNumber));
                break;
            case '/':
                System.out.println (firstNumber / secondNumber);
                break;
            case '^':
                System.out.println (Math.pow(firstNumber, secondNumber));
                break;
            case '%':
                System.out.println (firstNumber % secondNumber);
                break;
            default:
                System.out.println("Uncorrect math operation!!!");
        }
    }

    //private void pow(int firstNumber, int secondNumber) {
    private void pow() {
        int result = 1;
        for (int i = 0; i < secondNumber; i++) {
            result *= firstNumber;
        }
        System.out.println (result);
    }
}
