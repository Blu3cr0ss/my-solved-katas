import java.util.Arrays;

public class PangramChecker {
    String pangram = "thequickbrownfoxjumpsoverthelazydog";

    public boolean check(String sentence) {
        return Arrays.stream(
                        sentence.toLowerCase().replace(" ", "").split("")).toList()
                .containsAll(Arrays.stream(pangram.split("")).toList());
    }
}