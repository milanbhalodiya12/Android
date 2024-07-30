fun main() {
    val start = 1
    val end = 50 // Change these values to adjust the range

    println("Prime numbers between $start and $end are:")
    for (num in start..end) {
        if (isPrime(num)) {
            println(num)
        }
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
