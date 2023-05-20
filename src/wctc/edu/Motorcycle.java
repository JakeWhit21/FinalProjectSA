package wctc.edu;

import com.sun.jdi.ClassType;

import java.util.ArrayList;
import java.util.List;

/**
 * This is an abstract class for motorcycle which sets the parameters for a motorcycle.
 * @author Mr. Whitmore
 * @version 1.0
 */
public abstract class Motorcycle {
    private String make;
    private String displacement;
    private List<Mods> mods;

    /**
     * Constructor for Motorcycle.
     * @param make
     * @param displacement
     */

    public Motorcycle(String make, String displacement) {
        this.make = make;
        this.displacement = displacement;
        this.mods = new ArrayList<>();
    }

    /**
     * abstract method for returning detail line of motorcycle.
     * @param mods
     * @return String of motorcycle information
     */

    public abstract String getDetailLine(List<Mods> mods);

    /**
     * Method for adding selected mod type to motorcycle
     * @param answer
     */

    public void addModType(char answer) {
        switch (answer) {
            case '1' -> mods.add(new QuickShifter());
            case '2' -> mods.add(new Sprockets());
            case '3' -> mods.add(new Tune());
            default -> mods.add(new QuickShifter());
        }
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getDisplacement() {
        return displacement;
    }

    public void setDisplacement(String displacement) {
        this.displacement = displacement;
    }

    /**
     * getter for mod list
     * @return mod list
     */

    public List<Mods> getModsList() {
        return mods;
    }

    /**
     * toString for returning motorcycle information
     * @return string for motorcycle
     */

    @Override
    public String toString() {
        return "Make: " + make + ". " + "Displacement: " + displacement + ".";
    }
}
