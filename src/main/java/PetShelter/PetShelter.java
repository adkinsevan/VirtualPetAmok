package PetShelter;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class PetShelter {
    Map<String, PetShelterAnimals> animalList = new HashMap<>();

    public void addPet(PetShelterAnimals petToAdd){
        animalList.put(petToAdd.getPetName(), petToAdd);
}
    public void remove(PetShelterAnimals petToRemove){ animalList.remove(petToRemove.getPetName(), petToRemove); }

    public Collection<PetShelterAnimals> getAllAnimals(){
        return animalList.values();
    }

    public PetShelterAnimals findPet(String petName){
        return animalList.get(petName);
    }


    public void giveWaterAll(){
        for (PetShelterAnimals giveWater : animalList.values()){
            giveWater.giveWater();
        }
    }
    public void playWithAll(){
        for (PetShelterAnimals playWith : animalList.values()){
            playWith.playWithAll();
        }
    }
    public void feedAll() {
        for (PetShelterAnimals feed : animalList.values()) {
            feed.feedAll();
        }
    }
    public void tick(){
        for (PetShelterAnimals tick : animalList.values()){
            tick.tick();
        }
    }
}


