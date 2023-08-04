//https://www.codewars.com/kata/577a98a6ae28071780000989

import java.util.Arrays;
public class Find_Maximum_and_Minimum_Values_of_a_List {

    public int min(int[] list) {
        return Arrays.stream(list).min().orElse(0);
    }

    public int max(int[] list) {
        return Arrays.stream(list).max().orElse(0);
    }
}