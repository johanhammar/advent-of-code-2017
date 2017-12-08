package adventofcode

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class Day04Tests {

    @Test
    fun `matches part01 examples`() {
        val passwords = listOf("aa bb cc dd ee","aa bb cc dd aa","aa bb cc dd aaa")
        assertThat(Day04().solvePart1(passwords)).isEqualTo(2)
    }

    @Test
    fun `valid passphrase part 1`() {
        assertThat(Day04().validPassphrase("aa bb cc dd ee")).isTrue()
        assertThat(Day04().validPassphrase("aa bb cc dd aa")).isFalse()
        assertThat(Day04().validPassphrase("aa bb cc dd aaa")).isTrue()

    }

    @Test
    fun `matches part02 examples`() {
        val passwords = listOf("abcde fghij","abcde xyz ecdab","a ab abc abd abf abj","iiii oiii ooii oooi oooo","oiii ioii iioi iiio")
        assertThat(Day04().solvePart2(passwords)).isEqualTo(3)
    }

    @Test
    fun `valid passphrase part 2`() {
        assertThat(Day04().validPassphrasePart2("abcde fghij")).isTrue()
        assertThat(Day04().validPassphrasePart2("abcde xyz ecdab")).isFalse()
        assertThat(Day04().validPassphrasePart2("a ab abc abd abf abj")).isTrue()
        assertThat(Day04().validPassphrasePart2("iiii oiii ooii oooi oooo")).isTrue()
        assertThat(Day04().validPassphrasePart2("oiii ioii iioi iiio")).isFalse()
    }

}