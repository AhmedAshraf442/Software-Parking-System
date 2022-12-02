package com.company;
public class Display
{
    static void Display_Slots ()
    {
        System.out.println("Available places are: ");
        System.out.print(" | ");
        for (int i = 0 ; i < Parking.numOfSlots ; i++)
        {
            if (!Parking.Slots[i].Slot_status)
            {
                System.out.print( (i+1) + " | ");
            }
            else
            {
                System.out.print("! | ");
            }
        }
        System.out.println(" ");
    }
}
