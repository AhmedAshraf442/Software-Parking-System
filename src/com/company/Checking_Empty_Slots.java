package com.company;

public class Checking_Empty_Slots {
    static public boolean checking_Empty_Slots ()
    {
        for (int i = 0 ; i < Parking.numOfSlots ; i++)
        {
            if (!Parking.Slots[i].Slot_status)
            {
                return true;
            }
        }
        return false;
    }
}
