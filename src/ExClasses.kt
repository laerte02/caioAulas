fun main() {
    var microfone = Microfone("QuadCast","HyperX","USB")
    microfone.microfoneInfo()
    microfone.status()
    microfone.ligarDesligar()
    microfone.aumentarVolume(20)
    microfone.diminuirVolume(5)
    microfone.status()

    var cachorro = Cachorro("Mel", true,true)
    cachorro.dormir()
    cachorro.moder()
    cachorro.comer()
    cachorro.comer()
    cachorro.moder()
}

class Microfone(val modelo: String,val marca: String,val conexao :String){
    var ligado = false
    var volume = 0

    fun microfoneInfo(){
        println("Microfone: $modelo marca: $marca tipo de conexão $conexao")
    }

    fun ligarDesligar() {
        if (ligado == false) {
            ligado = true
        } else {
            ligado = false
        }
    }

    fun aumentarVolume(volume: Int) {
        this.volume += volume
    }

    fun diminuirVolume(volume: Int) {
        this.volume -= volume
    }

    fun status() {
        if (!ligado) {
            println("Microfone desligado")
        } else {
            println("Volume $volume")
        }
    }

}

class Cachorro(val nome:String, var fome : Boolean, var bravo :Boolean){

    fun comer (){
        if(!fome){
            println("$nome não está com fome")
        }else{
            println("$nome não está com fome")
            println("$nome come")
            this.fome = false
            this.bravo = false
        }
    }
    fun dormir(){
        println("$nome dorme")
    }

    fun moder(){
        if (bravo){
            println("$nome te morde")
        }else{
            println("$nome não te morde")
        }
    }

}