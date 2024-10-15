package br.com.appforge.workshop.anotacoesAula

fun main(){
    /*
    //Variáveis mutáveis e imutáveis
    val nome = "Marcos" //variavel imutavel
    var idade = 31      //variavel mutavel
    nome = "João"
    idade = 32
     */
    /*
    //Tipos mais comuns
    var nome: String = "Ana"
    var idade: Int = 32
    var altura:Double = 1.60
    var sexo: Char = 'f'
    var maiorDeIdade: Boolean = true

    nome = "Ana - ${idade} - ${sexo}"

    println(nome)



     */
    /*
    //If..Else
    var passou = if(altura > 1.70){
        "Altura permitida"
    }else{
        "Altura não permitida"
    }
    println(passou)

     */
    /*
    //When
    var categoria = 2
    var nomeCategoria = when(categoria){
        1->  "Menu"
        2->  "Opções"
        3-> "Sair"
        else -> "Invalido"
    }
    println(nomeCategoria)

     */
    /*
    //Arrays e Listas
    var a = arrayOf(2, 2, 3)
    var b = emptyArray<Int>()


    var minhaLista = mutableListOf<Int>(1,3,4,7,9)
    var outraLista = listOf(1,0,9)
    minhaLista.add(5)
    //1,3,4,7,9,5,1,0,9
    minhaLista.addAll(outraLista)
    minhaLista[2]
    minhaLista[2] = 3
    minhaLista.forEach{ x->
        println(x)
    }
    minhaLista.removeAt(1)

     */
    /*
    //Laços
      for(i in 1..4)
          println(i)
      */
    /*
    //Funções
    fun escrever() = println("Olá amigos!")

    fun escreverTexto(texto:String):Unit //Quando a função nao tem retorno
    {
        println(texto)
    }
    fun soma(n1:Int, n2:Int):Int{
        return n1+n2
    }
    fun soma(n1:Double, n2:Double):Double{
        return n1+n2
    }

    fun soma(n1:Double, n2:Double, n3: Double):Double{
        return n1+n2
    }
    val minhaLambda: (Int, Int)-> Int = {a,b -> a+b}

    minhaLambda(2,3)



     */
}