// https://www.codewars.com/kata/514b92a657cdc65150000006

fun solution(number: Int): Int = (0..number).filter { (it % 3 == 0 || it % 5 == 0) && it != number }.sum()