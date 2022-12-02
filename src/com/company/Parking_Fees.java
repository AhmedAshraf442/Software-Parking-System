package com.company;

public class Parking_Fees {
     Parking_Fees() {
        Total_income.Number_Of_Vehicles_serviced++;
        System.out.println("The parking fees is: " + (Time_Of_Stay.f * 5));
        Total_income.calculat_Total_income(Time_Of_Stay.f  * 5);
    }

}
