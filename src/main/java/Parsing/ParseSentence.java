package Parsing;

import AllPartsofText.PartOfSentence;
import AllPartsofText.PunctuationPart;
import AllPartsofText.WordPart;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author Irina Goncharova
 */
public class ParseSentence extends Parsable{
    public ParseSentence(String value) {
        super(value);
    }

    @Override
    public List<PartOfSentence> parse() {
        List<PartOfSentence> list = new ArrayList<>();
        String[] array = getValue().trim().split(" ");

        for (String s: array) {
            Matcher matcher = Pattern.compile("(,|\\.|!|\\?)+$").matcher(s);
            if (matcher.find()) {
                list.add(new WordPart(s.substring(0, matcher.start())));
                list.add(new PunctuationPart(s.substring(matcher.start())));
            } else {
                list.add(new WordPart(s));
            }
        }
        return list;
    }
}
