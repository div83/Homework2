package AllPartsofText;

/**
 * @author Irina Goncharova
 */
public class WordPart implements PartOfSentence {
    private String word;

    public WordPart(String word) {
        this.word = word;
    }

    public String getWord() {
        return word;
    }

    public void setWord(String word) {
        this.word = word;
    }

    @Override
    public String toString() {
        return word;
    }

    // метод: меняем большую букву в слове на маленькую
    public String toLower (String word) {
        return word.toLowerCase();
    }

    // метод: первую букву слова сделать большой
    public String toFirstUpper (String word) {
        if (word.length() == 1) {
            return word.toUpperCase();
        } else {
            return word.substring(0,1).toUpperCase() + word.substring(1);
        }
    }
}
