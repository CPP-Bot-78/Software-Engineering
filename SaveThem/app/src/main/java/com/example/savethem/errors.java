package com.example.savethem;

public class errors {
    protected String errorMessage;

    public errors(String message)
    {this.errorMessage=message;}

    public void showError()
    {
        System.out.println("Συγγνώμη, κάτι δεν λειτούργησε όπως θα έπρεπε. Μήνυμα σφάλματος: " + errorMessage);
    }
}
