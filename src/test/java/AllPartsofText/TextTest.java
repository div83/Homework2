package AllPartsofText;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class TextTest {

    public String textInString;
    public String[] textInArray;
    public List<Paragraph> textInList;
    public Text text;

    @Before
    public void initiate() {
        textInString = "\n   We like programming, yeeeaaa!!!!! Are you agree?\n   Without any doubt.";
        textInArray = new String[] {"\n   We like programming, yeeeaaa!!!!! Are you agree?", "\n   Without any doubt."};
        textInList = new ArrayList<Paragraph>();
        List<PartOfSentence> listSent1 = new ArrayList<>();
        List<PartOfSentence> listSent2 = new ArrayList<>();
        List<PartOfSentence> listSent3 = new ArrayList<>();
        List<Sentence> listParagr1 = new ArrayList<>();
        List<Sentence> listParagr2 = new ArrayList<>();
        listSent1.addAll(Arrays.asList(new WordPart("We"), new WordPart("like"), new WordPart("programming"), new PunctuationPart(","), new WordPart("yeeeaaa"), new PunctuationPart("!!!!!")));
        listSent2.addAll(Arrays.asList(new WordPart("Are"), new WordPart("you"), new WordPart("agree"), new PunctuationPart("?")));
        listSent3.addAll(Arrays.asList(new WordPart("Without"), new WordPart("any"), new WordPart("doubt"), new PunctuationPart(".")));
        Sentence sentence1 = new Sentence(listSent1);
        Sentence sentence2 = new Sentence(listSent2);
        Sentence sentence3 = new Sentence(listSent3);
        listParagr1.addAll(Arrays.asList(sentence1, sentence2));
        listParagr2.add(sentence3);
        Paragraph paragraph1 = new Paragraph(listParagr1);
        Paragraph paragraph2 = new Paragraph(listParagr2);
        textInList.addAll(Arrays.asList(paragraph1,paragraph2));
        text =new Text(textInList);
    }

    @Test
    public void getText() {
        Assert.assertEquals(textInList, text.getText());
    }

    @Test
    public void testToString() {
        String expected = textInString;
        String actual = text.toString();
        Assert.assertEquals(expected, actual);
    }
}