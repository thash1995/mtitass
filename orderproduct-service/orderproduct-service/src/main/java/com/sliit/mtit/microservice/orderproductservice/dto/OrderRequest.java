package com.sliit.mtit.microservice.orderproductservice.dto;

public class OrderRequest {
    private String name;
    private String telnumber;
    private String orderType;
    private String description;

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getTelnumber() {
        return telnumber;
    }
    public void setTelnumber(String telnumber) {
        this.telnumber = telnumber;
    }
    public String getOrderType() {
        return orderType;
    }
    public void setOrderType(String orderType) {
        this.orderType = orderType;
    }
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }


    @Override
    public String toString() {
        return "OrderRequest{" +
                "name='" + name + '\'' +
                ", telnumber='" + telnumber + '\'' +
                ", orderType='" + orderType + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
