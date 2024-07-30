//61. Check whether the number is prime or not

fun main() {
    val number = 17 // Change this number to check for a different number

    if (isPrime(number)) {
        println("$number is a prime number.")
    } else {
        println("$number is not a prime number.")
    }
}

fun isPrime(n: Int): Boolean {
    if (n <= 1) {
        return false // Numbers less than or equal to 1 are not prime
    }
    if (n == 2 || n == 3) {
        return true // 2 and 3 are prime numbers
    }
    if (n % 2 == 0 || n % 3 == 0) {
        return false // Numbers divisible by 2 or 3 (except 2 and 3 themselves) are not prime
    }

    var i = 5
    while (i * i <= n) {
        if (n % i == 0 || n % (i + 2) == 0) {
            return false
        }
        i += 6
    }
    return true
}
