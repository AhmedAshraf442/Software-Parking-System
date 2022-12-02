package com.company;
import java.util.*;
import java.text.SimpleDateFormat;

public class Park_out {
    public Vehicle vehicle;
    public Parking_Fees parking_fees;
    public static Depatrure_Time depatrure_time;
    public static Time_Of_Stay time_of_stay;
//**********************************************

    Park_out(Vehicle vehicle) {
        depatrure_time = new Depatrure_Time();
        time_of_stay = new Time_Of_Stay();
        parking_fees = new Parking_Fees();
        this.vehicle = vehicle;
        Parking.Vehicles.remove(this);
        int temp = this.vehicle.vs_id;
        Parking.Slots[temp].Slot_status = false;
    }

}