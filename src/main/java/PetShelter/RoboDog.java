package PetShelter;

public class RoboDog extends RoboticPet implements Dogs {


    public RoboDog(String name, String description, int health){
        super(name,description,health);

    }
    @Override
    public void walkAllDogs() {
        maintenanceLvl --;
        System.out.println("You walk the Robot Dog, they don't seem to like this. They don't seem to dislike this either.");
    }
    }

