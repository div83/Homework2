package Parsing;

import AllPartsofText.PartOfSentence;
import AllPartsofText.PunctuationPart;
import AllPartsofText.Sentence;
import AllPartsofText.WordPart;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ParseParagraphTest {

    public String paragraphInString;
    public String[] paragraphInArray;
    public List<Sentence> paragraph;

    @Before
    public void initiate() {
        paragraphInString = "We like programming, yeeeaaa!!!!! Are you agree?";
        paragraphInArray = new String[]{"We like programming, yeeeaaa!!!!!", "Are you agree?"};
        paragraph = new ArrayList<Sentence>();
        List<PartOfSentence> listSent1 = new ArrayList<>();
        List<PartOfSentence> listSent2 = new ArrayList<>();
        listSent1.addAll(Arrays.asList(new WordPart("We"), new WordPart("like"), new WordPart("programming"), new PunctuationPart(","), new WordPart("yeeeaaa"), new PunctuationPart("!!!!!")));
        listSent2.addAll(Arrays.asList(new WordPart("Are"), new WordPart("you"), new WordPart("agree"), new PunctuationPart("?")));
        Sentence sentence1 = new Sentence(listSent1);
        Sentence sentence2 = new Sentence(listSent2);
        paragraph.addAll(Arrays.asList(sentence1, sentence2));
    }

    @Test
    public void parse() {
        String[] expected = paragraphInArray;
        List<Sentence> temp = new ParseParagraph(paragraphInString).parse();
        String[] actual = new String[temp.size()];
        for (int i = 0; i < temp.size(); i++) {
            actual[i] = temp.get(i).toString();
        }
        Assert.assertArrayEquals(expected, actual);
    }
}