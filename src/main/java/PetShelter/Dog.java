package PetShelter;

public class Dog extends OrganicPet implements Dogs {
    private int cageCleanliness;



    public Dog(String name, String description){
        super(name, description);
        this.cageCleanliness = 2;
    }

    public int getCageCleanliness(){ return cageCleanliness;}

    @Override
    public void walkAllDogs() {
        cageCleanliness -= 2;
        boredom -= 2;
    }
    public void cleanCage(){
        cageCleanliness += 10;
    }
}
