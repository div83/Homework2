package AllPartsofText;

import java.util.List;

/**
 * @author Irina Goncharova
 */
public class Sentence {
    private List<PartOfSentence> sentence;

    public Sentence(List<PartOfSentence> sentence) {
        this.sentence = sentence;
    }

    public List<PartOfSentence> getSentence() {
        return sentence;
    }

    public void setSentence(List<PartOfSentence> sentence) {
        this.sentence = sentence;
    }

    @Override
    public String toString () {
        StringBuilder builder = new StringBuilder(sentence.get(0).toString());
        for (int i = 1; i < sentence.size(); i++) {
            if (sentence.get(i) instanceof WordPart) {
                builder.append(" ").append(sentence.get(i).toString());
            } else if (sentence.get(i) instanceof PunctuationPart) {
                builder.append(sentence.get(i).toString());
            }
        }
        return builder.toString();
    }

    // метод: Поменять местами первое слово с последним, не изменяя длины предложения
    public Sentence changePlaces (Sentence sent){
        List<PartOfSentence> list = sent.getSentence();
        int indexOfLastWord = 0;
        for (int i = list.size()-1; i >= 0 ; i--) {    // находим последнее слово, НЕ знак пунктуации, в предложении
            if (list.get(i) instanceof WordPart){
                indexOfLastWord = i;
                break;
            }
        }
        WordPart temp1 = (WordPart)list.get(0);
        WordPart temp1Changed = new WordPart(temp1.toLower(temp1.toString()));
        WordPart temp2 = (WordPart) list.get(indexOfLastWord);
        WordPart temp2Changed = new WordPart(temp2.toFirstUpper(temp2.toString()));
        list.set(0, temp2Changed);
        list.set(indexOfLastWord, temp1Changed);
        return new Sentence(list);
    }
}

