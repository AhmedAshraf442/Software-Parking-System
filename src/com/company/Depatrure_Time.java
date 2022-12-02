package com.company;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Depatrure_Time {
    static public Date eee;

    public Depatrure_Time() {
        Date edate = new Date();
        SimpleDateFormat esdf = new SimpleDateFormat("hh:mm:ss");
        System.out.println("Departure time is: " + esdf.format(edate));
        eee = edate;
    }

}
