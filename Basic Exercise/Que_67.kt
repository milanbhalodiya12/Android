//67. Check entered number is palindrome or not

fun main() {
    val number = 12321 // Change this number to check for a different number

    if (isPalindrome(number)) {
        println("$number is a palindrome.")
    } else {
        println("$number is not a palindrome.")
    }
}

fun isPalindrome(number: Int): Boolean {
    val original = number
    var reversed = 0
    var num = number

    while (num != 0) {
        val digit = num % 10
        reversed = reversed * 10 + digit
        num /= 10
    }

    return original == reversed
}
