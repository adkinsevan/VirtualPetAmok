package PetShelter;

public class RoboCat extends RoboticPet {

    private int maintenanceLvl;

    public RoboCat(String name, String description) {
        super(name, description);
        int randomMaintenanceLvl = (int)(Math.random()*8) +4;
        this.maintenanceLvl = randomMaintenanceLvl;

    }

    @Override
    public void giveWater() {

    }

    @Override
    public void feed() {

    }

}