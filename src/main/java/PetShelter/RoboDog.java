package PetShelter;

public class RoboDog extends RoboticPet implements Dogs {

    private int maintenanceLvl;


    public RoboDog(String name, String description){
        int randomMaintenanceLvl = (int)(Math.random()*8) +4;
        this.maintenanceLvl = randomMaintenanceLvl;
    }

    @Override
    public void walkAllDogs() {
        maintenanceLvl --;
        System.out.println("You walk the Robot Dog, they don't seem to like this. They don't seem to dislike this either.");
    }
    @Override
    public void tick(){

    }

    public void oilAndMaintain() {
        health += 4;
        maintenanceLvl += 4;
        if(health < 5) {
            System.out.println("Your pet doesn't seem to be very happy");
        }
    }
    public int getMaintenanceLvl() {
        return maintenanceLvl;
    }


}
