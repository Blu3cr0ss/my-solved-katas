// https://www.codewars.com/kata/57cc981a58da9e302a000214

fun smallEnough(a : IntArray, limit : Int) : Boolean = a.takeWhile{it <= limit}.count() == a.size