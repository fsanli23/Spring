package com.sanli;

import org.springframework.stereotype.Component;

@Component


public class Java {

    OfficeHours officeHours;

    public Java( ) {

    }



    public void getTeachingHour() {

        System.out.println("Weekly teaching hour: " + 20 + officeHours.getOfficeHour());
    }


}
