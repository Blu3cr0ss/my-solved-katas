// https://www.codewars.com/kata/525f50e3b73515a6db000b83
public class Create_Phone_Number {
    public static String createPhoneNumber(int[] numbers) {
        return String.format("(%s%s%s) %s%s%s-%s%s%s%s", numbers[0], numbers[1], numbers[2], numbers[3], numbers[4], numbers[5], numbers[6], numbers[7], numbers[8], numbers[9]);
    }
}
