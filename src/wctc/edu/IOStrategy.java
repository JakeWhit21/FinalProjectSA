package wctc.edu;

/**
 * Interface for user input
 * @author Mr. Whitmore
 * @version 1.0
 */

public interface IOStrategy {
    char inputCharacter();
    String inputString();
    void outputLine(String line);
}
