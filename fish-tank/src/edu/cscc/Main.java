package edu.cscc;

public class Main {

    public static void main(String[] args) {
        //Create an instance of HoldingTank, named tank with a maximum capacity of 1000 gallons and a current volume of 600 gallons.
	    HoldingTank holdingTank1 = new HoldingTank(600, 1000);

        //Print the current volume of the tank
        holdingTank1.printVolume();

        //Add 300 gallons
        holdingTank1.addVolume(300);

        //Drain 50 gallons
        holdingTank1.drainVolume(50);

        //Print the current volume of the tank
        holdingTank1.printVolume();

        //Add 500 gallons
        holdingTank1.addVolume(500);

        //Drain 250 gallons
        holdingTank1.drainVolume(250);

        //Print the current volume of the tank
        holdingTank1.printVolume();

        //Drain 1200 gallons
        holdingTank1.drainVolume(1200);

        //Add 200 gallons
        holdingTank1.addVolume(200);

        //Drain 25 gallons
        holdingTank1.drainVolume(25);

        //Print the current volume of the tank
        holdingTank1.printVolume();
        }
    }

