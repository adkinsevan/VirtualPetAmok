package PetShelter;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class PetShelter {
    Map<String, PetShelterAnimals> animalList = new HashMap<>();

    public void addPet(String name, PetShelterAnimals petToAdd){
        animalList.put(petToAdd.getName(), petToAdd);
}
    public void remove(String name){ animalList.remove(name); }

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


