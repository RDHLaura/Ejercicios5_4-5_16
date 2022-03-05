class Pistola:ArmaFuego {
    var calibre:Int
        private set
    constructor(potencia:Float, cargador:Int, calibre:Int) : super(potencia, cargador){
        this.calibre=calibre
        this.potencia=potencia+calibre
    }




}