package PetShelter;

public class Cat extends OrganicPet {
    private int litterBoxCleanliness;


    public Cat(String name, String description){
//        int randomThirst = (int)(Math.random()*8) +4;
        int randomBoredom = (int)(Math.random()*8) +4;
        int randomHunger = (int)(Math.random()*8) +4;
        int randomLitterBoxCleanliness = (int)(Math.random()*6)+1;
        this.thirst = 6;
        this.boredom = randomBoredom;
        this.hunger = randomHunger;
        this.litterBoxCleanliness = randomLitterBoxCleanliness;
    }
    @Override
    public void playWith() {
        boredom -= 4;
        health += 4;
    }

    public void tick() {
        health--;
        hunger++;
        thirst++;
        boredom++;
        litterBoxCleanliness--;
        if(health < 5){
            System.out.println("Your pet doesn't seem to be very happy");
        }
    }
    public void cleanLiterBox() {
        litterBoxCleanliness += 10;
    }
}
