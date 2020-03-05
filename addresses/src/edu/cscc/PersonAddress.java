package edu.cscc;

//PersonAddress class derived from Address
//programmed by Hethur Aluma

public class PersonAddress extends Address {
    //private string fields businessName and address2
    private String personName;

    //Generate constructor and all getters and setters
    public PersonAddress (String personName, String streetAddress, String city, String state, String zip) {
        super(streetAddress, city, state, zip);
        this.personName = personName;
    }

    public String getPersonName() {
        return this.personName;
    }

    //Add a printLabel() method
    @java.lang.Override //what is this that was added?
    public void printLabel() {
        System.out.println(this.personName);
        System.out.println(this.streetAddress);
        System.out.println(this.city + ", " + this.state + "  " + this.zip);
    }
}

