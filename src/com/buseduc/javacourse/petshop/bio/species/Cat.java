package com.buseduc.javacourse.petshop.bio.species;

import com.buseduc.javacourse.petshop.animalproperties.Noise;
import com.buseduc.javacourse.petshop.animalproperties.Noisy;
import com.buseduc.javacourse.petshop.bio.genes.Mammalia;

public class Cat extends Mammalia implements Noisy {
    public static String name = "Cat";

    public Cat() {
        super.setCategory(BioCategory.SPECIES);
    }

    @Override
    public String getName() {
        return name;
    }


    @Override
    public Noise makeNoise() {
        Noise catMeow = new Noise("Meow", 0.1, true, 50.);
        return catMeow;

    }
}
