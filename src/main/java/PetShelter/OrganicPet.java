package PetShelter;

import java.util.ArrayList;
import java.util.Collection;

public class OrganicPet extends PetShelterAnimals {
    public int hunger;
    public int thirst;
    public int boredom;

    public OrganicPet(String name, String description){
        super(name,description);
        int randomHunger = (int) (Math.random()*6)+1;
        int randomThirst = (int) (Math.random()*6)+1;
        int randomBoredom = (int) (Math.random()*6)+1;
        this.hunger = randomHunger;
        this.thirst = randomThirst;
        this.boredom = randomBoredom;
    }
    public int getHunger() { return hunger; }
    public int getThirst() { return thirst; }
    public int getBoredom() { return boredom; }

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
        @Override
        public void tick (){
        health --;
        thirst ++;
        boredom ++;
        hunger ++;
        }
    }

