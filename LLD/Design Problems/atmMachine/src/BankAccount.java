package src;

import java.util.UUID;

public class BankAccount {
    private UUID uuid;
    private User user;
    private int balance;

    public BankAccount(User user, int balance) {
        this.uuid = UUID.randomUUID();
        this.user = user;
        this.balance = balance;
    }

    public int getBalance() {
        return balance;
    }

    public void withDrawBalance(int balance) {
        this.balance -= balance;
    }
}
