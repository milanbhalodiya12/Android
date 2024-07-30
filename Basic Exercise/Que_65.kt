//65. Display reverse number

fun main() {
    val number = 12345 // Change this number to reverse a different number
    val reversed = reverseNumber(number)

    println("Reverse of $number is: $reversed")
}

fun reverseNumber(number: Int): Int {
    var num = number
    var reversed = 0

    while (num != 0) {
        val digit = num % 10
        reversed = reversed * 10 + digit
        num /= 10
    }

    return reversed
}
