package PetShelter;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PetShelterTest {
    PetShelter underTest = new PetShelter();
    Dog testDog = new Dog("Test Dog", "This Dog is a test ",2);
    Cat testCat = new Cat("Test Cat", "This Cat is a test");

    @Test
    public void shouldBeAbleToAddDog(){
        underTest.addPet("Maya", testDog);
        PetShelterAnimals findDog =  underTest.findPet("Test Dog");
        assertEquals("Test Dog",findDog.getName());
    }
    @Test
    public void shouldBeAbleToAddCat(){
        underTest.addPet("Maya", testCat);
        PetShelterAnimals findCat =  underTest.findPet("Test Cat");
        assertEquals("Test Cat",findCat.getName());
    }
    @Test
    public void removingPetTest(){
        underTest.addPet("Maya", testDog);
        underTest.remove("Maya");
        PetShelterAnimals findPet = underTest.findPet("Test Dog");
        assertEquals(findPet,null);
    }

}
