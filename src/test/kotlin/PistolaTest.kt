import org.junit.jupiter.api.Test
import org.junit.jupiter.api.Assertions.*

var pistola1=Pistola(100f, 10, 38)
internal class PistolaTest {
   @Test
    fun getCalibre() {
        assert(pistola1.calibre==38)
    }
    @Test
    fun atacarPistola(){
        assert(pistola1.atacar()==138f)
    }
    @Test
    fun disparar(){
        repeat(10){
            assert(pistola1.disparar())
            pistola1.atacar()
        }
        repeat(11){
            assertFalse(pistola1.disparar())
            pistola1.atacar()
        }
    }

}


