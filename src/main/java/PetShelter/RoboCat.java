package PetShelter;

public class RoboCat extends PetShelterAnimals implements RoboPet {

    private int maintenanceLvl;

    public RoboCat(String name, String description) {
        super(name, description);
    }
    public RoboCat(String name, String description, int maintenanceLvl){
        super(name, description);
        int randomMaintenanceLvl = (int)(Math.random()*8) +4;
        this.maintenanceLvl = randomMaintenanceLvl;
    }

    @Override
    public String getPetName() {
        return name;
    }
    @Override
    public String getDescription() {
        return description;
    }
    @Override
    public int getHealth() {
        return health;
    }
    @Override
    public void tick() {
        health --;
        maintenanceLvl --;
    }

    @Override
    public void giveWater() {
    }
    @Override
    public void playWithAll() {
    }
    @Override
    public void feedAll() {
    }

    @Override
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
