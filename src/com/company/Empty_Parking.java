package com.company;

public class Empty_Parking {
    static public boolean Empty_Parking() {
        boolean f = true;
        for (int i = 0; i < Parking.numOfSlots; i++) {
            if (Parking.Slots[i].Slot_status) {
                f = false;
            }
        }
        return f;
    }

}
