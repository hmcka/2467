package edu.cscc;

public class Citizen {
    private String name;
    private String rank;
    private String count;
    private String proportion;

    // TODO - Add constructor - DONE
    public Citizen(String name, String rank, String count, String proportion) {
        this.name = name;
        this.rank = rank;
        this.count = count;
        this.proportion = proportion;
    }

    // TODO - Add getters and setters - DONE
    public String getName() {
        return name;
    }

    public String setName(String name) {
        this.name = name;
        return name;
    }

    public String getRank() {
        return rank;
    }

    public String setRank(String rank) {
        this.rank = rank;
        return rank;
    }

    public String getCount() {
        return count;
    }

    public String setCount(String count) {
        this.count = count;
        return count;
    }

    public String getProportion() {
        return proportion;
    }

    public String setProportion(String proportion) {
        this.proportion = proportion;
        return proportion;
    }

    public String toString() {
        StringBuilder str = new StringBuilder();
        str.append("Surname: "+name+"  ");
        str.append("Rank: "+rank+"  ");
        str.append("Count: "+count+"  ");
        str.append("Count: "+proportion);
        return str.toString();
    }





}

