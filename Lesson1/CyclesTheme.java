
import java.lang.Math;

public class CyclesTheme {
    public static void main(String[] args) {
        
        //1. Подсчет суммы четных и нечетных чисел
        System.out.println("1. Подсчет суммы ченых и нечетных чисел");

        int leftBorder = -10;
        int rightBorder = 21;
        int oddNumbers = 0;
        int evenNumbers = 0;
        int i = leftBorder;

        do {
            if (i%2==0) {
                evenNumbers = evenNumbers + i;
            } else {
                oddNumbers = oddNumbers + i;
            }
            i++;
        } while (i <+ rightBorder);

        System.out.println("Sum of even numbers: " + evenNumbers);
        System.out.println("Sum of odd numbers: " + oddNumbers);
        System.out.println();

        //2. Вывод чисел между макс и мин
        System.out.println("2. Вывод чисел между макс и мин");
        int a = 10, b = 5, c = -1;
        int maxNumber = Math.max(c, Math.max(a, b)), minNumber = Math.min(c, Math.min(a, b));

        System.out.println("Max: " + maxNumber);
        System.out.println("Min: " + minNumber);

        for (int j = minNumber + 1; j < maxNumber; j++) {
            System.out.println(j);
        }

        System.out.println();

        //3. Вывод реверсивного числа и суммы его цифр
        System.out.println("3. Вывод реверсивного числа и суммы его цифр");
        int num = 1234, sum = 0; //num2
        String str = "";

        while (num > 0) {
            sum += num%10;
            str = str + Integer.toString(num%10);
            num /= 10;
        }

        // num2 = str.valueOf(int);

        System.out.println(str);
        System.out.println(sum);




    }
}
