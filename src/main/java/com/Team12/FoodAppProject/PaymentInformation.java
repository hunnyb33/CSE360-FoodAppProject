package com.Team12.FoodAppProject;

public class PaymentInformation extends Customer{
    private long cardNumber;
    private int ccv;

    public long getCardNumber(){
        return cardNumber;
    }

    public int getCCV(){
        return ccv;
    }

    public boolean setCardNumber(long newNum){
        cardNumber = newNum;
        return true;
    }

    public boolean setCCV(int newCCV){
        ccv = newCCV;
        return true;
    }
}
