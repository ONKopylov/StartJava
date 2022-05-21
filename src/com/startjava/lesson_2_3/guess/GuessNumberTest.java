import java.util.Scanner;

//отвечает за создание объектов, их инициализацию и запуск игры
public class GuessNumberTest {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        System.out.print("Введите имя первого игрока: ");
        String name1 = console.nextLine();
        Player pl1 = new Player(name1);

        System.out.print("Введите имя второго игрока: ");
        String name2 = console.nextLine();
        Player pl2 = new Player(name2);

        GuessNumber game = new GuessNumber(pl1, pl2);
        String answer = "yes";
        do {
            if ("yes".equals(answer)) {
                game.start();
            }
            System.out.print("Хотите продолжить игру? [yes/no]");
            answer = console.nextLine();
        } while (!"no".equals(answer));
    }
}
