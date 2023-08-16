// https://www.codewars.com/kata/541c8630095125aba6000c00/

public class Sum_of_Digits_Digital_Root {
    public static int digital_root(int n) {
        int out = n;
        while (out > 9) {
            out = java.util.Arrays.stream(String.valueOf(out).split("")).map(Integer::parseInt).reduce(Integer::sum).get();
        }
        return out;
    }
}
