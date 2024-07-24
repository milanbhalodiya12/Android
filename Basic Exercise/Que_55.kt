//55. Input and number display table of that number

fun main() {
    val number = 7
    val limit = 10

    println("Multiplication Table for $number:")
    for (i in 1..limit) {
        println("$number * $i = ${number * i}")
    }
}
