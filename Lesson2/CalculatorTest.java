public class CalculatorTest {
    public static void main(String[] args) {
        
        int firstNumber = 2;
        int secondNumber = 10;
        char mathOperation = '+';
        int result;

        Calculator mCalculator = new Calculator();
        mCalculator.setFirstNumber(firstNumber);
        mCalculator.setSecondNumber(secondNumber);
        result = mCalculator.calculate(firstNumber, secondNumber, mathOperation);
        System.out.println(result);

    }
}
