package edu.cscc;

import java.io.File;
import java.util.Set;

public class Main {

    private final static String fname = "AtTheMountainsOfMadness_HP_Lovecraft.txt";

    public static void main(String[] args) {
        File myfile = new File(fname);

        Set<String> printedWords = UniqueWords.processDocument(myfile);
}
}

