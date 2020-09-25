package PetShelter;

public class Dog extends OrganicPet implements Dogs {
    private int cageCleanliness;



    public Dog(String name, String description){
        super(name, description);
        this.cageCleanliness = 2;
        int randomHunger = (int) (Math.random()*6)+4;
        int randomThirst = (int) (Math.random()*6)+4;
        int randomBoredom = (int) (Math.random()*6)+4;
        this.hunger = randomHunger;
        this.thirst = randomThirst;
        this.boredom = randomBoredom;
    }

    public int getCageCleanliness(){ return cageCleanliness;}

    @Override
    public void walkAllDogs() {
        cageCleanliness -= 2;
        boredom -= 2;
    }
    @Override
    public void cleanCage(String petName) { cageCleanliness += 10; }
}
