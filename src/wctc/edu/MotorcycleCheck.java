package wctc.edu;

import java.util.List;

/**
 * Utility method for testing number of mods associated with a motorcycle.
 * @author Mr. Whitmore
 * @version 1.0
 */

public class MotorcycleCheck {

    /**
     * Method to test if the number of mods associated with a motorcycle is the number expected.
     * @param mods
     * @param numberOfMods
     * @return true if the number matches number of mods, false if not.
     */

    public static boolean checkMods(List<Mods> mods, int numberOfMods) {
        if (mods.size() == (numberOfMods)) {
            return true;
        }
        else {
            return false;
        }
    }
}
