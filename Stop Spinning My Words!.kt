//https://www.codewars.com/kata/5264d2b162488dc400000001/

fun spinWords(sentence: String) = sentence.split(" ").map { if (it.length >= 5) it.reversed() else it }.joinToString(" ")