package day01

import println
import readInput

val words = listOf("one", "two", "three", "four", "five", "six", "seven", "eight", "nine")
val wordsReplace = listOf("o1e", "t2o", "th3ee", "fo4r", "fi5e", "s6x", "se7en", "ei8ht", "n9ne")

fun main() {
    // test if implementation meets criteria from the description, like:
    val testInput1 = readInput("day01/Day01_test1")
    val testInput2 = readInput("day01/Day01_test2")
    val input = readInput("day01/Day01")

    check(part1(testInput1) == 142)
    part1(input).println()

    check(part2(testInput2) == 281)
    part2(input).println()
}

fun part1(input: List<String>): Int {
    return input.sumOf { line ->
        line.first { it.isDigit() }.digitToInt() * 10 + line.last { it.isDigit() }.digitToInt()
    }
}

fun part2(input: List<String>): Int {
    return input.sumOf { line ->
        var tmpLine = line
        words.forEachIndexed { index, word -> tmpLine = tmpLine.replace(word, wordsReplace.elementAt(index)) }
        tmpLine.first { it.isDigit() }.digitToInt() * 10 + tmpLine.last { it.isDigit() }.digitToInt()
    }
}
