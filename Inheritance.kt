open class Person(name : String)
{
    init {
        println("My name is $name")

    }
    fun myAdhar(num : Int)
    {
        println("My Adhar number is : $num")
    }
}

class Teacher(name: String) : Person("Milan")
{
    init {
        println("My name is $name")

    }
}

fun main() {
    var per1 = Person("ABC")
    per1.myAdhar(1234554)
    var Tec = Teacher("XYZ")
    Tec.myAdhar(12896)

}