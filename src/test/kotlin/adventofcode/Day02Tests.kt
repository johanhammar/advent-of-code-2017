package adventofcode

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class Day02Tests {

    private val day02 = Day02()

    @Test
    fun `matches checksum example`() {

        val input = "5\t1\t9\t5\n" +
            "7\t5\t3\n" +
            "2\t4\t6\t8"

        assertThat(day02.calcChecksum(input)).isEqualTo(18)

    }

    @Test
    fun `matches checksum part 02 example`() {

        val input = "5\t9\t2\t8\n" +
                "9\t4\t7\t3\n" +
                "3\t8\t6\t5"

        assertThat(day02.calcChecksumPart2(input)).isEqualTo(9)

    }

}