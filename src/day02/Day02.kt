package day02

import println
import readInput

fun main() {
    // test if implementation meets criteria from the description, like:
    val testInput1 = readInput("day02/Day02_test1")
    val testInput2 = readInput("day02/Day02_test2")
    val input = readInput("day02/Day02")

    check(part1(testInput1) == 8)
    part1(input).println()

    check(part2(testInput2) == 2286)
    part2(input).println()
}

fun part1(input: List<String>): Int {
    val numbers = mutableListOf<Int>()

    // only 12 red cubes, 13 green cubes, and 14 blue cubes
    input.forEach {
        val (game, rest) = it.split(": ")
        val cubeSets = rest.split("; ")
        var possible = true
        cubeSets.forEach { cubeSet ->
            val cube = cubeSet.split(", ")
            cube.forEach { color ->
                val (count, colorName) = color.split(" ")
                when (colorName) {
                    "red" -> if (count.toInt() > 12) possible = false
                    "green" -> if (count.toInt() > 13) possible = false
                    "blue" -> if (count.toInt() > 14) possible = false
                }
            }
        }
        if (possible) {
            numbers.add(game.split(" ")[1].toInt())
        }
    }

    return numbers.sumOf { it }
}

fun part2(input: List<String>): Int {
    val numbers = mutableListOf<Int>()

    input.forEach {
        val (game, rest) = it.split(": ")
        val cubeSets = rest.split("; ")
        var maxRed = 1; var maxGreen = 1; var maxBlue = 1
        cubeSets.forEach { cubeSet ->
            val cube = cubeSet.split(", ")
            cube.forEach { color ->
                val (count, colorName) = color.split(" ")
                when (colorName) {
                    "red" -> if (count.toInt() > maxRed) maxRed = count.toInt()
                    "green" -> if (count.toInt() > maxGreen) maxGreen = count.toInt()
                    "blue" -> if (count.toInt() > maxBlue) maxBlue = count.toInt()
                }
            }
        }

        numbers.add(maxRed * maxGreen * maxBlue)
    }

    return numbers.sumOf { it }
}
