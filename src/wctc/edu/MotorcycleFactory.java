package wctc.edu;

/**
 * Class for instantiating type of motorcycle.
 * @author Mr. Whitmore
 * @version 1.0
 */

public class MotorcycleFactory {
    private MotorcycleFactory() {
    }

    /**
     * Method for creating a motorcycle type based on user selection.
     * @param make
     * @param displacement
     * @param motorcycleType
     * @return the selected motorcycle type.
     */

    public static Motorcycle getMotorcycle(String make, String displacement, MotorcycleType motorcycleType) {
        switch (motorcycleType) {
            case NAKED -> {return new Naked(make, displacement);}
            case CRUISER -> {return new Cruiser(make, displacement);}
            case SUPER_SPORT -> {return new SuperSport(make, displacement);}
            case SUPER_MOTO -> {return new SuperMoto(make, displacement);}
            default -> {return null;}
        }
    }
}
