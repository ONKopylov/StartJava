
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

        int x = 345;
        int y = 745;

        System.out.println("4. Поиск общей цифры в числах");

        int hundred_x = x/100;
        int hundred_y = y/100;
        int tens_x = (x - hundred_x)/10;
        int tens_y = (y - hundred_y)/10;
        int units_x = x - hundred_x - tens_x;
        int units_y = y - hundred_y - tens_y;

        if (hundred_x = hundred_y) {
            System.out.println("Совпадают сотни - " + x.);
        }





    }



}
