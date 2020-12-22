import assertk.assertThat
import assertk.assertions.isEqualTo
import kotlin.test.Test

class BasketTest {

    val basket = Basket(::applyDiscounts, Translator())

    @Test
    fun `Pomme price is 100`() {
        basket.add("Pomme")

        assertThat(basket.total()).isEqualTo(100)
    }

    @Test
    fun `Apple price is 100`() {
        basket.add("Apple")

        assertThat(basket.total()).isEqualTo(100)
    }

    @Test
    fun `Mele price is 100`() {
        basket.add("Mele")

        assertThat(basket.total()).isEqualTo(100)
    }

    @Test
    fun `Banane price is 150`() {
        basket.add("Banane")

        assertThat(basket.total()).isEqualTo(150)
    }

    @Test
    fun `Cerise price is 75`() {
        basket.add("Cerise")

        assertThat(basket.total()).isEqualTo(75)
    }

    @Test
    fun `Sum fruits`() {
        basket.add("Pomme")
        basket.add("Pomme")

        assertThat(basket.total()).isEqualTo(200)
    }

    @Test
    fun `Cerise discount`() {
        basket.add("Cerise")
        basket.add("Cerise")

        assertThat(basket.total()).isEqualTo(130)
    }

    @Test
    fun `several times the cerises discount`() {
        basket.add("Cerise")
        basket.add("Cerise")
        basket.add("Cerise")
        basket.add("Cerise")

        assertThat(basket.total()).isEqualTo(260)
    }

    @Test
    fun `Banane discount`() {
        basket.add("Banane")
        basket.add("Banane")

        assertThat(basket.total()).isEqualTo(150)
    }

    @Test
    fun `several times the banane discount`() {
        basket.add("Banane")
        basket.add("Banane")
        basket.add("Banane")
        basket.add("Banane")

        assertThat(basket.total()).isEqualTo(300)
    }

}