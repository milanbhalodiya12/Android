//68. Count odd and even digits from given number

fun main() {
    val number = 123456789 // Change this number to count odd and even digits for a different number

    val (evenCount, oddCount) = countEvenOddDigits(number)

    println("Number: $number")
    println("Even digits count: $evenCount")
    println("Odd digits count: $oddCount")
}

fun countEvenOddDigits(number: Int): Pair<Int, Int> {
    var num = number
    var evenCount = 0
    var oddCount = 0

    while (num != 0) {
        val digit = num % 10
        if (digit % 2 == 0) {
            evenCount++
        } else {
            oddCount++
        }
        num /= 10
    }

    return Pair(evenCount, oddCount)
}
