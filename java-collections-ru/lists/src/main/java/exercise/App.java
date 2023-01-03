package exercise;

import java.util.ArrayList;
import java.util.List;

// BEGIN
class App {
    public static boolean scrabble(String args, String word) {
        var chars = word.toLowerCase();
        List<Character> wordlist = new ArrayList<>();
        List<Character> argslist = new ArrayList<>();
        char[] argsArray = args.toCharArray();
        char[] wordArray = chars.toCharArray();
        for (char c : argsArray) {
            argslist.add(c);
        }
        for (char c : wordArray) {
            wordlist.add(c);
        }
        for (var c: wordlist) {
            if (argslist.contains(c)) {
                argslist.remove(c);
            } else {
                return false;
            }
        }
        return true;
    }
}
//END
