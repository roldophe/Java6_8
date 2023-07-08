package classAccount;

public class TestAccount {
    public static void main(String[] args) {
        Account account = new Account();
        account.insert(101, "Ankit", 1000);
        account.display();
        account.checkBalance();
        account.deposit(4000);
        account.checkBalance();
        account.withdraw(15000);
        account.checkBalance();
    }
}
