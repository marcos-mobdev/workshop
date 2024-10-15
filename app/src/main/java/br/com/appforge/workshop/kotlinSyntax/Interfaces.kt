package br.com.appforge.workshop.kotlinSyntax


//Interface ->Contrato

interface programadorFullstack {
    fun programarBackend()
    fun programarFrontend()
}

class ProgramadorJavascript: programadorFullstack {
    override fun programarBackend() {
        println("programando back em JS")
    }

    override fun programarFrontend() {
        println("programando front em JS")
    }

}

class ProgramadorPython:programadorFullstack{
    override fun programarBackend() {
        println("programando back em Python")
    }

    override fun programarFrontend() {
        println("programando front em Python")
    }

}

fun main(){
    var programador1 = ProgramadorPython()
    var programador2 = ProgramadorJavascript()
    /*
    programador1.programarBackend()
    programador1.programarFrontend()

    programador2.programarBackend()
    programador2.programarFrontend()

     */


    var diaDaSemana = 1
    if(diaDaSemana == 1){
        programador1.programarBackend()
    }else if(diaDaSemana == 2){
        programador2.programarBackend()
    }




}