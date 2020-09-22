package PetShelter;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class OrganicPetTest {
        Dog underTest = new Dog("TestDog", "This dog is a test");
        Dog testDog = new Dog("Test Dog", "This Dog is a test ", 6, 6, 6, 6);
        Cat testCat = new Cat("Test Cat", "This Dog is a test ", 6, 6, 6);

        @Test
        public void giveWaterWillDecreaseThirst() {
            underTest.giveWater();
            assertTrue(testDog.getThirst()<6);
            assertTrue(testCat.getThirst()<6);
        }
        @Test
        public void playWithWillDecreaseBoredom() {
            underTest.playWithAll();
            assertTrue(testDog.getBoredom()<6);
            assertTrue(testCat.getBoredom()<6);
        }
        @Test
        public void feedWillDecreaseHunger() {
            underTest.feedAll();
            assertTrue(testDog.getBoredom()<6);
            assertTrue(testCat.getBoredom()<6);
        }
        @Test
        public void cleanCageWillMakeDogsCageClean20(){
            underTest.cleanCage();
            assertTrue(testDog.getCageCleanliness()<=6);
        }
        @Test
        public void tickWillEffectHealth(){
            underTest.tick();
            assertEquals(15, testDog.getHealth());
        }

    }
