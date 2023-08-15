// https://www.codewars.com/kata/5526fc09a1bbd946250002dc

fun find(integers: Array<Int>) =
        integers.singleOrNull { it % 2 == 0 }
        ?: integers.first { it % 2 != 0 }