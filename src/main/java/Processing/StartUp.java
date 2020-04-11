package Processing;

import org.apache.log4j.Logger;

/**
 * @author Irina Goncharova
 */
public class StartUp {

    private static final Logger LOGGER = Logger.getLogger(StartUp.class);

    public static String path = "testfile.txt";

    public static void main(String[] args) {
        LOGGER.info("-----------------------------------------");
        LOGGER.info("Entering an application. Preparing for reading a text from a file");

        Reading textToRead = new Reading(path);
        textToRead.readFromFile();

        if (textToRead.getIsFound() == false) {
            LOGGER.error("File wasn't found");
            System.out.println("File wasn't found");
        } else if (textToRead.readFromFile().length() == 0 || textToRead.readFromFile().matches(("\\s+"))) {
            LOGGER.warn("There is no text in file. It's empty");
            System.out.println("There is no text in file. It's empty");
        } else {
            LOGGER.info("A text was successfully read from the file");
            Working working = new Working(textToRead.readFromFile());
            LOGGER.info("The text was successfully parsed");
            String changedText = working.work();
            LOGGER.info("The text was successfully changed");

            // Reverse text changing
            Working workingReverse = new Working(changedText);
            LOGGER.info("The changed text is ready to be processed");
            String changedTextReverse = workingReverse.work();
            LOGGER.info("The text was returned to its original state");
        }
    }
}



