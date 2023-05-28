package com.example.savethem;

enum Method {IBAN,creditCard,cashOnDelivery;}

public class paymentMenu
{
    private Method payment_method;

    private int ammount = 1000; //€

    public static boolean payWithCard(String card_id, int security_code, int expr_month, int expr_year)
    {
        return false;
    }
    public static boolean payWithCheck()
    {
        return false;
    }
    public static int show(){
        return this.ammount;
    }
    public static void applyFee()
    {

    }

    public Method getMethod() {return this.payment_method;}

    public void setMethod(Method pm) {this.payment_method = pm;}

}