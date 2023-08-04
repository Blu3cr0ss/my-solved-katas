// https://www.codewars.com/kata/5a431c0de1ce0ec33a00000c

fun evenNumbers(array: List<Int>, number: Int): List<Int> = array.filter { it % 2 == 0 }.takeLast(number)