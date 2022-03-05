class Hacha:ArmaBlanca {
    var filos:Int
        private set
    constructor(potencia:Float, filos:Int) : super(potencia){
        this.filos=filos
    }
    override fun atacar():Float{
        return potencia*filos
    }
}