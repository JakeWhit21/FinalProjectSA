package wctc.edu;

import java.util.*;

/**
 * This is a utility class for creating a UI.
 * @author Mr. Whitmore
 * @version 1.0
 */

public class UI {
    private static UI ui;
    private IOStrategy ioStrategy;
    private List<Mods> mods;

    /**
     * Method for setting ioStrategy to IOStrategy
     * @param ioStrategy
     */

    private UI(IOStrategy ioStrategy) {this.ioStrategy = ioStrategy;}

    /**
     * Method for getting the instance of a UI
     * @param ioStrategy
     * @return the ui
     */

    public static UI getInstance(IOStrategy ioStrategy) {
        if (ui == null) {
            ui = new UI(ioStrategy);
        }
        return ui;
    }

    /**
     * Method for gathering the menu option selected by the user.
     * @return character the user entered.
     */

    public char getMenuSelection() {
        ioStrategy.outputLine("1. Add Motorcycle ");
        ioStrategy.outputLine("2. Add mod to motorcycle");
        ioStrategy.outputLine("3. Report");
        ioStrategy.outputLine("4. Exit");
        return ioStrategy.inputCharacter();
    }

    /**
     * Method for gathering the mod option selected by the user.
     * @return character the user entered.
     */

    public char getModTypeMenu() {
        ioStrategy.outputLine("1. Quick Shifter ");
        ioStrategy.outputLine("2. Sprockets ");
        ioStrategy.outputLine("3. Tune ");
        return ioStrategy.inputCharacter();
    }

    /**
     * Method for gathering the make of a motorcycle which the user inputs.
     * @return the string the user enters.
     */

    public String getMake() {
        ioStrategy.outputLine("Please enter make: ");
        return ioStrategy.inputString();
    }

    /**
     * Method for gathering the displacement fo a motorcycle which the user inputs.
     * @return the string the user enters.
     */

    public String getDisplacement() {
        ioStrategy.outputLine("Please enter displacement in cc: ");
        return ioStrategy.inputString();
    }

    /**
     * Method for getting which motorcycle type the user wants to select.
     * @return the specific motorcycle type the user selected.
     */

        public MotorcycleType getMotorcycleType() {
        ioStrategy.outputLine("C = Cruiser, S = Super sport, N = Naked, M = Super moto: ");
        switch (ioStrategy.inputCharacter()) {
            case 'C' -> {return MotorcycleType.CRUISER;}
            case 'S' -> {return MotorcycleType.SUPER_SPORT;}
            case 'N' -> {return MotorcycleType.NAKED;}
            case 'M' -> {return MotorcycleType.SUPER_MOTO;}
            default -> {return MotorcycleType.CRUISER;}
        }
    }

    /**
     * Method for running the report which lists all motorcycles plus their mods.
     * @param roster
     */

    public void runReport(List<Motorcycle> roster) {
        for (Motorcycle m: roster) {
            ioStrategy.outputLine(m.getDetailLine(m.getModsList()));
        }
    }

    /**
     * Method for listing all motorcycles for the user to select and add a mod to.
     * @param roster
     */

    public void listCoolMotorcycles(List<Motorcycle> roster) {
        for (int i = 0; i < roster.size(); i++) {
            ioStrategy.outputLine((i + 1) + ". " + "Motorcycle type: " + roster.get(i).getClass() + " " + roster.get(i).toString());
        }
    }

    /**
     * Method for getting the motorcyle the user chose to add a mod to.
     * @param roster
     * @return motorcycle selection
     */

    public int getCoolMotorcycleSelection(List<Motorcycle> roster) {
        listCoolMotorcycles(roster);
        return Character.getNumericValue(ioStrategy.inputCharacter()) - 1;
    }
}
