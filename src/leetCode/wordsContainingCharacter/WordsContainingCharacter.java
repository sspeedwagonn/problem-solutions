package leetCode.wordsContainingCharacter;

import java.util.ArrayList;
import java.util.List;

public class WordsContainingCharacter {
    public List<Integer> findWordsContaining(String[] words, char x) {
        List<Integer> result = new ArrayList<>();
        String sx = String.valueOf(x);

        for (int i = 0; i < words.length; i++) {
            if (words[i].contains(sx)) {
                result.add(i);
            }
        }
        return result;
    }
}
