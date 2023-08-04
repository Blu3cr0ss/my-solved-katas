// https://www.codewars.com/kata/54ba84be607a92aa900000f1

import java.util.ArrayList;

public class Isograms {
    public static boolean isIsogram(String str_) {
        String str = str_.toLowerCase();
        ArrayList<String> usedLetters = new ArrayList<>();
        for (char c : str.toCharArray()) {
            String cs = Character.toString(c);
            if (!usedLetters.contains(cs)) {
                usedLetters.add(cs);
            } else return false;
        }
        return true;
    }
}