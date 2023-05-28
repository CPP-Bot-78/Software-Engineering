package com.example.savethem;

enum Method {IBAN,creditCard,cashOnDelivery;}

public class banking
{
    private Method payment_method;

    public static boolean pay(Method pm)
    {
        super(pm);
        this.payment_method=pm;
        return false;
    }

    public Method getMethod() {return payment_method;}

    public void setMethod(Method pm) {this.payment_method = pm;}

}