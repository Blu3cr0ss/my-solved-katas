val MorseCode = hashMapOf<String, String>()

fun decodeMorse(code: String) = code.trim().split("   ").joinToString(" ") {
    it.split(" ").joinToString("") {
        MorseCode[it] ?: ""
    }
}