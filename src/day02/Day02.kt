package day02

import println
import readInput

fun main() {
    // test if implementation meets criteria from the description, like:
    val testInput = readInput("day02/Day02_test")
    val input = readInput("day02/Day02")

    check(part1(testInput) == 1)
    part1(input).println()

    check(part2(testInput) == 1)
    part2(input).println()
}

fun part1(input: List<String>): Int {
    return input.size
}

fun part2(input: List<String>): Int {
    return input.size
}
