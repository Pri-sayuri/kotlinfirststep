fun exibirMensagem(nome: String, idade: Int){
    //bloco de codigos
    println("Vc não preencheu todos os dados! $nome idade $idade")
}

fun somar (n1: Int, n2: Int): Int{
    var total = n1 + n2
    return total

fun main(args: Array<String>){
 println ("Hello world!")
   print("Hello ")
    //ao utilizar var é criada uma variável imutável
    var usuario = "Priscila Nitta"
    println(usuario)
    
    /*val pi = 3.14
    println ("what is the value for Pi?")
    println (pi)*/
    
    var salario = 1000
    var bonus = 20
    var total = salario + bonus
    println("O salário é $total composto por $bonus de bonus")

      // tipos de variaveis
   /* var numero: Double = 3.52462
    var numero1 ="Jamilton"
    var numero2: Float = 5.3f
    var numerointeiro: Int = 10
    var numeroLong: Long = 1001000000L
    var resultado = true*/
    
    //array
    var nomes = arrayOf("Jamilton", "Letícia", "Mariana", 360)
    var numero = arrayOf(10,20,30,40)
    var int = intArrayOf (2, 4, 6, 8)
    nomes[0] = "Amanda"
    
    println (nomes[0])

    //funções
    exibirMensagem("Priscila", 30)
   var resultado = somar(52562,352)
    println(resultado)
fun exibirMensagem (nome: String){
    //bloco de códigos
    println("Alerta, $nome , vc não preencheu todos os dados!")
}

fun somar (numero1: Int, numero2: Int){
    var total = numero1 + numero2
    println(total)
}

//Classes
class Casa{
    //propriedades
    var cor: String = ""
    
    //metodos
    fun abrirJanela(qtdJanelas: Int){
        println("Abrir Janela total: $qtdJanelas")
    }
     fun abrirPorta(){
        println("Abrir porta")
    }
     fun abrirCasa(){
      // this.abrirJanela()
         this.abrirPorta()
    }
    
}

fun main(args: Array<String>) {
  val casa = Casa()
    casa.cor= "Amarela"
    casa.abrirJanela(3)
    print("A cor da casa é ")
    println(casa.cor)
    
   /*  val casa2 = Casa()
    casa2.cor= "Vermelha"
    println(casa2.cor)
    */



}