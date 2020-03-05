package edu.cscc;

//program that adds objects to a list and then prints them out
//programmed by Hethur Aluma

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        // TODO Add 3 business address to lis
        BusinessAddress businessAddress1 = new BusinessAddress("550 East Spring St.", "Columbus", "OH", "43215", "Columbus State", "Eibling 302B");
        BusinessAddress businessAddress2 = new BusinessAddress("P.O. Box 2075", "Columbus", "OH", "43201", "AEP", null);
        BusinessAddress businessAddress3 = new BusinessAddress("2079 N. Main St.", "Columbus", "OH", "43227", "Bill’s Coffee", null);

        // TODO Add 3 person addresses to list
        PersonAddress personAddress1 = new PersonAddress("Saul Goodman", "1200 N. Fourth St.", "Worthington", "OH", "43217");
        PersonAddress personAddress2 = new PersonAddress("Mike Ehrmentraut", "207 Main St.", "Reynoldsburg", "OH", "43211");
        PersonAddress personAddress3 = new PersonAddress("Gustavo Fring", "2091 Elm St.", "Pickerington", "OH", "43191");

        ArrayList<Address> addressList = new ArrayList<Address>();
        addressList.add(businessAddress1);
        addressList.add(businessAddress2);
        addressList.add(businessAddress3);

        addressList.add(personAddress1);
        addressList.add(personAddress2);
        addressList.add(personAddress3);

        for (Address address : addressList) {
	        address.printLabel();
            System.out.println("====================");
        }
    }
}
