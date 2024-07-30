//63. Write program that display square, cubes and factorials of all integer from 1 to 10

fun main() {
    println("Number\tSquare\tCube\tFactorial")

    for (i in 0..10) { // Include 0 to calculate factorial(0)
        val square = i * i
        val cube = i * i * i
        val factorial = factorial(i)

        println("$i\t$square\t$cube\t$factorial")
    }
}

fun factorial(n: Int): Long {
    var result: Long = 1
    if (n == 0) return 1 // Handle factorial of 0

    for (i in 1..n) {
        result *= i
    }
    return result
}
