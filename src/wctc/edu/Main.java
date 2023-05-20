package wctc.edu;

/**
 * this is the main method which runs the program.
 * @author Mr. Whitmore
 * @version 1.0
 */

public class Main {

    /**
     * Method which runs the program.
     * @param args
     */

    public static void main(String[] args) {

        IOStrategy ioStrategy;
        ioStrategy = new ConsoleIOStrategy();
        UI ui = UI.getInstance(ioStrategy);
        Dealer dealer = Dealer.getInstance(ui);
        char answer = ' ';
        do {
            answer = ui.getMenuSelection();
            switch (answer) {
                case '1' -> {dealer.addMotorcycle();}
                case '2' -> {dealer.addMod();}
                case '3' -> {dealer.produceReport();}
            }
        } while (answer != '4');
    }
}
