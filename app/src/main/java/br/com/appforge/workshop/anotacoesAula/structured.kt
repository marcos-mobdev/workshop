package br.com.appforge.workshop.anotacoesAula

fun main() {

    /*
    //Variáveis mutáveis e imutáveis
    val nome = "Marcos" //variavel imutavel
    var idade = 31      //variavel mutavel
    //nome = "João"
    idade = 32]
     */
    /*
    //Tipos mais comuns
    var nome: String = "Ana"
    var idade: Int = 32
    var altura: Double = 1.60
    var sexo: Char = 'f'
    var maiorDeIdade: Boolean = true

    nome = "Ana - $idade - ${sexo}"

    println(nome)

     */
    /*
    //If..Else
    var altura = 1.69

    var variavel = ""


    var passou = if(altura > 1.70){
        "Altura permitida"
    }else{
        "Altura não permitida"
    }
    println(passou)
     */
    /*
    //When
    var categoria = 5
    var nomeCategoria = when(categoria){
        1->  "Menu"
        2->  "Opções"
        3-> "Sair"
        else -> "Invalido"
    }
    println(nomeCategoria)
     */
    /*
        //Arrays

        var a = arrayOf(2, 2, 3)
        var b = emptyArray<String>()



        b = arrayOf("Banana", "Maça", "Pera")
        b.set(0,"Kiwi")

        b.forEach { fruta ->
            print("$fruta -")
        }

         */
    /*
    //Listas
    var minhaLista = mutableListOf<Int>(1,2,3,4,5)
    var outraLista = listOf(7,8,9)
    minhaLista.add(6)
    //1,2,3,4,5,6,7,8,9
    minhaLista.addAll(outraLista)
    minhaLista[2]
    minhaLista[2] = 0
    minhaLista.removeAt(0)

    minhaLista.forEach{ x->
        print("$x ")
    }

    //2,0,4,5,6,7,8,9
     */
    /*
    //Laços
    var myArray = arrayOf(1, 3, 4)

    for (fruta in myArray) {
        print(fruta)
    }

    for (i in 20 downTo 0 step 3)
        println(i)
    var i = 0

    while (i < 10) {
        print(i)
        i++
    }

     */
    /*
    //Funções
    // POO/funcional

    //Função inline
    fun escrever() = println("Olá amigos!")

    escrever()

    //Função com parametros
    fun escreverTexto(texto: String): Unit //Quando a função nao tem retorno
    {
        println(texto)
    }
    escreverTexto("Estamos no workshop")

    fun soma(n1: Int, n2: Int): Int {
        return n1 + n2
    }
    soma(1, 3)

    fun soma(n1: Double, n2: Double): Double {
        return n1 + n2
    }

    fun soma(n1: Double, n2: Double, n3: Double): Double {
        return n1 + n2 + n3
    }

    val minhaLambda
            : (Int, Int) -> Unit =
        { a, b
            ->
            print("Lambda: ${a + b}")
        }

    minhaLambda(2, 3)


     */

}