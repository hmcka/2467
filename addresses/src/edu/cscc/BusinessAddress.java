package edu.cscc;

//BusinessAddress class derived from Address
//programmed by Hethur Aluma

public class BusinessAddress extends Address {
    //private string fields businessName and address2
    private String businessName;
    private String address2;

    //Generate constructor and all getters and setters
    public BusinessAddress (String streetAddress, String city, String state, String zip, String businessName, String address2) {
        super(streetAddress, city, state, zip);
        this.businessName = businessName;
        this.address2 = address2;
    }

    public String getBusinessName() {
        return this.businessName;
    }

    public String getAddress2() {
        return this.address2;
    }

    //find out if it is null or not
    public static boolean isNullOrEmpty(String str) {
        if(str != null && !str.trim().isEmpty())
            return false;
        return true;
    }

    //Add a printLabel() method
    @java.lang.Override //what is this that was added?
    public void printLabel() {
        System.out.println(this.businessName);

        // Second line – the address2 field if it is not null or empty
        if(this.address2 != null && !this.address2.trim().isEmpty()) {
            System.out.println(this.address2);
        }

        //Third line – the StreetAddress field if it is not null or empty
        if(this.streetAddress != null && !this.streetAddress.trim().isEmpty()) {
            System.out.println(this.streetAddress);
        }

        //Fourth line – city field followed by a comma and space, the state field followed by two spaces, and the zip field
        System.out.println(this.city + ", " + this.state + "  " + this.zip);
    }
}
