package edu.cscc;

import java.util.HashMap;
import java.util.Scanner;

public class Main {
    private final static String CENSUSDATAFNAME = "Surnames_2010Census.csv";

    public static void main(String[] args) {

        HashMap<String, Citizen> citizenMap = Census.loadCitizenMap(CENSUSDATAFNAME);

        if (citizenMap != null) {
            while (true) {
                String lastName;
                Scanner input = new Scanner(System.in);

                System.out.print("Enter Surname (or 'quit' to end): ");
                lastName = input.nextLine().trim().toUpperCase();

                if ("quit".equalsIgnoreCase(lastName)) break;

                Citizen citizen = citizenMap.get(lastName);

                if (citizen != null && (citizenMap.containsKey(lastName))) {
                    System.out.println(citizen.toString());
                } else {
                    System.out.println("Surname: " + lastName + " not found");
                }
            }
        }
    }
}

