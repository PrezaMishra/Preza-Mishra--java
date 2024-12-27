
import java.util.Scanner;
class Account {
    String customerName;
    String accNumber;
    String accType;
    int balance;

    Account(String customerName, String accNumber, String accType, int balance) {
        this.customerName = customerName;
        this.accNumber = accNumber;
        this.accType = accType;
        this.balance = balance;
    }
    void deposit(int amount) {
        balance += amount;
        System.out.println("Deposited Amount: " + amount);
        System.out.println("Updated Balance: " + balance);
    }
    void withdrawal(int amount) {
        if (amount > balance) {
            System.out.println("Insufficient Balance");
        } else {
            balance -= amount;
            System.out.println("Amount withdrawn from the account: " + amount);
            System.out.println("Updated Balance: " + balance);
        }
    }
    void displayBalance() {
        System.out.println("Account Holder: " + customerName);
        System.out.println("Account Balance: " + balance);
    }

    void checkBookFacility() {
        if (accType.equals("Saving")) {
            System.out.println("Sorry, Savings account does not have cheque book facility.");
        } else {
            System.out.println("CheckBook Available.");
        }
    }
}
class SavingAccount extends Account {
    int interestRate;
    SavingAccount(String customerName, String accNumber, String accType, int balance, int interestRate) {
        super(customerName, accNumber, "Saving", balance);
        this.interestRate = interestRate;
    }
    void computeAndDepositInterest() {
        if (balance > 0) {
            int interest = balance * interestRate / 100;
            balance += interest;
            System.out.println("Interest Earned: " + interest);
            System.out.println("Updated Balance: " + balance);
        } else {
            System.out.println("No interest added due to zero or negative balance.");
        }
    }
    void withdrawal(int amount) {
        if (amount > balance) {
            System.out.println("Insufficient Balance");
        } else {
            balance -= amount;
            System.out.println("Amount withdrawn from the account: " + amount);
            System.out.println("Updated Balance: " + balance);
        }
    }
}
class CurrentAccount extends Account {
    int minimumBalance;
    int serviceCharge;

    CurrentAccount(String customerName, String accNumber, String accType, int balance, int minimumBalance, int serviceCharge) {
        super(customerName, accNumber, "Current", balance);
        this.minimumBalance = minimumBalance;
        this.serviceCharge = serviceCharge;
    }
    void deposit(int amount) {
        balance += amount;
        System.out.println("Deposited Amount: " + amount);
        System.out.println("Updated Balance: " + balance);
        checkForMinimum();
    }
    void withdrawal(int amount) {
        if (amount > balance) {
            System.out.println("Insufficient Balance");
        } else {
            balance -= amount;
            System.out.println("Amount withdrawn from the account: " + amount);
            System.out.println("Updated Balance: " + balance);
            checkForMinimum();
        }
    }
    void checkForMinimum() {
        if (balance < minimumBalance) {
            balance -= serviceCharge;
            System.out.println("Account Balance after imposing service charge: " + balance);
        }
    }
}
class Bank {
    public static void main(String[] args) {
        SavingAccount s1 = new SavingAccount("Milan", "123", "Saving", 5000, 13);
        System.out.println("For Saving Account:");
        s1.displayBalance();
        s1.computeAndDepositInterest();
        s1.deposit(1000);
        s1.withdrawal(2000);
        s1.checkBookFacility();
        s1.displayBalance();

        CurrentAccount c1 = new CurrentAccount("Rahul", "456", "Current", 100, 2500, 100);
        System.out.println("\nFor Current Account:");
        c1.displayBalance();
        c1.deposit(1000);
        c1.withdrawal(500);
        c1.displayBalance();
    }
}
