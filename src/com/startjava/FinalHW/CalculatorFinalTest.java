package com.startjava.FinalHW;

import java.util.Arrays;
import java.util.Scanner;

public class CalculatorFinalTest {

    public static void main(String[] args) {

        CalculatorFinal calc = new CalculatorFinal();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Калькулятор запущен!");

        String answer = "y";

        while (answer.equals("y")) {

            System.out.print("Введите математическое выражение: ");
            String mathExpr = scanner.nextLine();
            calc.setMathExpression(mathExpr);
//            try {
                calc.calculateMathExpr(mathExpr);
//            } catch (Error e) {
//                System.out.println("Некорректное математическое выражение!");
//            }


            do {
                System.out.print("Хотите продолжить? [y/n]: ");
                answer = scanner.nextLine();
            } while (!answer.equals("y") && !answer.equals("n"));

        }
        System.out.println("Калькулятор закрылся!");
        scanner.close();
    }


}
