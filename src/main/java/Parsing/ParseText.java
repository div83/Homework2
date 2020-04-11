package Parsing;

import AllPartsofText.Paragraph;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Irina Goncharova
 */
public class ParseText extends Parsable{
    public ParseText(String value) {
        super(value);
    }

    @Override
    public List<Paragraph> parse() {
        List<Paragraph> list = new ArrayList<>();
        String[] array = getValue().split("\n");
        for (String element: array) {
            ParseParagraph parseParagraph = new ParseParagraph(element);
            list.add(new Paragraph(parseParagraph.parse()));
        }
        return list;
    }
}
