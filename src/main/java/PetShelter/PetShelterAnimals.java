package PetShelter;

public abstract class PetShelterAnimals extends PetShelter {
    protected String name;
    protected String description;

    private int health;

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
}
