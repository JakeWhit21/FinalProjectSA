package wctc.edu.Test;

import wctc.edu.SuperSport;
import wctc.edu.SuperMoto;
import wctc.edu.Cruiser;
import wctc.edu.Naked;
import wctc.edu.MotorcycleCheck;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class MotorcycleTest {
    private SuperSport superSport;
    private SuperMoto superMoto;
    private Cruiser cruiser;
    private Naked naked;

    @Before
    public void setUp() {
        superSport = new SuperSport("Yamaha", "1000");
        superSport.addModType('1');
        superSport.addModType('3');

        naked = new Naked("Suzuki", "750");
        naked.addModType('3');

        superMoto = new SuperMoto("Honda", "400");
        superMoto.addModType('1');
        superMoto.addModType('2');
        superMoto.addModType('3');

        cruiser = new Cruiser("Kawasaki", "1800");
        cruiser.addModType('2');
    }

    @Test
    public void checkSuperSportModsTest() {
        assertTrue("Wrong number of mods", MotorcycleCheck.checkMods(superSport.getModsList(), 2));
    }

    @Test
    public void checkNakedModsTest() {
        assertTrue("Wrong number of mods", MotorcycleCheck.checkMods(naked.getModsList(), 1));
    }

    @Test
    public void checkSuperMotoModsTest() {
        assertTrue("Wrong number of mods", MotorcycleCheck.checkMods(superMoto.getModsList(), 3));
    }

    //Example of a failed test
    @Test
    public void checkCruiserModsTest() {
        assertTrue("Wrong number of mods", MotorcycleCheck.checkMods(cruiser.getModsList(), 2));
    }
}
