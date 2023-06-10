package com.example.savethem;

public class EmailForm
    {
    private String SenderAddress;
    private String ReceiverAddress;
    public EmailForm(String SenderAddress, String ReceiverAddress)
    {
    this.SenderAddress = SenderAddress;
    this.ReceiverAddress = ReceiverAddress;
    }
    public boolean checkEmail(String email)
    {
        return true;
    }
    public void changeEmailAddress()
    {
     System.out.println("You can change your email address here.");
    }
    public void fillForm()
    {

    }


    public void autoFillAddress(String SenderAddress, String ReceiverAddress)
    {
        this.SenderAddress = SenderAddress;
        this.ReceiverAddress = ReceiverAddress;
    }


    public void isThereText()
    {
        System.out.println("Write your text.");
    }
    public String getSenderAddress() {return SenderAddress;}
    public String getReceiverAddress() {return ReceiverAddress;}

    public void setSenderAddress(String SenderAddress) {this.SenderAddress=SenderAddress;}
    public void setReceiverAddress(String ReceiverAddress) {this.ReceiverAddress=ReceiverAddress;}
}