package com.company;
public class Total_income
{
    static public int Total_income = 0;
    static public  int Number_Of_Vehicles_serviced = 0;

//**********************************************

    static public void calculat_Total_income (int Fees)
    {
        Total_income = Total_income + Fees;

    }
    static public void Display_Total_income (){
        System.out.println("The total income is: " + (Total_income));
        System.out.println("The total number of vehicles serviced are: " + (Number_Of_Vehicles_serviced));
    }

}