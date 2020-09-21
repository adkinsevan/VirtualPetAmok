package PetShelter;

public abstract class PetShelterAnimals {

    protected String name;
    protected String description;
    protected int health;

    public PetShelterAnimals(String name, String description){
        this.name = name;
        this.description = description;
        health = 16;

    }


    public abstract String getPetName();
    public abstract String getDescription();
    public abstract int getHealth();

    public abstract void tick();

    public abstract void giveWater();
    public abstract void playWithAll();
    public abstract void feedAll();
}
