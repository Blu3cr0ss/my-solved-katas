// https://www.codewars.com/kata/5aba780a6a176b029800041c

fun maxMultiple(d: Int, b: Int): Int {
    /*
    when b = 2, d = 7
    7 / 2 = 3.5 -> floor() =  3
    3 * 2 = 6 <- answer
    */
    return d * Math.floor(b.toDouble() / d).toInt()
}