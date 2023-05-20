package wctc.edu;

import java.util.*;

/**
 * Utility class which add motorcycles to a roster and decides what to do with them.
 * @author Mr. Whitmore
 * @version 1.0
 */

public class Dealer {
    private static Dealer dealer;
    private List<Motorcycle> roster;
    private UI ui;

    /**
     * Constructor for dealer
     * @param ui
     */

    private Dealer(UI ui) {
        this.roster = new ArrayList<>();
        this.ui = ui;
    }

    /**
     * Method to get the instance of the UI
     * @param ui
     * @return dealer with the UI
     */

    public static Dealer getInstance(UI ui) {
        if (dealer == null) {
            dealer = new Dealer(ui);
        }
        return dealer;
    }

    /**
     * Method to add motorcycle to full roster of motorcycles
     */

    public void addMotorcycle() {
        MotorcycleType motorcycleTypeChoice = ui.getMotorcycleType();
        String make = ui.getMake();
        String displacement = ui.getDisplacement();
        roster.add(MotorcycleFactory.getMotorcycle(make, displacement, motorcycleTypeChoice));
    }

    /**
     * Method to list all motorcycles and their mods
     */

    public void produceReport() {
        ui.runReport(roster);
    }

    /**
     * Adds mod to specific motorcycle
     */

    public void addMod() {
        int answer = ui.getCoolMotorcycleSelection(roster);
        (roster.get(answer)).addModType(ui.getModTypeMenu());
    }
}
