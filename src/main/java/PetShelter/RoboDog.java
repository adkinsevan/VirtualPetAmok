package PetShelter;

public class RoboDog extends RoboticPet implements Dogs {


    public RoboDog(String name, String description){
        super(name,description);
        int randomMaintenanceLvl = (int)(Math.random()*8) +4;
        this.maintenanceLvl = randomMaintenanceLvl;

    }

    @Override
    public void giveWater() {

    }

    @Override
    public void feed() {
    }

    @Override
    public void walkAllDogs() {
        maintenanceLvl --;
        System.out.println("You walk the Robot Dog, they don't seem to like this. They don't seem to dislike this either.");
    }

    @Override
    public void cleanCage(String petName) {
        System.out.println("ERROR: CLEANING CAGE DOES NOT COMPUTE");
    }
}

