fun main() {
    val number = 1020304050L // Change this number to count zeros for a different number

    val zeroCount = countZeros(number)

    println("Number: $number")
    println("Number of zeros: $zeroCount")
}

fun countZeros(number: Long): Int {
    var num = Math.abs(number) // Handle negative numbers by using absolute value
    var zeroCount = 0

    if (num == 0L) {
        return 1 // Special case for number being exactly 0
    }

    while (num != 0L) {
        val digit = num % 10
        if (digit == 0L) {
            zeroCount++
        }
        num /= 10
    }

    return zeroCount
}
