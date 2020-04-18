package com.sliit.mtit.microservice.orderproductservice.dto;

public class PaymentCreationResponse {
    //private String PaymentId;
    private String paymentId;
    private  String feedback;

  /*  public String getPaymentId() {
        return PaymentId;
    }

    public void setPaymentId(String paymentId) {
        PaymentId = paymentId;
    }*/
  public String getPaymentId() {
      return paymentId;
  }

    public void setPaymentId(String paymentId) {
        this.paymentId = paymentId;
    }
    public String getFeedback() {
        return feedback;
    }

    public void setFeedback(String feedback) {
        this.feedback = feedback;
    }
}
