package PetShelter;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class OrganicPetTest {

        PetShelter test;
        PetShelterAnimals test1;
        OrganicPet test2;


        Dog testDog = new Dog("Test Dog", "This Dog is a test ",6);
        Cat testCat = new Cat("Test Cat", "This Cat is a test", 6);




        @Test
        public void giveWaterWillDecreaseThirst() {
            testDog.addPet("Test Dog",testDog);
            testDog.giveWater();
            assertEquals(2, testDog.getThirst());
        }
        @Test
        public void giveWaterToAllOrganicPets(){
            testDog.addPet("Test Dog",testDog);
            testCat.addPet("Test Cat", testCat);
            test2.organicPetsWater();
            assertEquals(2, testDog.getThirst());
            assertEquals(2, testCat.getThirst());
        }
}

