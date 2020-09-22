package PetShelter;

public class Dog extends PetShelterAnimals implements OrganicPet, Dogs {
    private int hunger;
    private int thirst;
    private int boredom;
    private int cageCleanliness;


    public Dog(String name, String description) {
        super(name, description);
    }
    public Dog(String name, String description, int thirst, int boredom, int hunger, int cageCleanliness){
        super(name, description);
        int randomThirst = (int)(Math.random()*8) +4;
        int randomBoredom = (int)(Math.random()*8) +4;
        int randomHunger = (int)(Math.random()*8) +4;
        int randomCageCleanliness = (int)(Math.random()*6)+1;
        this.thirst = randomThirst;
        this.boredom = randomBoredom;
        this.hunger = randomHunger;
        this.cageCleanliness = randomCageCleanliness;
    }

    @Override
    public void walkAllDogs() {
       boredom -=4;
       cageCleanliness -=3;
    }
    @Override
    public void giveWater() {
        thirst -= 4;
        health += 4;
    }
    @Override
    public void playWithAll() {
    }
    @Override
    public void feedAll() {
    }
    @Override
    public void playWith() {
        boredom -= 4;
        health += 4;
    }
    @Override
    public void feed() {
        hunger -= 4;
        health += 4;
    }

    @Override
    public String getPetName() { return name; }
    @Override
    public String getDescription() { return description; }
    @Override
    public int getHealth() { return health; }
    public int getHunger() { return hunger; }
    public int getThirst() { return thirst; }
    public int getBoredom() { return boredom; }
    public int getCageCleanliness(){ return cageCleanliness;}

    @Override
    public void tick() {
    health--;
    hunger++;
    thirst++;
    boredom++;
    cageCleanliness--;
        if(health < 5) {
            System.out.println("Your pet doesn't seem to be very happy");
        }
    }
    public void cleanCage(){
        cageCleanliness += 10;
    }
}
