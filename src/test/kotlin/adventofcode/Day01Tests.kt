package adventofcode

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class Day01Tests {

    private val day01 = Day01()

    @Test
    fun `matches part01 examples`() {
        assertThat(day01.solvePart1ZipWithNext("1122")).isEqualTo(3)
        assertThat(day01.solvePart1ZipWithNext2("1122")).isEqualTo(3)
        assertThat(day01.solvePart1Recursive("1122")).isEqualTo(3)

        assertThat(day01.solvePart1ZipWithNext("1111")).isEqualTo(4)
        assertThat(day01.solvePart1ZipWithNext2("1111")).isEqualTo(4)
        assertThat(day01.solvePart1Recursive("1111")).isEqualTo(4)

        assertThat(day01.solvePart1ZipWithNext("1234")).isEqualTo(0)
        assertThat(day01.solvePart1ZipWithNext2("1234")).isEqualTo(0)
        assertThat(day01.solvePart1Recursive("1234")).isEqualTo(0)

        assertThat(day01.solvePart1ZipWithNext("91212129")).isEqualTo(9)
        assertThat(day01.solvePart1ZipWithNext2("91212129")).isEqualTo(9)
        assertThat(day01.solvePart1Recursive("91212129")).isEqualTo(9)
    }

    @Test
    fun `matches part02 examples`() {
        assertThat(day01.solvePart2FoldIndexed("1212")).isEqualTo(6)
        assertThat(day01.solvePart2FilterIndexed("1212")).isEqualTo(6)

        assertThat(day01.solvePart2FoldIndexed("1221")).isEqualTo(0)
        assertThat(day01.solvePart2FilterIndexed("1221")).isEqualTo(0)

        assertThat(day01.solvePart2FoldIndexed("123425")).isEqualTo(4)
        assertThat(day01.solvePart2FilterIndexed("123425")).isEqualTo(4)

        assertThat(day01.solvePart2FoldIndexed("123123")).isEqualTo(12)
        assertThat(day01.solvePart2FilterIndexed("123123")).isEqualTo(12)

        assertThat(day01.solvePart2FoldIndexed("12131415")).isEqualTo(4)
        assertThat(day01.solvePart2FilterIndexed("12131415")).isEqualTo(4)
    }
}