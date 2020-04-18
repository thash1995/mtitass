package com.sliit.mtit.microservice.orderproductservice.dto;

public class OrderResponse {
    private String orderId;
   // private String PaymentId;
   private String paymentId;
    private String feedback;


    /*public String getPaymentId(String paymentId) {
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

    public String getOrderId() {
        return orderId;
    }
    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }
    public String getFeedback() {
        return feedback;
    }
    public void setFeedback(String feedback) {
        this.feedback = feedback;
    }


}
