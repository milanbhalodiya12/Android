//60. Print factorial value of given number

fun main() {
    val number = 5 // Change this number to compute factorial for a different number

    println("Factorial of $number is: ${factorial(number)}")
}

fun factorial(n: Int): Long {
    return if (n == 0) {
        1
    } else {
        var result: Long = 1
        for (i in 1..n) {
            result *= i.toLong()
        }
        result
    }
}
