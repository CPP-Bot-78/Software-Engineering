package com.example.savethem;

import java.time.LocalDateTime;

public class suggestion {

        protected int id;
        protected LocalDateTime dateTime;
        protected int userId;
        protected String userFirstName;
    protected String userLastName;
        protected String animalName;
        protected String description;
        protected String location;
        protected String animalType;
        //shown as createEntry() in sequence diagram
        public suggestion(int id, loggedInUser user, String animalName, String description, String location, String animalType)
        {
            this.id=id;
            this.dateTime= LocalDateTime.now();
            this.userId=user.getUserId();
            this.userFirstName=user.getUserFirstName();
            this.userLastName=user.getUserLastName();
            this.animalName=animalName;
            this.description=description;
            this.location=location;
            this.animalType=animalType;
        }

        public int getId() {return id;}

        public void sendToAdmin()
        {
            System.out.println("Η πρότασης σας έχει σταλεί στους υπευθύνους της εγκυκλοπαίδειας");
        }

}

