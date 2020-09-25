package PetShelter;

public class Cat extends OrganicPet {
    private int litterBoxCleanliness;


    public Cat(String name, String description){
        super(name, description);
        this.litterBoxCleanliness = 2;
        int randomHunger = (int) (Math.random()*6)+4;
        int randomThirst = (int) (Math.random()*6)+4;
        int randomBoredom = (int) (Math.random()*6)+4;
        this.hunger = randomHunger;
        this.thirst = 6;
        this.boredom = randomBoredom;
    }
    public void cleanLiterBox() {
        litterBoxCleanliness += 10;
    }
}
