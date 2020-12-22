import assertk.assertThat
import assertk.assertions.isEqualTo
import org.junit.jupiter.api.Test

class MainTest {

    @Test
    fun `parse entry`() {
        assertThat(parse("Banane, Pomme , Cerise ")).isEqualTo(listOf("Banane", "Pomme", "Cerise"))
    }

}


