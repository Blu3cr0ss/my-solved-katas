// https://www.codewars.com/kata/515de9ae9dcfc28eb6000001

import java.util.ArrayList;

public class Split_Strings {
    public static String[] solution(String s) {
        ArrayList<String> out = new ArrayList<>();
        for (int i = 1; i < s.length(); i += 2) {
            String str = s.charAt(i - 1) + Character.toString(s.charAt(i));
            out.add(str);
        }
        if (s.length() % 2 != 0) {
            out.add(s.charAt(s.length()-1) + "_");
        }
        return out.toArray(String[]::new);
    }
}