import org.junit.jupiter.api.Test
import org.junit.jupiter.api.Assertions.*


var escopeta1=Escopeta(150f,2,true)
var escopeta2=Escopeta(150f,2,false)
internal class EscopetaTest {

    @Test
    fun getRecortada() {
        assertTrue(escopeta1.recortada)
        assertFalse(escopeta2.recortada)
    }

    @Test
    fun getAumentoRecortada() {
        assert(escopeta1.aumentoRecortada==75f)
        assert(escopeta2.aumentoRecortada==0f)
    }

    @Test
    fun atacar() {
        assert(escopeta2.atacar()==150f)
        assert(escopeta1.atacar()==225f)
    }
}