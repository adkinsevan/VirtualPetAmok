package PetShelter;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class PetShelter {
    Map<String, PetShelterAnimals> animalList = new HashMap<>();

    public void addPet(String petName, PetShelterAnimals petToAdd){
        animalList.put(petName, petToAdd);
}
    public void remove(String petName){ animalList.remove(petName); }

    public Collection<PetShelterAnimals> getAllAnimals(){
        return animalList.values();
    }
    public PetShelterAnimals findPet(String petName){
        return animalList.get(petName);
    }
    public void playWithAll(){
        for (PetShelterAnimals playWith : animalList.values()){
            playWith.playWith();
        }
    }
    public void tick(){
        for (PetShelterAnimals tick : animalList.values()){
            tick.tick();
        }
    }
}


