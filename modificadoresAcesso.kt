open class Animal{

    //private, protected, public são os modificadores mais usados.
    internal var nome = "marley"
    protected fun dormir(){
        println("Dormir")
    }
}

class Cao: Animal(){
    fun exibeNome(){
        println("Método exibe nome: $nome")
    }
}

fun main(args: Array<String>) {
   
    val cao = Cao()
    cao.exibeNome()
    
}