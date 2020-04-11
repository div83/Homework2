package Parsing;

import AllPartsofText.Sentence;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author Irina Goncharova
 */
public class ParseParagraph extends Parsable {
    public ParseParagraph(String value) {
        super(value);
    }

    @Override
    public List<Sentence> parse() {
        List<Sentence> list = new ArrayList<>();
        int x = 0;
        Matcher matcher = Pattern.compile("(\\.|!|\\?)+").matcher(getValue());
        while (matcher.find()) {
            String newString = getValue().substring(x, matcher.end());
            ParseSentence parseSentence = new ParseSentence(newString);
            list.add(new Sentence(parseSentence.parse()));
            x = matcher.end();
        }
        return list;
    }
}




