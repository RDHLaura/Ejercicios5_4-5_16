class Escopeta:ArmaFuego {
    var recortada:Boolean
        private set
    var aumentoRecortada:Float=0f
        private set
    constructor(potencia:Float, cargador:Int, recortada:Boolean) : super(potencia, cargador){
        this.recortada=recortada
        if (recortada)
            this.aumentoRecortada=potencia/2
    }

    override fun atacar(): Float {
        if (recortada) {
            this.aumentoRecortada = potencia / 2
            return super.atacar()+aumentoRecortada
        }
        else
            return super.atacar()
    }
}