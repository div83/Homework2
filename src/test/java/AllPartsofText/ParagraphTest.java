package AllPartsofText;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ParagraphTest {

    public Paragraph paragraph;
    public List<Sentence> paragraphInList;
    public String paragraphInString;

    @Before
    public void initiate() {
        paragraphInString = "\n   We like programming, yeeeaaa!!!!! Are you agree?";
        paragraphInList = new ArrayList<>();
        List<PartOfSentence> listSent1 = new ArrayList<>();
        List<PartOfSentence> listSent2 = new ArrayList<>();
        listSent1.addAll(Arrays.asList(new WordPart("We"), new WordPart("like"),new WordPart("programming"), new PunctuationPart(","), new WordPart("yeeeaaa"), new PunctuationPart("!!!!!")));
        listSent2.addAll(Arrays.asList(new WordPart("Are"), new WordPart("you"), new WordPart("agree"), new PunctuationPart("?")));
        Sentence sentence1 = new Sentence(listSent1);
        Sentence sentence2 = new Sentence(listSent2);
        paragraphInList.addAll(Arrays.asList(sentence1, sentence2));
        paragraph = new Paragraph(paragraphInList);
    }

    @Test
    public void getParagraph() {
        Assert.assertEquals(paragraphInList, paragraph.getParagraph());
    }

    @Test
    public void toStringTest() {
        String expected = paragraphInString;
        String actual = paragraph.toString();
        Assert.assertEquals(expected, actual);
    }
}