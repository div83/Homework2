package AllPartsofText;

import java.util.List;

/**
 * @author Irina Goncharova
 */
public class Text {
    private List<Paragraph> text;

    public Text(List<Paragraph> text) {
        this.text = text;
    }

    public List<Paragraph> getText() {
        return text;
    }

    public void setText(List<Paragraph> text) {
        this.text = text;
    }

    @Override
    public String toString(){
        StringBuilder builder = new StringBuilder("");
        for (Paragraph parag: text) {
            builder.append(parag.toString());
        }
        return builder.toString();
    }
}
