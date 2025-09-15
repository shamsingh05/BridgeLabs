public class CurrentAccount extends Account implements Transaction {
    public CurrentAccount(String accNo, double bal) {
        super(accNo, bal);
    }

    @Override
    public void withdraw(double amount) {
        if(amount > 0 && amount <= getBalance()) {
            deposit(-amount);
        } else {
            System.out.println("Insufficient funds.");
        }
    }

    @Override
    public void transfer(Account from, Account to, double amount) {
        if(amount > 0 && from.getBalance() >= amount) {
            from.deposit(-amount);
            to.deposit(amount);
            System.out.println("Transferred " + amount + " from " + from.getAccountNumber() + " to " + to.getAccountNumber());
        } else {
            System.out.println("Transfer failed: insufficient funds.");
        }
    }
}
