open class Animal{
    open fun dormir(){
        print("Dormir")
    }
    open fun comer(){
         print("Comer")
     }
}

class Cao : Animal(){
    override fun dormir(){
        super.dormir()
        println(" na casinha")
    }
        
     override fun comer(){
        super.comer()
        println(" ração")
    }
     
    fun latir(){
        println("Latir")
    }
}

/*class Passaro : Animal() {
    override fun comer(){
        super.comer()
        println("alpiste")
    }
    
}*/

fun main(args: Array<String>) {
    
    val cao = Cao()
    cao.dormir()
    cao.comer()
    cao.latir()
    
   /* val passaro = Passaro()
    passaro.dormir()
    passaro.comer()*/
  
}