class BankAccount {

    private String accountNumber;
    private String accountHolderName;
    private double balance;

    public BankAccount(String accNo, String name) {
        accountNumber = accNo;
        accountHolderName = name;
        balance = 0.0;
    }

    public void deposit(double amount) {
        if (amount <= 0) {
            System.out.println("Invalid deposit amount.");
        } else {
            balance += amount;
            System.out.println("Deposited " + amount + ". New balance: " + balance);
        }
    }

    public void withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("Invalid withdrawal amount.");
        } else if (amount > balance) {
            System.out.println("Insufficient balance.");
        } else {
            balance -= amount;
            System.out.println("Withdrew " + amount + ". New balance: " + balance);
        }
    }

    public double getBalance() {
        return balance;
    }
}

// Main class (NOT public)
class Main {
    public static void main(String[] args) {

        BankAccount acc = new BankAccount("ACC123", "Chandana S V");

        acc.deposit(5000);
        acc.withdraw(2000);
        acc.withdraw(4000);
    }
}
