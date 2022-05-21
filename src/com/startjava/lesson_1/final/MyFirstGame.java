public class MyFirstGame {
    public static void main(String[] args) {
        int pcNumber = 87;
        int userNumber = 10;

        do {
            if (pcNumber == userNumber) {
                System.out.println("Вы угадали!");
            } else if (pcNumber > userNumber) {
                System.out.println("Ваше число меньше! " + userNumber);
                userNumber +=7;
            } else {
                System.out.println("Ваше число больше! " + userNumber);
                userNumber -=5;
            }
        } while (userNumber != pcNumber);

        System.out.println("Вы угадали! " + userNumber);
    }
}
