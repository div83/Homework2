package Parsing;

import AllPartsofText.PartOfSentence;
import AllPartsofText.PunctuationPart;
import AllPartsofText.WordPart;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ParseSentenceTest {

    public String sentenceInString;
    public String[] sentenceInArray;
    public List<PartOfSentence> sentenceInList;

    @Before
    public void initiate() {
        sentenceInString = "We like programming, yeeeaaa!!!!!";
        sentenceInArray = new String[]{"We", "like", "programming", ",", "yeeeaaa", "!!!!!"};
        sentenceInList = new ArrayList<PartOfSentence>();
        sentenceInList.addAll(Arrays.asList(new WordPart("We"), new WordPart("like"), new WordPart("programming"), new PunctuationPart(","), new WordPart("yeeeaaa"), new PunctuationPart("!!!!!")));
    }

    @Test
    public void parse() {
        String[] expected = sentenceInArray;
        List<PartOfSentence> temp  = new ParseSentence(sentenceInString).parse();
        String[] actual = new String[temp.size()];
        for (int i = 0; i < temp.size(); i++) {
            actual[i] = temp.get(i).toString();
        }
        Assert.assertArrayEquals(actual, expected);
    }
}