fun main() {
    var microfone = Microfone("QuadCast","HyperX","USB")
    microfone.microfoneInfo()
    microfone.status()
    microfone.ligarDesligar()
    microfone.aumentarVolume(20)
    microfone.diminuirVolume(5)
    microfone.status()

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