package PetShelter;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PetShelterTest {
    PetShelter underTest = new PetShelter();
    Dog testDog = new Dog("Test Dog", "This Dog is a test");
    Cat testCat = new Cat("Test Cat", "This Cat is a test");

    @Test
    public void shouldBeAbleToAddDog(){
        underTest.addPet("Test Dog", testDog);
        PetShelterAnimals findingPet =  underTest.findPet("Test Dog");
        assertEquals(findingPet, testDog);
    }
    @Test
    public void shouldBeAbleToAddCat(){
        underTest.addPet("Test Cat", testCat);
        PetShelterAnimals findingPet =  underTest.findPet("Test Cat");
        assertEquals(findingPet, testCat);
    }
    @Test
    public void removingPetTest(){
        underTest.addPet("Test Dog",testDog);
        underTest.remove("Test Dog");
        PetShelterAnimals findPet = underTest.findPet("Test Dog");
        assertEquals(findPet,null);
    }

}
