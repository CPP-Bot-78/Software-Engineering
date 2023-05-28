package com.example.savethem;

enum Method {IBAN,creditCard,cashOnDelivery;}

public class banking
{
    private Method payment_method;

    private int ammount = 1000; //€

    public static boolean pay(Method pm,String card_id, int security_code, int expr_month, int expr_year)
    {
        super(pm);
        this.payment_method=pm;
        if (!validateCard(card_id,security_code,expr_month,expr_year)){return false;}
        return false;
    }

    private boolean validateCard(String card_id, int security_code, int expr_month, int expr_year)
    {
        if (card_id.length != 15) {return false;}
        char[] ch = card_id.toCharArray();
        return false;
    }

    public Method getMethod() {return payment_method;}

    public void setMethod(Method pm) {this.payment_method = pm;}

}