//70. Count digits of given number

fun main() {
    val number = 1234567890 // Change this number to count digits for a different number

    val digitCount = countDigits(number)

    println("Number: $number")
    println("Number of digits: $digitCount")
}

fun countDigits(number: Int): Int {
    return number.toString().length
}

