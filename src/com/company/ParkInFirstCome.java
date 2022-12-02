package com.company;

import java.util.Date;

public class ParkInFirstCome extends Park_in {

    public ParkInFirstCome(Vehicle vehicle) {
        super(vehicle);
    }

    @Override
    public void ParkIN ()
    {
        int i = 0;
        for ( ; i < Parking.numOfSlots ; i++)
        {
            if (Parking.Slots[i].Slot_status)
            {
                continue;
            }
            Parking.Slots[i].Slot_status = true;
            break;
        }
        //return Parking.Slots[i];
        System.out.println("Go to Slot no : "+(i+1));
        vehicle.vs_id = i;
        Parking.Slots[i].SVehicle=vehicle;
    }


}
