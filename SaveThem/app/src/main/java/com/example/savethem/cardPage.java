package com.example.savethem;

public class cardPage
{
    public boolean validateCard(String card_id, int security_code, int expr_month, int expr_year)
    {
        if (card_id.length() != 15) {return false;}
        char[] ch = card_id.toCharArray();
        int[] num = new int[card_id.length()];

        for (int i = 0; i < card_id.length(); i++) {
            num[i] = Character.digit(list[i], 10);
        }
        String combinedString = Integer.toString(num[12]) + Integer.toString(num[13]) + Integer.toString(num[14]);
        int combined = Integer.parseInt(combinedString);
        if (num[0]+num[1]+num[2]+num[3]+num[4]+num[5]+num[6]+num[7]+num[8]+num[9]+num[10]+num[11]===combined) {
            return true;
        }
        return false;
    }
}