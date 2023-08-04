// https://www.codewars.com/kata/517abf86da9663f1d2000003

fun toCamelCase(str: String): String = str.runningReduce { previous, char ->
    if (char == '-' || char == '_') return@runningReduce Char.MIN_VALUE
    if (previous == Char.MIN_VALUE)
        char.uppercaseChar()
    else char
}.filter { it != Char.MIN_VALUE }.joinToString("")