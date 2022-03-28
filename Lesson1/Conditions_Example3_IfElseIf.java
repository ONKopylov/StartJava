public class Conditions_Example3_IfElseIf {
    public static void main(String[] args) {
        String alert5 = "Я скоро отключусь, но помни меня бодрым";
        String alert10 = "Я так скучаю по напряжению в моих жилах";
        String alert20 = "Пора вспоминать, где лежит зарядка";
        String alert30 = "Псс, пришло время экономить";
        String alert50 = "Хм, больше половины израсходовали";
        String alert75 = "Всё в порядке, заряда больше половины";
        String alert100 = "Я готов к приключениям, если что..";
        String illegalValue = "Такс, кто-то ввел некорректное значение";

        Scanner scanner = new Scanner(System.in);
        System.out.print("Сколько процентов заряда батареи осталось на вашем смартфоне?");
        int a = scanner.nextInt();

        if (a <= 0 || a > 100) {
            System.out.println(illegalValue);
        } else if (a < 5) {
            System.out.println(alert5);
        } else if (a < 10) {
            System.out.println(alert10);
        } else if (a < 20) {
            System.out.println(alert20);
        } else if (a < 30) {
            System.out.println(alert30);
        } else if (a < 50) {
            System.out.println(alert50);
        } else if (a < 75) {
            System.out.println(alert75);
        } else if (a <= 100) {
            System.out.println(alert100);
        }
    }
}