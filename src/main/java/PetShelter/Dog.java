package PetShelter;

public class Dog extends OrganicPet implements Dogs {
    private int cageCleanliness;



    public Dog(String name, String description, int health){
        super(name, description,health);
        this.cageCleanliness = 2;


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
