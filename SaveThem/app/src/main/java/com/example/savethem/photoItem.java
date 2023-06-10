package com.example.savethem;

import android.os.Build;

import java.time.LocalDateTime;

public class photoItem {

        private int id;
        private LocalDateTime dateTime;
        private int userId;
        private String userFirstName;
        private String userLastName;

        //shown as autoSetPickInfo() in sequence diagram
        public photoItem(int id, loggedInUser user)
        {
            this.id=id;
            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
                this.dateTime= LocalDateTime.now();
            }
            this.userId=user.getUserId();
            this.userFirstName=user.getUserFirstName();
            this.userLastName=user.getUserLastName();

        }

    public int getId() {return id;}
    public int getUserId(){return userId;}
}

