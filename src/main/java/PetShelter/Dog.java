package PetShelter;

public class Dog extends OrganicPet implements Dogs {
    private int cageCleanliness;


    public Dog(String name, String description, int thirst){
        int randomThirst = (int)(Math.random()*8) +4;
        int randomBoredom = (int)(Math.random()*8) +4;
        int randomHunger = (int)(Math.random()*8) +4;
        int randomCageCleanliness = (int)(Math.random()*6)+1;
        this.thirst = 6;
        this.boredom = randomBoredom;
        this.hunger = randomHunger;
        this.cageCleanliness = randomCageCleanliness;
    }
    public int getCageCleanliness(){ return cageCleanliness;}

    @Override
    public void walkAllDogs() {
        cageCleanliness -= 2;
        boredom -= 2;
    }
    @Override
    public void tick() {
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
