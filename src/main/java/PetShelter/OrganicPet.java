package PetShelter;

import java.util.ArrayList;
import java.util.Collection;

public abstract class OrganicPet extends PetShelterAnimals {
    protected int hunger;
    protected int thirst;
    protected int boredom;
    protected int health;

    public int getHunger() {
        return hunger;
    }

    public int getThirst() {
        return thirst;
    }

    public int getBoredom() {
        return boredom;
    }

    public void giveWater() {
        thirst -= 4;
        health += 4;
    }

    public void playWith() {
        boredom -= 4;
        health += 4;
    }

    public void feed() {
        hunger -= 4;
        health += 4;
    }

    public void feedAllOrganicPets() {
        Collection<PetShelterAnimals> organicPets = new ArrayList<>();
        for (PetShelterAnimals organic : animalList.values()) {
            if (organic instanceof OrganicPet) {
                organicPets.add(organic);
                feed();
            }
        }
    }
    public void giveWaterAllOrganicPets() {
        Collection<PetShelterAnimals> organicPets = new ArrayList<>();
        for (PetShelterAnimals organic : animalList.values()) {
            if (organic instanceof OrganicPet) {
                organicPets.add(organic);
                giveWater();
            }
        }
    }
        public void tick (){
        }
    }

