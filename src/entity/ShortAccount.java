package entity;

import java.util.Date;

public class ShortAccount extends Account {
    public ShortAccount(String cardNumber, int cvv2, String accountNumber, double balance) {

        super();
        if (balance > 50) {
            this.setCardNumber(cardNumber);
            this.setAccountNumber(accountNumber);
            this.setCvv2(cvv2);
            this.setBalance(balance);
            this.getCreationAccountDate(java.time.LocalDate.now());
        } else
            System.out.println("Your balance is less than normal");


    }


    @Override
    public void openAccount() {

    }


}
