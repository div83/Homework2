package AllPartsofText;

/**
 * @author Irina Goncharova
 */
public class PunctuationPart implements PartOfSentence {

    private String mark;

    public PunctuationPart(String mark) {
        this.mark = mark;
    }

    public String getMark() {
        return mark;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }

    @Override
    public String toString() {
        return mark;
    }
}
