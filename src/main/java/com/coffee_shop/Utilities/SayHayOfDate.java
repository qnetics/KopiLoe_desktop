package com.coffee_shop.Utilities;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class SayHayOfDate {
    
    private String setDay;

    public SayHayOfDate() {

        LocalDateTime localDateTime = LocalDateTime.now();
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("HH");

        int Hours = Integer.parseInt( localDateTime.format(dateTimeFormatter) );

        String Day;

        if ( ( Hours >= 4 ) && ( Hours <= 10 ) ) {

            Day = "Pagi";


        } else if ( ( Hours >= 11 ) && ( Hours <= 15 ) ) {

            Day = "Siang";


        } else if ( ( Hours >= 16 ) && ( Hours <= 18 ) ) {

            Day = "Sore";


        } else if ( ( ( Hours >= 19 ) && ( Hours <= 23 ) ) || ( Hours <= 3 ) ) {

            Day = "Malam";

        } else {

            Day = "Datang";

        }

        this.setDay = Day;

    }

    public String getSayHay() { return this.setDay; }

}
