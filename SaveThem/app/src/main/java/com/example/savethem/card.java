package com.example.savethem;

import java.util.Date;

public class card
{
    private int cardNum;
    private Date cardExpireDate;
    private int cardSafetyNum;
    private String cardOwner;
    public card(int cardNum,Date cardExpireDate,int cardSafetyNum,String cardOwner)
    {
        this.cardNum=cardNum;
        this.cardExpireDate=cardExpireDate;
        this.cardSafetyNum=cardSafetyNum;
        this.cardOwner=cardOwner;
    }

}
