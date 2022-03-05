abstract class ArmaBlanca:Arma {

    constructor(potencia:Float) : super(potencia)
    open protected var afilada:Boolean=true
    open protected var reduccionAfilar=super.potencia/2

    fun afilar():Boolean{
        afilada=true
        return afilada
    }

    override fun atacar():Float{
        if (afilada){
            return super.atacar()
        }else{
            return reduccionAfilar
        }
    }

}