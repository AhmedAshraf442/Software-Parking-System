package com.company;

import java.util.Date;

public class ParkInBestFit extends Park_in {

    public ParkInBestFit(Vehicle vehicle) {
        super(vehicle);
    }

    @Override
    public void ParkIN ()
    {
        int best_Slot = 0;
        int best_Slot_dimension = 10000;
        boolean flag = false;
        int temp = 0;
        for (int i = 0 ; i < Parking.numOfSlots ; i++)
        {
            if (Parking.Slots[i].Slot_status) {
                continue;
            }
            if (vehicle.Vehicle_Width <= Parking.Slots[i].Slot_Width && vehicle.Vehicle_Depth <= Parking.Slots[i].Slot_Depth)
            {
                temp = (Parking.Slots[i].Slot_Width - vehicle.Vehicle_Width) + ( Parking.Slots[i].Slot_Depth- vehicle.Vehicle_Depth);

                if (temp < best_Slot_dimension||temp==0)
                {
                    flag = true;
                    best_Slot_dimension = temp;
                    best_Slot = i;
                }
            }
        }
        if (!flag )
        {
            System.out.println("No suitable slot.");
        }
        else {
            System.out.println("Go to Slot no : " + (best_Slot + 1));
            Parking.Slots[best_Slot].Slot_status = true;
            vehicle.vs_id = best_Slot;
            Parking.Slots[best_Slot].SVehicle = vehicle;
        }
    }
}
