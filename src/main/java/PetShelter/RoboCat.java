package PetShelter;

public class RoboCat extends RoboticPet {

    private int maintenanceLvl;

    public RoboCat(String name, String description){
        int randomMaintenanceLvl = (int)(Math.random()*8) +4;
        this.maintenanceLvl = randomMaintenanceLvl;
    }

    public void oilAndMaintain() {
        health += 4;
        maintenanceLvl += 4;
        if(health < 5) {
            System.out.println("Your pet doesn't seem to be very happy");
        }
    }
    public int getMaintenanceLvl(){
        return maintenanceLvl;
    }
}
