package com.company;

public class Elephant extends Herbivore {

    private double tusk;

    public Elephant (String n, double t){
        super("elephant",n);
        tusk=t;
    }
    public String toString(){
        return super.toString()+" with tusks "+tusk+" meters long.";
    }

}
