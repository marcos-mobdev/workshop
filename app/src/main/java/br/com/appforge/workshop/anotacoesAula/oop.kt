package br.com.appforge.workshop.anotacoesAula


open class Animal( //Open na classe habilita herança para filhos
    var nome: String,
    var peso: Double
) {
    open fun dormir() { //Open no método habilita override
        println("zzz")
    }

    fun movimentar(){
        println("Andando...")
    }
}

class Cao(nome: String, peso: Double)
    : Animal(nome, peso) { //Herança com construtor

    fun latir() { //metodo exclusivo da classe cao
        println("Au au!")
    }

    override fun dormir(){  //sobrescrita da funçao dormir da classe pai
        super.dormir()  //chamada de método da classe pai
        println("Opa, acordo facil")    //linha adicional de código da classe Cao
    }

}

class Passaro(
    nome: String,
    peso: Double
) : Animal(nome, peso) {

    fun canta() { //metodo exclusivo da classe Passaro
        println("bem te vi!")
    }
}



fun main() {

    var toto = Cao("Toto",2.3)
    var bemtevi = Passaro("Bem te vi", 0.03)
    //toto.latir()
    //bemtevi.canta()
    //bemtevi.dormir()
    toto.dormir()

    //var produto = Produto()
    //produto.apresentarProduto()

    //var produto = Produto()
    //produto.apresentarProduto()
}