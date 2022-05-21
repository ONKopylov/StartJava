public class Calculator {
    public static void main(String[] args) {

        int a = 10, b = 3, result = 0;
        char sign = '%';
        // sign = (char)94;

        if (sign == (char)43) {//+
            result = a + b;
        } else if (sign == (char)45) {//-
            result = a - b;
        } else if (sign == (char)42) {//*
            result = a * b;
        } else if (sign == (char)47) {// / - деление
            result = a / b;
        } else if (sign == (char)94) {// - возведение в степень
            for (int i = 0; i <= b; i++) {
                if (i == 0) {
                    result = 1;
                } else {
                    result = result*a;
                }
            }
        } else if (sign == (char)37) {// %- деление помодулю
            result = a % b;
        } else {
            
        }

        System.out.println(a + "" + sign + "" + b + "=" + result);

    }
}
