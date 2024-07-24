//47. Write a program that accept character from keyboard and determine whether the
//character is a capital letter, small letter, digit or a special character

fun main() {
    print("Enter a character: ")
    val input = readLine() ?: ""

    if (input.length != 1) {
        println("Please enter exactly one character.")
        return
    }

    val char = input[0]

    when {
        char.isUpperCase() -> println("The character is a capital letter.")
        char.isLowerCase() -> println("The character is a small letter.")
        char.isDigit() -> println("The character is a digit.")
        else -> println("The character is a special character.")
    }
}
