package AllPartsofText;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class WordPartTest {

    public String word1;
    public String word2;
    public String word1ToLower;
    public String word2ToLower;
    public String word1ToFirstUpper;
    public String word2ToFirstUpper;
    public WordPart wordPartForTest1;
    public WordPart wordPartForTest2;

    @Before
    public void initiate() {
        word1 = "We";
        word2 = "walk";
        word1ToLower = "we";
        word2ToLower = "walk";
        word1ToFirstUpper = "We";
        word2ToFirstUpper = "Walk";
        wordPartForTest1 = new WordPart(word1);
        wordPartForTest2 = new WordPart(word2);
    }

    @Test
    public void getWord() {
        String expected = word1;
        String actual = wordPartForTest1.getWord();
    }

    @Test
    public void toStringTest() {
        String expected = word1;
        String actual = wordPartForTest1.toString();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void toLower1() {
        String expected = word1ToLower;
        String actual = wordPartForTest1.toLower(word1);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void toLower2() {
        String expected = word2ToLower;
        String actual = wordPartForTest2.toLower(word2);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void toFirstUpper1() {
        String expected = word1ToFirstUpper;
        String actual = wordPartForTest1.toFirstUpper(word1);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void toFirstUpper2() {
        String expected = word2ToFirstUpper;
        String actual = wordPartForTest2.toFirstUpper(word2);
        Assert.assertEquals(expected, actual);
    }
}