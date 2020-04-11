package AllPartsofText;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SentenceTest {

    public Sentence sentence;
    public List<PartOfSentence> sentenceInList;
    public String sentenceInstring;

    @Before
    public void initiate() {
        sentenceInstring = "We like programming, yeeeaaa!!!!!";
        sentenceInList = new ArrayList<PartOfSentence>();
        sentenceInList.addAll(Arrays.asList(new WordPart("We"), new WordPart("like"), new WordPart("programming"), new PunctuationPart(","), new WordPart("yeeeaaa"), new PunctuationPart("!!!!!")));
        sentence = new Sentence(sentenceInList);
    }

    @Test
    public void getSentence() {
        Assert.assertEquals(sentenceInList, sentence.getSentence());
    }

    @Test
    public void toStringTest () {
        String expected = sentenceInstring;
        String actual = sentence.toString();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void changePlaces() {
        String[] expected = new String[] {"Yeeeaaa", "like", "programming", ",", "we", "!!!!!"};
        Sentence newSent = sentence.changePlaces(sentence);
        String[] actual = new String[newSent.getSentence().size()];
        for (int i = 0; i < newSent.getSentence().size(); i++) {
            actual[i] = newSent.getSentence().get(i).toString();
        }
        Assert.assertArrayEquals(expected, actual);
    }
}