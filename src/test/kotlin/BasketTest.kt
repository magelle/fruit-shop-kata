import assertk.assertThat
import assertk.assertions.isEqualTo
import kotlin.test.Test

class BasketTest {

    val basket = Basket(::applyDiscounts)

    @Test
    fun `Pomme price is 100`() {
        basket.add(POMMES)

        assertThat(basket.total()).isEqualTo(100)
    }

    @Test
    fun `Apple price is 100`() {
        basket.add(APPLES)

        assertThat(basket.total()).isEqualTo(100)
    }

    @Test
    fun `Mele price is 100`() {
        basket.add(MELE)

        assertThat(basket.total()).isEqualTo(100)
    }

    @Test
    fun `Banane price is 150`() {
        basket.add(BANANES)

        assertThat(basket.total()).isEqualTo(150)
    }

    @Test
    fun `Cerise price is 75`() {
        basket.add(CERISES)

        assertThat(basket.total()).isEqualTo(75)
    }

    @Test
    fun `Sum fruits`() {
        basket.add(POMMES)
        basket.add(POMMES)

        assertThat(basket.total()).isEqualTo(200)
    }

    @Test
    fun `Cerise discount`() {
        basket.add(CERISES)
        basket.add(CERISES)

        assertThat(basket.total()).isEqualTo(130)
    }

    @Test
    fun `several times the cerises discount`() {
        basket.add(CERISES)
        basket.add(CERISES)
        basket.add(CERISES)
        basket.add(CERISES)

        assertThat(basket.total()).isEqualTo(260)
    }

    @Test
    fun `Banane discount`() {
        basket.add(BANANES)
        basket.add(BANANES)

        assertThat(basket.total()).isEqualTo(150)
    }

    @Test
    fun `several times the banane discount`() {
        basket.add(BANANES)
        basket.add(BANANES)
        basket.add(BANANES)
        basket.add(BANANES)

        assertThat(basket.total()).isEqualTo(300)
    }

    @Test
    fun `apples discount`() {
        basket.add(APPLES)
        basket.add(APPLES)
        basket.add(APPLES)

        assertThat(basket.total()).isEqualTo(200)
    }

    @Test
    fun `several times the apples discount`() {
        basket.add(APPLES)
        basket.add(APPLES)
        basket.add(APPLES)
        basket.add(APPLES)
        basket.add(APPLES)
        basket.add(APPLES)

        assertThat(basket.total()).isEqualTo(100)
    }

    @Test
    fun `Mele discount`() {
        basket.add(MELE)
        basket.add(MELE)

        assertThat(basket.total()).isEqualTo(100)
    }

    @Test
    fun `several times the Mele discount`() {
        basket.add(MELE)
        basket.add(MELE)
        basket.add(MELE)
        basket.add(MELE)

        assertThat(basket.total()).isEqualTo(100)
    }

    @Test
    fun `super pommes discount`() {
        basket.add(APPLES)
        basket.add(POMMES)
        basket.add(POMMES)
        basket.add(MELE)

        assertThat(basket.total()).isEqualTo(300)
    }

    @Test
    fun `several times the super pommes discount`() {
        basket.add(APPLES)
        basket.add(POMMES)
        basket.add(POMMES)
        basket.add(POMMES)

        basket.add(APPLES)
        basket.add(POMMES)
        basket.add(MELE)
        basket.add(POMMES)

        assertThat(basket.total()).isEqualTo(400)
    }

    @Test
    fun `super fruit discount`() {
        basket.add(APPLES)
        basket.add(BANANES)
        basket.add(CERISES)
        basket.add(MELE)
        basket.add(POMMES)

        assertThat(basket.total()).isEqualTo(325)
    }
}