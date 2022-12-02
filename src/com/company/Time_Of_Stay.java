package com.company;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Time_Of_Stay {
    static public int f;

    Time_Of_Stay() {
        int hour2;
        int min2;
        int second2;
        SimpleDateFormat Esf = new SimpleDateFormat("hh:mm:ss");
        String earr[] = Esf.format(Depatrure_Time.eee).split(":");
        hour2 = Integer.parseInt(earr[0]);
        min2 = Integer.parseInt(earr[1]);
        second2 = Integer.parseInt(earr[2]);

        int hour1;
        int min1;
        int second1;
        SimpleDateFormat Ssf = new SimpleDateFormat("hh:mm:ss");
        String sarr[] = Ssf.format(Park_in.sss).split(":");
        hour1 = Integer.parseInt(sarr[0]);
        min1 = Integer.parseInt(sarr[1]);
        second1 = Integer.parseInt(sarr[2]);

        int hour3 = hour2 - hour1;
        int min3 = min2 - min1;
        int second3 = second2 - second1;

        if (min3 != 0 || second3 != 0) {
            hour3++;
            f = hour3;
        } else {
            f = hour3;
        }
    }

}
