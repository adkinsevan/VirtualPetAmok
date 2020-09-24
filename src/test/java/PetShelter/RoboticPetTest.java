package PetShelter;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class RoboticPetTest {
    RoboCat underTest = new RoboCat("RoboCatTest","This Cat is a test",6);


    @Test
    public void oilAndMaintainWillEffectMaintenanceLvl(){
        underTest.oilAndMaintain();
        assertEquals(underTest.getMaintenanceLvl(),6);
        
    }
}
