package PetShelter;

public abstract class PetShelterAnimals extends PetShelter {
    public String name;
    public String description;

    public int health;

    public PetShelterAnimals(String name, String description, int health){
        this.name = name;
        this.description = description;
        this.health = health;
    }

    public int getHealth(){
        return health;
    }
    public String getName(){
        return name;
    }
    public String getDescription(){
        return description;

    }
    public abstract void playWith();
    public abstract void tick();
}
