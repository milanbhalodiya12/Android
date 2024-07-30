//59. Print 0 1 1 2 3 5 8 13 21 34 55 (Fibonacci)

fun main() {
    val terms = 10 // Number of Fibonacci terms to print

    println("Fibonacci sequence of $terms terms:")

    var a = 0
    var b = 1

    repeat(terms) {
        print("$a ")
        val sum = a + b
        a = b
        b = sum
    }
}
