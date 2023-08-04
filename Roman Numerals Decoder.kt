// https://www.codewars.com/kata/51b6249c4612257ac0000005

val symbolToNumber = hashMapOf(
        'I' to 1,
        'V' to 5,
        'X' to 10,
        'L' to 50,
        'C' to 100,
        'D' to 500,
        'M' to 1000
)

fun decode(str: String): Int = str.takeIf { it.isNotBlank() }
        ?.map(symbolToNumber::getValue)
        ?.zipWithNext { curr, next ->
            if (next > curr) -curr else curr
        }
        ?.sum()
        ?.plus(symbolToNumber[str.last()]!!) ?: 0