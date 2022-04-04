
public class IfElseStatementTheme {
    public static void main(String[] args) {
        
        //1. Перевод псевдокода на язык Java.
        System.out.println("1. Перевод псевдокода на язык Java");
        
        int age = 42;
        float growth = 1.73f;
        boolean isMale = true;
        String name = "Misha";
        char firstLetterName;

        if (age > 20) {
            System.out.println("Возраст больше 20 лет! Я вас внимательно слушаю!");
        } else {
            System.out.println("У вас еще все впереди! Вот стукнет вам 21, тогда и поговорим!");            
        }

        if (!isMale) {
            System.out.println("Приятно иметь дело с прекрасной половиной человечества!");
        } else {
            System.out.println("Мужчины как раз нам и нужны!");            
        }

        if (growth < 1.8) {
            System.out.println("Подрастете до 1м 80см, тогда и приходите!");
        } else {
            System.out.println("У вас подходящий рос!");            
        }

        firstLetterName = name.charAt(0);
        if (firstLetterName == 'M') {
            System.out.println("Are you Mike?");
        } else if (firstLetterName == 'I'){
            System.out.println("Are you Irvin?");
        } else {
            System.out.println("У вас неподходящее имя!");
        }

        System.out.println();

        //2. Поиск максимального и минимального числа
        int a = 10;
        float b = 10f;

        System.out.println("2. Поиск максимального и минимального числа");

        if (a<b) {
            System.out.println("Max number - b");
        } else if (a>b){
            System.out.println("Max number - a");
        } else {
            System.out.println("Numbers are equal");
        }

        System.out.println();

        // 3. Работа с числом.
        int q = - 11;
        
        System.out.println("3. Работа с числом.");

        if (q%2 == 0) {
            System.out.println("Число - четное!");
        } else {
            System.out.println("Число - НЕчетное!");
        }

        if (q < 0) {
            System.out.println("Число - отрицательное!");
        } else if (q > 0) {
            System.out.println("Число - положительное!");
        } else {
            System.out.println("Число - ноль!");
        }

        System.out.println();

        // 4. Поиск общей цифры в числах

        int x = 735;
        int y = 745;

        System.out.println("4. Поиск общей цифры в числах");

        int hundred_x = x/100;
        int hundred_y = y/100;
        int tens_x = (x - hundred_x*100)/10;
        int tens_y = (y - hundred_y*100)/10;
        int units_x = x - hundred_x*100 - tens_x*10;
        int units_y = y - hundred_y*100 - tens_y*10;

        if (hundred_x == hundred_y) {
            System.out.println("Совпадают сотни - " + (hundred_x));
        }

        if (tens_x == tens_y) {
            System.out.println("Совпадают десятки - " + (tens_x));
        }

        if (units_x == units_y) {
            System.out.println("Совпадают единицы - " + (units_x));
        }

        System.out.println();

        // 5. Определение буквы, числа или символа по их коду tdebt
        
        System.out.println("5. Определение буквы, числа или символа по их коду");

        char m = '\u005A';
        

        System.out.println(m);

        System.out.println();
        
        // 6. Определение суммы вклада и начисленных банков процентов
        
        System.out.println("6. Определение суммы вклада и начисленных банков процентов");

        int bankDeposit = 300000;
        float depositInterest;
        float sum;

        if (bankDeposit < 100000) {
            depositInterest = bankDeposit*0.5f;
            sum = bankDeposit + depositInterest;
        } else if (bankDeposit >= 100000 && bankDeposit < 300000){
            depositInterest = bankDeposit*0.7f;
            sum = bankDeposit + depositInterest;
        } else {
            depositInterest = bankDeposit*0.1f;
            sum = bankDeposit + depositInterest;
        }
        
        System.out.println("Сумма вклада: " + bankDeposit);
        System.out.println("Начисленный процент: " + depositInterest);
        System.out.println("Итоговая сумма: " + sum);

        System.out.println();

        //7. Определение оценки по предметам

        System.out.println("7. Определение оценки по предметам");
        
        int resultHistory = 59;
        int resultProgramming = 91;

        if (isMale) {
            
        } else {
            
        }

        System.out.println();

    }



}
