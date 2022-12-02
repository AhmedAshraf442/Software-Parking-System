package com.company;
import java.util.*;
import java.text.SimpleDateFormat;

public abstract class Park_in
{
    public Vehicle vehicle ;
    static public Date sss;
    Arrival_Time arrival_time;
    public abstract void  ParkIN ();

//**********************************************

    Park_in (Vehicle vehicle)
    {
        this.vehicle = vehicle;
        Parking.currVehicle = vehicle;
    }
    public void Set_Arrival_Time(){
        Arrival_Time.Set_Arrival_Time();
    }
}