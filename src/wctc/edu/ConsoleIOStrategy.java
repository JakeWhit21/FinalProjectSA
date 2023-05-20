package wctc.edu;

import java.util.Scanner;

/**
 * this is a utility class for input and output.
 * @author Mr. Whitmore
 * @version 1.0
 */

public class ConsoleIOStrategy implements IOStrategy{
    Scanner keyboard = new Scanner(System.in);

    /**
     * Method for returning the input character of the user
     * @return user input character
     */

    @Override
    public char inputCharacter() {
        return this.inputString().toUpperCase().charAt(0);
    }

    /**
     * Method for returning user input string.
     * @return user input string
     */

    @Override
    public String inputString() {
        return keyboard.nextLine();
    }

    /**
     * Method for writing a line to console
     * @param line
     */

    @Override
    public void outputLine(String line) {
        System.out.println(line);
    }
}
