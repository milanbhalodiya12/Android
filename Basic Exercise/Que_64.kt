//64. Display sum of digit

fun main() {
    val number = 12345 // Change this number to calculate sum of digits for a different number
    val sum = sumOfDigits(number)

    println("Sum of digits of $number is: $sum")
}

fun sumOfDigits(number: Int): Int {
    var num = number
    var sum = 0

    while (num > 0) {
        sum += num % 10
        num /= 10
    }

    return sum
}
