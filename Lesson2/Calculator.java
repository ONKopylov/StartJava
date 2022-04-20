public class Calculator {

    // TODO +, -, *, /, ^, %
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

    int calculate(int firstNumber, int secondNumber, char mathOperation) {

        /*
         * if(mathOperation == '+') {
         * return(firstNumber + secondNumber);
         * }else if(mathOperation == '-') {
         * return(firstNumber - secondNumber);
         * }else if(mathOperation=='*') {
         * return(firstNumber * secondNumber);
         * }else if(mathOperation=='/') {
         * return(firstNumber / secondNumber);
         * }else if(mathOperation=='^') {
         * int result = 1;
         * for (int i = 0; i < secondNumber; i++) {
         * result *= firstNumber;
         * }
         * return(result);
         * }else if(mathOperation=='%') {
         * return(firstNumber % secondNumber);
         * } else {
         * System.out.println("Uncorrect math operation!!!");
         * return 0;
         * }
         */

        switch (mathOperation) {
            case '+':
                return (firstNumber + secondNumber);
            // break;
            case '-':
                return (firstNumber - secondNumber);
            // break;
            case '*':
                return (firstNumber * secondNumber);
            // break;
            case '/':
                return (firstNumber / secondNumber);
            // break;
            case '^':
                int result = 1;
                for (int i = 0; i < secondNumber; i++) {
                    result *= firstNumber;
                }
                return result;
            // break;
            case '%':
                return (firstNumber % secondNumber);
            // break;
            default:
                System.out.println("Uncorrect math operation!!!");
                return 0;
        }
    }
}
