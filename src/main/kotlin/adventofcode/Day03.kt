package adventofcode

import java.util.stream.IntStream

fun main(args: Array<String>) {

    val input = "347991"

    println(Day03().solvePart1(input))

}

enum class Direction {
    EAST, NORTH, WEST, SOUTH;

    fun next(): Direction {
        val values = enumValues<Direction>()
        return values[(ordinal + 1) % values.size]
    }
}

class Day03 {

    // Part 01

    var direction = Direction.EAST

    var xPosition = 0
    var yPosition = 0

    var yCounter = 1
    var xCounter = 1

    var currX = 1
    var currY = 1

    fun solvePart1(input: String): Int {

        listOf(1 until input.toInt()).flatten().stream().forEach {
            println("$it  $direction")
            when (direction) {
                Direction.EAST -> xPosition += 1
                Direction.WEST -> xPosition -= 1
                Direction.NORTH -> yPosition +=1
                Direction.SOUTH -> yPosition -=1
            }
            println("x: $xPosition y:$yPosition")

            if (direction == Direction.EAST || direction == Direction.WEST) {
                if (currX >= xCounter) {
                    direction = direction.next()
                    xCounter +=1
                    currX = 1
                } else {
                    currX += 1
                }
            } else if (direction == Direction.NORTH || direction == Direction.SOUTH) {
                if (currY >= yCounter) {
                    direction = direction.next()
                    yCounter +=1
                    currY = 1
                } else {
                    currY += 1
                }
            }



        }


        return Math.abs(xPosition) + Math.abs(yPosition)
    }
}
