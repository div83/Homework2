package Processing;

import AllPartsofText.Paragraph;
import AllPartsofText.Sentence;
import AllPartsofText.Text;
import Parsing.ParseText;

/**
 * @author Irina Goncharova
 */
public class Working {

    private String origText;

    public Working(String text) {
        this.origText = text;
    }

    public String work (){

        System.out.println(origText);
        ParseText textToParse = new ParseText(origText);
        Text textChanged = new Text(textToParse.parse());

        for (Paragraph par: textChanged.getText()) {
            for (Sentence sent: par.getParagraph()) {
                sent.changePlaces(sent);
            }
        }
        System.out.println(textChanged.toString());  // print changed text
        return textChanged.toString();
    }
}




