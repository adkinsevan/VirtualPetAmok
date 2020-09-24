package PetShelter;

public abstract class PetShelterAnimals extends PetShelter {
    public String name;
    public String description;

    public int health;

    public PetShelterAnimals(String name, String description){
        int randomHealth = (int) (Math.random() * 8) + 2;
        this.name = name;
        this.description = description;
        this.health = randomHealth;
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
    public abstract void giveWater();
    public abstract void feed();
    public abstract void playWith();
    public abstract void tick();
}
