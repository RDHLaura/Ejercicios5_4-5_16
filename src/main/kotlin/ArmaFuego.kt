abstract class ArmaFuego :Arma{
    constructor(potencia:Float, cargador:Int) : super(potencia){
        this.cargador=cargador
        this.balas=cargador
    }
    open protected var cargada:Boolean=true
    open protected var cargador:Int
    open protected var balas:Int

    open fun cargar(){
        cargada=true
    }

    open fun disparar():Boolean{
        if (balas<=0)
            cargada=false
        return cargada
    }

    override open fun atacar():Float{
        if(disparar()){
            balas--
            return potencia
        }else{
            return 0f
        }
    }
}