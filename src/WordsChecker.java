import java.util.HashSet;
import java.util.Set;

public class WordsChecker {

    private String text;

    public WordsChecker(String text) {
        this.text = text;
    }

    public boolean hasWord(String word) {
        Set<String> set = new HashSet<>();
        for (String txt : text.split("\\P{IsAlphabetic}+")) {
            set.add(txt);
        }
        if (set.contains(word)) return true;
        else return false;
    }
}