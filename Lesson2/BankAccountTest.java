
import java.time.LocalDateTime;
import java.time.Month;

public class BankAccountTest {
    public static void main(String[] args) {
        LocalDateTime opened = LocalDateTime.of(1986, Month.MAY, 30, 4, 30, 0);
        BankAccount account = new BankAccount("Tom", opened, 12_642.0f);
        BankAccount newAccount = new BankAccount(account);

        System.out.println("Имя владельца для счета account = " + account.name);
        System.out.println("Имя владельца для счета newAccount = " + newAccount.name);
        System.out.println("\nРезультат выполнения кода после изменения имени владельца счета \n");

        newAccount.name = "Thomas";

        System.out.println("Имя владельца для счета account = " + account.name);
        System.out.println("Имя владельца для счета newAccount = " + newAccount.name);

        System.out.println(account);
    }
}
