package com.example.savethem;

public class ErrorPage {
    private String errorMessage;

    public ErrorPage(String message)
    {this.errorMessage=message;}

    public void showError()
    {
        System.out.println("Συγγνώμη, κάτι δεν λειτούργησε όπως θα έπρεπε. Μήνυμα σφάλματος: " + errorMessage);
    }
}
