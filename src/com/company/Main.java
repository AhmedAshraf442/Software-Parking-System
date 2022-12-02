package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int count = 0;
        boolean Flag = true;
        boolean Exit = true;

        while (Exit) {
            if (Flag) {
                if (count == 0) {
                    System.out.println("Welcome owner");
                    boolean Cconfig;
                    while (true) {
                        int C;
                        System.out.println("Please, Enter Configuration Type to the Parking, 1 for First come and 2 for Best fit : ");
                        C = in.nextInt();
                        if (C == 1) {
                            Cconfig = true;
                            break;
                        } else if (C == 2) {
                            Cconfig = false;
                            break;
                        } else {
                            System.out.println("incorrect input, Please Try again");
                            continue;
                        }
                    }
                    System.out.println("now, Enter the number of Slots in the Parking : ");
                    int numOfSlots;
                    numOfSlots = in.nextInt();
                    Parking parking = new Parking(Cconfig, numOfSlots);
                    Parking.set_Slots_info();
                } else {
                    int u;
                    System.out.println("Welcome owner,Choose the number of the operation you want to perform:\n" +
                            "1- Update Slots info,\n2- Update Configuration type,\n3- Display Slots\n4- Display Total income and no Vehicle serviced\n" +
                            "5-Exit");

                    u = in.nextInt();

                    if (u == 1) {
                        int S;
                        while (true) {
                            System.out.println("Enter ID of Slot you want to update:");
                            S = in.nextInt();
                            if (S <= Parking.numOfSlots && S >= 0) {
                                int W, D;
                                System.out.println("Enter nwe Width and depth of Slot you want to update:");
                                W = in.nextInt();
                                D = in.nextInt();
                                Parking.Slots[S].Slot_Width = W;
                                Parking.Slots[S].Slot_Depth = D;
                                break;
                            } else {
                                System.out.println("incorrect Slot,Try Again");
                                continue;
                            }
                        }

                    } else if (u == 2) {
                        while (true) {
                            int C;
                            System.out.println("Please, Enter Configuration Type to the Parking, 1 for First come and 2 for Best fit : ");
                            C = in.nextInt();
                            if (C == 1) {
                                Parking.Configuration = true;
                                break;
                            } else if (C == 2) {
                                Parking.Configuration = false;
                                break;
                            } else {
                                System.out.println("incorrect input, Please Try again");
                                continue;
                            }
                        }
                    } else if (u == 3) {
                        Display.Display_Slots();
                    } else if (u == 4) {
                        Total_income.Display_Total_income();
                    }else if (u==5){
                        Total_income.Display_Total_income();
                        Exit=false;
                        System.out.println("Program has been ended");
                        break;
                    }
                    else {
                        System.out.println("incorrect input, Please Try again");
                        continue;
                    }
                }
            }

            if (!Flag) {
                while (true) {
                    System.out.println("Welcome Driver, Enter 1 for Park in and 2 for Park out");
                    int D;
                    D = in.nextInt();
                    if (Empty_Parking.Empty_Parking() && D==2){
                        System.out.println("No Vehicles in the Parking");
                        continue;
                    }

                    if (D == 1) {
                        if (Checking_Empty_Slots.checking_Empty_Slots()) {
                            Display.Display_Slots();
                            System.out.println("Enter model name, width and depth");
                            String name;
                            name = in.next();
                            int width;
                            int depth;
                            width = in.nextInt();
                            depth = in.nextInt();
                            Vehicle NewVehicle = new Vehicle(name, width, depth);
                            NewVehicle.park_in.ParkIN();
                            if (NewVehicle.vs_id != -1) {
                                NewVehicle.park_in.Set_Arrival_Time();
                            }
                            break;
                        } else {
                            System.out.println("Sorry, No Empty Slots :( ");
                        }
                    } else if (D == 2) {
                        while (true) {
                            Display.Display_Slots();
                            System.out.println("Enter Slot ID to leave");
                            int IDS;
                            IDS = in.nextInt();
                            IDS = IDS - 1;
                            if (Parking.Slots[IDS].Slot_status) {
                                Parking.Slots[IDS].SVehicle.Leave_Parking();
                                Display.Display_Slots();
                                break;
                            } else {
                                System.out.println("incorrect input Slot, try again");
                                continue;
                            }
                        }
                        break;
                    } else {
                        System.out.println("incorrect input, try again");
                        continue;
                    }
                }
            }
            count++;
            int U;
            while (true) {
                System.out.println("Enter 1 to Owner , 2 to customer");
                U = in.nextInt();
                if (U == 1) {
                    Flag = true;
                    break;
                } else if (U == 2) {
                    Flag = false;
                    break;
                } else {
                    System.out.println("incorrect input,Try Again");
                    continue;
                }
            }
        }
    }
}
