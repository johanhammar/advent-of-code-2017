package adventofcode

import java.io.File
import java.util.Arrays.sort


fun main(args: Array<String>) {
    val input = File(ClassLoader.getSystemClassLoader().getResource("day04.txt").file).readLines()
    println(Day04().solvePart1(input))
    println(Day04().solvePart2(input))
}

class Day04 {

    fun solvePart1(input: List<String>): Int {
        return input.filter { validPassphrase(it) }.size
    }

    fun validPassphrase(input: String): Boolean {
        var words = input.replace("\n", "").split(" ")
        return words.size == words.toSet().count()
    }

    fun solvePart2(input: List<String>): Int {
        return input.filter { validPassphrasePart2(it) }.size
    }

    fun validPassphrasePart2(input: String): Boolean {
        var words = input.replace("\n", "").split(" ").map { it.toCharArray().sorted().toString() }

        return words.size == words.toSet().count()
    }

}

