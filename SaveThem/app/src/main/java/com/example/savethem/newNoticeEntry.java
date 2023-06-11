package com.example.savethem;

import android.os.Build;

import java.time.LocalDateTime;

public class newNoticeEntry {
    private int id;
    private LocalDateTime dateTime;
    private int userId;
    private String userFirstName;
    private String userLastName;

    private String location;

    private photoItem entryPhoto;

    //shown as createEntry() in sequence diagram
    public newNoticeEntry(int id, loggedInUser user, String location, photoItem entryPhoto)
    {
        this.id=id;
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            this.dateTime= LocalDateTime.now();
        }
        this.userId=user.getUserId();
        this.userFirstName=user.getUserFirstName();
        this.userLastName=user.getUserLastName();
        this.location=location;
        this.entryPhoto=entryPhoto;
    }

    public int getId() {return id;}
    public int getUserId(){return userId;}

    public void successMess() {
        System.out.println("Your submit has successfully sent to administrators");
    }

}
