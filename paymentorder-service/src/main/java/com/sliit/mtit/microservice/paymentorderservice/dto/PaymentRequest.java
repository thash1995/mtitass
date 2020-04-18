package com.sliit.mtit.microservice.paymentorderservice.dto;

public class PaymentRequest {
    private String name;
    private String cardNumber;
    private String cardExp;
    private String amount;
    private String cardCcv;

    public String getName() { return name; }

    public void setName(String name) { this.name = name; }
    public String getCardNumber() {
        return cardNumber;
    }
    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }
    public String getCardExp() {
        return cardExp;
    }
    public void setCardExp(String cardExp) {
        this.cardExp = cardExp;
    }
    public String getAmount() {
        return amount;
    }
    public void setAmount(String amount) {
        this.amount = amount;
    }
    public String getCardCcv() {
        return cardCcv;
    }
    public void setCardCcv(String cardCcv) {
        this.cardCcv = cardCcv;
    }
    @Override
    public String toString() {
        return "PaymentRequest{" +
                "cardHoldName='" + name+ '\'' +
                ", cardNumber='" + cardNumber + '\'' +
                ", cardExp='" + cardExp + '\'' +
                ", amount='" + amount + '\'' +
                ", cardCcv='" + cardCcv + '\'' +
                '}';
    }
}
