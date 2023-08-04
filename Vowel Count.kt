// https://www.codewars.com/kata/54ff3102c1bad923760001f3

// V1
val vowels = arrayOf('a', 'e', 'i', 'o', 'u')

fun getCount_V1(str: String): Int = str.count(vowels::contains)

// V2
fun getCount_V2(str: String): Int = Regex("[aeiou]").findAll(str).count()