class Casa{
    var cor: String=""
    var vagasGaragem: Int = 0

    fun detalhesCasa(){
        println("A casa tem a cor: $cor, vagas de garagem: $ vagaGaragem")
    }

    fun abrirJanela (qntJanelas: Int){
        println ("Abrir janela total: $qtdJanelas")
    }

    fun abrirPorta (){
        println("Abrir porta")
    }

    fun abrirCasa (){
        this.abrirJanela()
        this.abrirPorta()
    }
}


fun main(args: Array<String>){

    val casa = Casa()
    casa.cor = "Amarela"
    casa.vagasGaragem = 2
    casa.detalhesCasa()

}