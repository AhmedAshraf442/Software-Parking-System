package com.company;
public class Slot
{
    public int Slot_ID ;
    public int Slot_Width;
    public int Slot_Depth;
    public boolean Slot_status ;
    public Vehicle SVehicle;

//**********************************************

    Slot(int slot_ID,int slot_Width , int slot_Depth )
    {
        this.Slot_ID = slot_ID;
        this.Slot_Width = slot_Width;
        this.Slot_Depth = slot_Depth;
        this.Slot_status=false;

    }
}