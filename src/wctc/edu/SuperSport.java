package wctc.edu;

import java.util.ArrayList;
import java.util.List;

/**
 * This is a specific motorcycle type class which sets parameters and mods to a motorcycle type.
 * @author Mr. Whitmore
 * @version 1.0
 */

public class SuperSport extends Motorcycle{

    /**
     * constructor for Cruiser.
     * @param make
     * @param displacement
     */

    public SuperSport(String make, String displacement) {
        super(make, displacement);
    }

    /**
     * Method for returning string which details motorcycle
     * @param mods
     * @return detail line for this motorcycle
     */

    @Override
    public String getDetailLine(List<Mods> mods) {
        String line = "SuperSport: " + this.getMake() + " " + this.getDisplacement();
        for (Mods m: mods) {
            line += "\n" + m.getModLine();
        }
        return line;
    }
}
