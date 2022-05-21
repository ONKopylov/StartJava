
package com.startjava.lesson_2_3.calculator;

public class Calculator {

    private int firstNumber;
    private int secondNumber;
    private char mathOperation;

    void setFirstNumber(int firstNumber) {
        this.firstNumber = firstNumber;
    }

    void setSecondNumber(int secondNumber) {
        this.secondNumber = secondNumber;
    }

    void setMathOperation(char mathOperation) {
        this.mathOperation = mathOperation;
    }

    public void calculate(int firstNumber, int secondNumber, char mathOperation) {

        switch (mathOperation) {
            case '+':
            System.out.println(firstNumber + secondNumber);
            break;
            case '-':
                System.out.println (firstNumber - secondNumber);
            break;
            case '*':
                System.out.println (firstNumber * secondNumber);
            break;
            case '/':
                System.out.println (firstNumber / secondNumber);
            break;
            case '^':
                pow();
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


