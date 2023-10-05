https://www.codewars.com/kata/54b724efac3d5402db00065e
val MorseCode = hashMapOf<String, String>()

fun decodeMorse(code: String) = code.trim().split("   ").joinToString(" ") {
    it.split(" ").joinToString("") {
        MorseCode[it] ?: ""
    }
}
