package exercise;

import java.util.HashMap;
import java.util.Map;


// BEGIN
public class App {
    public static Map<String, Integer> getWordCount(String sentence) {
        if (sentence.equals("")) {
            return new HashMap<String, Integer>();
        }
        String[] splitSentence = sentence.split(" ");
        Map<String, Integer> wordsCount = new HashMap<>();
        for (var word : splitSentence) {
            int count = 1;
            if (wordsCount.containsKey(word)) {
                count = wordsCount.get(word);
                count++;
            }
            wordsCount.put(word, count);
        }
        return wordsCount;
    }

    public static String toString(Map<String, Integer> words) {
        String result = "{\n";
        if (words.isEmpty()) {
            return "{}";
        }
        for (Map.Entry<String, Integer> word : words.entrySet()) {
            result = result + "  " + word.getKey() + ": " + word.getValue() + "\n";
        }
        result = result + "}";
        return result;
    }
}
//END
