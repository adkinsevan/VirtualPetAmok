package PetShelter;

import java.util.ArrayList;
import java.util.Collection;

public abstract class RoboticPet extends PetShelterAnimals {

    public int maintenanceLvl;

    public RoboticPet(String name, String description, int health) {
        super(name, description, health);
        int randomMaintenanceLvl = (int)(Math.random()*8) +4;
        this.maintenanceLvl = 2;
    }

    public int getMaintenanceLvl() {
        return maintenanceLvl;
    }


    public void oilAndMaintainRoboticPets() {
        Collection<PetShelterAnimals> roboticPet = new ArrayList();
        for (PetShelterAnimals robotic : animalList.values()) {
            if (robotic instanceof RoboticPet) {
                robotic.addPet("petName", robotic);
            }
            oilAndMaintain();
        }
    }
    public void oilAndMaintain() {
        health += 4;
        maintenanceLvl += 4;
        }
        @Override
        public void tick(){
            maintenanceLvl--;
            health--;
        }
        @Override
        public void playWith() {
            maintenanceLvl --;
            health --;
        }
    }


