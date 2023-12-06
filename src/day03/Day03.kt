package day03

import println
import readInput

fun main() {
    // test if implementation meets criteria from the description, like:
    val testInput1 = readInput("day03/Day03_test1")
    val testInput2 = readInput("day03/Day03_test2")
    val input = readInput("day03/Day03")

    check(part1(testInput1) == 1)
    part1(input).println()

    check(part2(testInput2) == 1)
    part2(input).println()
}

fun part1(input: List<String>): Int {
    return input.size
}

fun part2(input: List<String>): Int {
    return input.size
}
