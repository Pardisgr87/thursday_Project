package entity;

import javax.print.attribute.standard.DateTimeAtCompleted;
import java.util.Date;

public class Currant extends Account{

    public Currant(String cardNumber, int cvv2, String accountNumber, double balance) {

        super();
        if (balance>150)
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
