package com.example.savethem;

public class mkoNews
{
    //get News from api
    private String topic;
    private int image;
    private String details;
    private String author;
    private String MKO;
    public mkoNews(String topic,int image,String details,String author,String MKO)
    {
            this.topic=topic;
            this.image=image;
            this.details=details;
            this.author=author;
            this.MKO=MKO;
    }
    public void retrieveMKONews()
    {
        //api from every MKO available insert here
    }


}
