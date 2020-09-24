package PetShelter;

public class Cat extends OrganicPet {
    private int litterBoxCleanliness;


    public Cat(String name, String description, int health){
        super(name, description,health);
        this.litterBoxCleanliness = 2;
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
