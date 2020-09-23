package PetShelter;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class OrganicPetTest {
        Dog underTest = new Dog("TestDog", "This dog is a test",6);
        Dog testDog = new Dog("Test Dog", "This Dog is a test ",6);


        @Test
        public void giveWaterWillDecreaseThirst() {
            underTest.addPet("TestDog", testDog);
            underTest.feedAllOrganicPets();
            assertEquals(2, testDog.getThirst());

        }
    }
