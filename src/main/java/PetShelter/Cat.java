package PetShelter;

public class Cat extends OrganicPet {
    private int litterBoxCleanliness;


    public Cat(String name, String description){
        super(name, description);
        this.litterBoxCleanliness = 2;
    }
    public void cleanLiterBox() {
        litterBoxCleanliness += 10;
    }
}
