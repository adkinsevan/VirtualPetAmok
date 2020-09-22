package PetShelter;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class RoboticPetTest {
    RoboCat underTest = new RoboCat("RoboCatTest","This Cat is a test",5);
    RoboCat testCat = new RoboCat("RoboCatTest","This Cat is a test",5);
    @Test
    public void oilAndMaintainWillEffectMaintenanceLvl(){
        underTest.oilAndMaintain();
        assertEquals(testCat.getMaintenanceLvl(),9);
        
    }
}
