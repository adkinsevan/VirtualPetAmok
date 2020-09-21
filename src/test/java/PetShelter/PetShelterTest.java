package PetShelter;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PetShelterTest {
    PetShelter underTest = new PetShelter();
    Dog testDog = new Dog("Test Dog", "This Dog is a test ");
    Cat testCat = new Cat("Test Cat", "This Cat is a test");
    RoboDog testRoboDog = new RoboDog("Test RoboDog", "This RoboDog is a test", 0);
    RoboCat testRoboCat = new RoboCat("Test RoboCat", "This RoboCat is a test", 0);

    @Test
    public void shouldBeAbleToAddDog(){
        underTest.addPet(testDog);
        PetShelterAnimals findDog =  underTest.findPet("Test Dog");
        assertEquals("Test Dog",findDog.getPetName());
    }
    @Test
    public void shouldBeAbleToAddCat(){
        underTest.addPet(testCat);
        PetShelterAnimals findCat =  underTest.findPet("Test Cat");
        assertEquals("Test Cat",findCat.getPetName());
    }
    @Test
    public void removingPetTest(){
        underTest.addPet(testDog);
        underTest.remove(testDog);
        PetShelterAnimals findPet = underTest.findPet("Test Dog");
        assertEquals(findPet,null);
    }

}
