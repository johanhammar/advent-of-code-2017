package adventofcode

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class Day03Tests {

    @Test
    fun `matches part01 examples`() {

        assertThat(Day03().solvePart1("1")).isEqualTo(0)
        assertThat(Day03().solvePart1("12")).isEqualTo(3)
        assertThat(Day03().solvePart1("23")).isEqualTo(2)
        assertThat(Day03().solvePart1("1024")).isEqualTo(31)
    }

    @Test
    fun `next direction`() {

        assertThat(Direction.EAST.next()).isEqualTo(Direction.NORTH);
        assertThat(Direction.NORTH.next()).isEqualTo(Direction.WEST);
        assertThat(Direction.WEST.next()).isEqualTo(Direction.SOUTH);
        assertThat(Direction.SOUTH.next()).isEqualTo(Direction.EAST);

    }

}