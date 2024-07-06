abstract open class Shiva(){
    fun lordShiva(){
        println("Har Har Mahadev")
    }
    abstract fun Prayer()
}

class Rama() : Shiva(){
    override fun Prayer(){
        println("Hail Lord Rama")

    }
}
class Krishna() : Shiva(){
    override fun Prayer(){
        println("Hail Lord Krishna")

    }
}

fun main() {
    var s :Shiva = Rama()
    s.lordShiva()
    s.Prayer()
    s = Krishna()
    s.Prayer()
}