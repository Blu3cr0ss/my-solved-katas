// https://www.codewars.com/kata/54bf1c2cd5b56cc47f0007a1
fun duplicateCount(text: String): Int = text.groupingBy { it.lowercaseChar() }.eachCount().count { it.value > 1 }