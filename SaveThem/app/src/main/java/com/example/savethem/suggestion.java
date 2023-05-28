package com.example.savethem;

import java.time.LocalDateTime;

public class suggestion {

        protected int id;
        protected LocalDateTime dateTime;
        protected String user;
        protected String title;
        protected String description;
        protected String location;
        protected String animalType;

        public suggestion(int id, String user, String description, String location, String animalType)
        {
            this.id=id;
            this.dateTime= LocalDateTime.now();
            this.user=user;
            this.description=description;
            this.location=location;
            this.animalType=animalType;
        }

        public int getId() {return id;}


}

