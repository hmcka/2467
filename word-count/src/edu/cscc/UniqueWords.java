package edu.cscc;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.*;

/**
 * Utility to process a document to into sorted set of unique words
 * @author student name
 */
public class UniqueWords {
    /**
     * Read file one line at a time
     * Break input String into words
     * Store unique words sorted into alphabetic order
     *
     * @param myfile input file
     * @return sorted set of unique words
     */

        public static Set<String> processDocument(File myfile) {
        Scanner input = null;
        //File file = new File(fname);
        String[] tok = new String[0];
        Integer words = 0;
        List<String> list = Arrays.asList(tok);
        Set<String> wordSet = new TreeSet<String>(list);


        try {
            //Scanner scan = new Scanner(new File(fname));
            input = new Scanner(new FileReader(myfile));

            while (input.hasNextLine()) {
                String str = input.nextLine();
                str = str.replaceAll("[^a-zA-Z \n]", " ");
                tok = str.split(" ");

                for (int i = 0; i < tok.length; ++i) {
                    tok[i] = tok[i].toLowerCase();
                }

                list = Arrays.asList(tok);
                wordSet.addAll(list);
            }
            for(String var : wordSet){
                System.out.println(var);
                words ++;
            }
            System.out.println("Number of words: " + words);
        } catch (FileNotFoundException e) {
            System.out.println("Cannot access file");
        } finally {
            if (input != null) {
                input.close();
            }
        }
        return wordSet;
    }}
        /**
         * Remove all punctuation and numbers from String
         * Tokenize - break into individual words
         * Convert all words to lower case
         * @param str initial non-null String
         * @return array of words from initial String
         */

