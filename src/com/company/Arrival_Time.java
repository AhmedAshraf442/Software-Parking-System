package com.company;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Arrival_Time {
    static public void Set_Arrival_Time ()
    {
        Date sdate = new Date();
        SimpleDateFormat ssdf = new SimpleDateFormat("hh:mm:ss");
        System.out.println("Arrival time is: " + ssdf.format(sdate));
        Park_in.sss = sdate;
    }

}
