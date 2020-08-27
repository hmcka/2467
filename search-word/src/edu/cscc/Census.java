package edu.cscc;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Census {
    public static HashMap<String,Citizen> loadCitizenMap(String fname) {

        ArrayList<Citizen> citizens = new ArrayList<Citizen>();

        HashMap<String, Citizen> citizenMap = new HashMap<>();

        try{
            Scanner scan = new Scanner(new File(fname));
            String[] FileNextLine;

            while (scan.hasNextLine()) {
                FileNextLine = scan.nextLine().split(",");
                Citizen citizen = new Citizen("", "", "", "");

                citizen.setName(FileNextLine[0]);
                citizen.setRank(FileNextLine[1]);
                citizen.setCount(FileNextLine[2]);
                citizen.setProportion(FileNextLine[3]);

                citizens.add(citizen);
                citizenMap.put(citizen.getName(), citizen);
                }

        }catch(FileNotFoundException notfoundex) {
            System.err.println("File:"+fname+" not found");
            return null;

        }catch(NumberFormatException numformex){
            System.err.println("Exception occurred in parsing the file");
        }

        //System.out.println(citizenMap);
        return citizenMap;
    }
}