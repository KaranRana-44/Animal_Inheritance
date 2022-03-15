package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Animal lisa = new Animal("carnivore", "lion", "Lisa");
        System.out.println(lisa);

        Herbivore gary = new Herbivore("giraffe", "Gary");
        System.out.println(gary);

        Elephant percy = new Elephant("Percy", 2.0);
        System.out.println(percy);


    }
}
