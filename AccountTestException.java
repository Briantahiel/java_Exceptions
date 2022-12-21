public class AccountTestException {
    public static void main(String[] args) {
        Account account = new SavingsAccount(123, 456);

        try {
            account.deposit(500);
            account.withdrawal(700);
        } catch (NoBalanceException e) {
            e.printStackTrace();
        }
    }
}
