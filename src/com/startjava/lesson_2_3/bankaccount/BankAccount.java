
import java.time.LocalDateTime;

public class BankAccount {
    String name;
    LocalDateTime opened;
    double balance;

    //Обычный конструктор
    public BankAccount() {
        name = "";
        opened = LocalDateTime.now();
        balance = 0.0d;
    }

    //Параметризованный конструктор
    public BankAccount(String name, LocalDateTime opened, double balance) {
        this.name = name;
        this.opened = opened;
        this.balance = balance;
    }

    //Конструктор копирования
    public BankAccount(BankAccount account) {
        name = account.name;
        opened = LocalDateTime.now();
        balance = 0.0f;
}

    public String toString() {
        return String.format("Имя: %s \nДата создания: %s \nБаланс: %f",    
                    name, opened.toString(), balance);
    }
}

