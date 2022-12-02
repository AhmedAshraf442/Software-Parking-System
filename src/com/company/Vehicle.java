package com.company;
public class Vehicle
{
    public String Model_Name;
    public int unique_id;
    public int Vehicle_Width;
    public int Vehicle_Depth;
    public Park_in park_in;
    public Park_out park_out;
    public int vs_id = -1;

//**********************************************

    Vehicle (String model_Name , int vehicle_Width , int vehicle_Depth)
    {
        Parking.Vehicles.add(this);
        this.Model_Name = model_Name;
        this.Vehicle_Width = vehicle_Width;
        this.Vehicle_Depth = vehicle_Depth;
        Parking.currVehicle = this;

        if (Parking.Configuration){park_in = new ParkInFirstCome(this);}
        else {park_in = new ParkInBestFit(this);}
    }

    public void Leave_Parking ()
    {
        park_out = new Park_out(this);
    }
}
