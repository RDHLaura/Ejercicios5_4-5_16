abstract class Arma {
    open protected var potencia:Float
    constructor(potencia:Float){
        this.potencia=potencia
        require(potencia>0)
    }
    open fun atacar():Float{
        return potencia
    }
}