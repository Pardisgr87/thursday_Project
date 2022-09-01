package entity;

import java.util.Date;

public class LongAccount extends Account{
    public LongAccount(String cardNumber, int cvv2, String accountNumber, double balance) {

        super();
        if (balance>100)
        {
            this.setCardNumber(cardNumber);
            this.setAccountNumber(accountNumber);
            this.setCvv2(cvv2);
            this.setBalance(balance);
            this.setCreationAccountDate(java.time.LocalDate.now());
        }
        else
            System.out.println("Your balance is less than normal");


    }


    @Override
    public void openAccount() {

    }


}
