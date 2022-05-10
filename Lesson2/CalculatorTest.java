
import java.util.Scanner;

public class CalculatorTest {
    public static void main(String[] args) {

        Calculator calc = new Calculator();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Калькулятор запущен!");

        String answer = "y";

        while (answer.equals("y")) {

            System.out.print("Введите первое число: ");
            int firstNumber = scanner.nextInt();
            calc.setFirstNumber(firstNumber);

            // char mathOperation = scanner.next().charAt(0);
            System.out.print("Введите знак мат. операции: ");
            String text = scanner.next();
            char mathOperation = text.charAt(0);
            calc.setMathOperation(mathOperation);

            System.out.print("Введите второе число: ");
            int secondNumber = scanner.nextInt();
            calc.setSecondNumber(secondNumber);

            calc.calculate(firstNumber, secondNumber, mathOperation);

            do {
                System.out.print("Хотите продолжить? [y/n]: ");
                answer = scanner.next();
            } while (!answer.equals("y") && !answer.equals("n"));

        }
        System.out.println("Калькулятор закрылся!");
        scanner.close();
    }
}
