package PetShelter;

public class RoboDog extends RoboticPet implements Dogs {


    public RoboDog(String name, String description){
        super(name,description);

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
    }

