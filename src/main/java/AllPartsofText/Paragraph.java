package AllPartsofText;

import java.util.List;

/**
 * @author Irina Goncharova
 */
public class Paragraph {

    private List<Sentence> paragraph;

    public Paragraph(List<Sentence> paragraph) {
        this.paragraph = paragraph;
    }

    public void setParagraph(List<Sentence> paragraph) {
        this.paragraph = paragraph;
    }

    public List<Sentence> getParagraph() {
        return paragraph;
    }

    @Override
    public String toString (){
        StringBuilder builder = new StringBuilder("\n  ");
        for (Sentence sent: paragraph) {
            builder.append(" ").append(sent.toString());
        }
        return builder.toString();
    }
}
