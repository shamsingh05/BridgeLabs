public interface Transaction {
    void transfer(Account from, Account to, double amount);
}
