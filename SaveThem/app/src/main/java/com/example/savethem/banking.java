package com.example.savethem;

enum Method {IBAN,creditCard,cashOnDelivery;}

public class banking
{
    private Method payment_method;

    

    public Method getMethod() {return payment_method;}

    public void setMethod(Method pm) {this.payment_method = pm;}

}