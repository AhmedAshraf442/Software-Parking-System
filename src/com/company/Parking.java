package com.company;
import java.util.*;

public class Parking {
    static public Scanner in = new Scanner (System.in);

    static public Vehicle currVehicle ;

    static public boolean Configuration;
    static public Slot Slots[];
    static public int numOfSlots;
    static public Vector <Vehicle> Vehicles = new Vector ();

    Parking (boolean configuration , int numOfSlots)
    {
        this.Configuration = configuration;
        this.numOfSlots=numOfSlots;
        Slots = new Slot[numOfSlots];
    }

    static public void set_Slots_info ()
    {
        int Slot_Width;
        int Slot_Depth;
        boolean Slot_status;
        for (int i = 0 ; i < numOfSlots ; i++)
        {
            System.out.println("Enter width and depth to slot num: " + (i + 1) );
            Slot_Width= in.nextInt();
            Slot_Depth= in.nextInt();
            Slots[i]=new Slot(i,Slot_Width,Slot_Depth);
        }
    }
}
