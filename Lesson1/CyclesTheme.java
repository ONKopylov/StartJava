
import java.lang.Math;

// import javax.print.event.PrintJobListener;

public class CyclesTheme {
    public static void main(String[] args) {

        // 1. Подсчет суммы четных и нечетных чисел
        System.out.println("1. Подсчет суммы ченых и нечетных чисел");

        int leftBorder = -10;
        int rightBorder = 21;
        int oddNumbers = 0;
        int evenNumbers = 0;
        int i = leftBorder;

        do {
            if (i % 2 == 0) {
                evenNumbers = evenNumbers + i;
            } else {
                oddNumbers = oddNumbers + i;
            }
            i++;
        } while (i < +rightBorder);

        System.out.println("Sum of even numbers: " + evenNumbers);
        System.out.println("Sum of odd numbers: " + oddNumbers);
        System.out.println();

        // 2. Вывод чисел между макс и мин
        System.out.println("2. Вывод чисел между макс и мин");
        int a = 10, b = 5, c = -1;
        int maxNumber = Math.max(c, Math.max(a, b)), minNumber = Math.min(c, Math.min(a, b));

        System.out.println("Max: " + maxNumber);
        System.out.println("Min: " + minNumber);

        for (int j = minNumber + 1; j < maxNumber; j++) {
            System.out.println(j);
        }

        System.out.println();

        // 3. Вывод реверсивного числа и суммы его цифр
        System.out.println("3. Вывод реверсивного числа и суммы его цифр");
        int num = 1234, sum = 0; // num2
        String str = "";

        while (num > 0) {
            sum += num % 10;
            str = str + Integer.toString(num % 10);
            num /= 10;
        }

        System.out.println(str);
        System.out.println(sum);
        System.out.println();

        // 4. Вывод чисел на консоль в несколько строк
        System.out.println("4. Вывод чисел на консоль в несколько строк");

        leftBorder = 1;
        rightBorder = 24;
        int count = 1;

        for (int j = leftBorder; j < rightBorder; j += 2) {
            System.out.printf("%3d", j);
            if (count == 5) {
                System.out.println();
                count = 1;
            } else {
                count++;
            }
        }

        for (int j = count; j <= 5; j++) {
            System.out.printf("%3d", 0);
        }

        System.out.println();
        System.out.println();

        //5. Проверка количества единиц на четность
        System.out.println("5. Проверка колиества единиц на четность");

        num = 3141591;
        sum = 0;
        int remainder;

        while (num > 0) {
            remainder = num % 10;
            if (remainder == 1) {
                sum = sum + 1;
            }
            num /= 10;
        }

        System.out.println("Количество единиц в числе: " + sum);

        if (sum%2 == 0) {
            System.out.println("Количество единиц четно!");
        } else {
            System.out.println("Количестов единиц НЕчетно!");
        }

        System.out.println();

        //6.Отображение фигур в консоли
        System.out.println("6. Отображение фигур в консоли");

        // char r = 42;
        String symbol = "*";

        for (int j = 0; j < 5; j++) {
            for (int k = 0; k < 10; k++) {
                System.out.printf(symbol);
            }
            System.out.println();
        }

        System.out.println();

        symbol = "#";
        int j = 5, k;

        while (j>0) {
            k = 0;
            while (k < j) {
                System.out.printf(symbol);
                k++;
            }
            System.out.println();
            j--;
        }

        System.out.println();

        symbol = "$";
        j = 1; k = 0;

        do {
            k = 1;
            i = 5;

            do {
                if (j > 3) {
                    break;
                }
                k++;
                System.out.printf(symbol);
            } while (k <= j);

            do {
                if (j <= 3) {
                    break;
                }
                i--;
                System.out.printf(symbol);
            } while (i-j >= 0);
            System.out.println();
            j++;
 
        } while (j <= 5);

        System.out.println();

        //7. Отображение ASCII-символов
        System.out.println("7. Отображение ASCII-символов");

        char asciiChar;

        System.out.println("Dec Char");

        for (int l = 0; l < 12; l++) {
            System.out.printf("%2d", l);
            System.out.println(" " + (char)l);
        }

        for (int l = 0; l < 12; l++) {
            if (l%2 == 0) {
                System.out.println((char)l);
            }
        }

        System.out.println();

        //8. Проверка является ли число полиндромом
        System.out.println("8. Проверка является ли число полиндромом");
        num = 12321;
        remainder = 0;
        String reverseNum = "", strNum = Integer.toString(num);

        while (num != 0) {
            remainder = num % 10;
            reverseNum = reverseNum + Integer.toString(num % 10);
            num/=10;
        }

        if (Integer.parseInt(reverseNum) == Integer.parseInt(strNum)) {
            System.out.println("Это полиндром!");
        } else {
            System.out.println("Это не полиндром!");
        }
        // System.out.println(reverseNum);
        System.out.println();

        //9. Определение, является ли число счастливым
        System.out.println("9. Определение, является ли число счастливым");

        num = 124321;
        int num2 = num;
        int sum1 = 0, sum2 = 0, counter = 1;

        while (num !=0) {
            if (counter <= 3) {
                sum1 = sum1 + num%10;
            } else {
                sum2 = sum2 + num%10;
            }
            num/=10;
            counter++;
        }

        if (sum1 == sum2) {
            System.out.println("Число: " + num2 + " счастливое!");
        } else {
            System.out.println("Число: " + num2 + " НЕ счастливое!");
        }

        System.out.println();

        //10. Вывод таблицы умножения Пифагора
        System.out.println("10. Вывод таблицы умножения Пифагора");

        for (int p = 0; p < 9; p++) {
            for (int q = 0; q < 9; q++) {
                if (q == 1) {
                    System.out.printf("|");
                }
                System.out.printf("%5d", (p+1)*(q+1));
            }
            if (p==0) {
                System.out.println();
                System.out.println("_______________________________________________");
            }
            System.out.println();
        }

        System.out.println();

    }
}
