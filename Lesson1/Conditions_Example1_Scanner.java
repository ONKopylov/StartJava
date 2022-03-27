
import java.util.Scanner;//fgh

public class Conditions_Example1_Scanner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
    
        System.out.print("Сколько процентов заряда батареи осталось на вашем смартфоне?");
        int a = scanner.nextInt();
    
        if (a < 10) {
            System.out.println("Осталось менее 10 процентов, подключите ваш смартфон к зарядному устройству");
        }
    }
}
