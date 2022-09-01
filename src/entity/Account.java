package entity;

import java.time.LocalDate;
import java.util.Date;

abstract public class Account {
    private String cardNumber;
    private String accountNumber;
    private int cvv2;
    private LocalDate creationAccountDate;
    private double balance;
    private User user;
    private DataType dataType;

    public Account() {
    }
    Date date =new Date();

    public Account(String cardNumber, int cvv2, String accountNumber, double balance) {
        this.cardNumber = cardNumber;
        this.cvv2 = cvv2;
        this.accountNumber = accountNumber;
        this.creationAccountDate =java.time.LocalDate.now();
        this.balance = balance;
        this.user = user;
    }

    public void setCreationAccountDate(LocalDate creationAccountDate) {
        this.creationAccountDate = creationAccountDate;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public int getCvv2() {
        return cvv2;
    }

    public void setCvv2(int cvv2) {
        if (cvv2 >= 1000 & cvv2 <= 9999) {
            this.cvv2 = cvv2;
        } else {
            System.out.println("please enter 4 digit");
        }

    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public LocalDate getCreationAccountDate(LocalDate now) {
        return creationAccountDate;
    }


    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }


    abstract public void openAccount();

    public int withdraw(double money) {
        if (money > balance) {
            System.out.println("Your balance is not balance");
            return 0;
        } else if (money < 0) {
            System.out.println("Invalid money");
            return 0;
        } else
            balance -= money;
        return 1;
    }

    public int deposit(double money) {
        if (money > 0) {
            balance += money;
            return 1;
        }
        return 0;
    }

}
