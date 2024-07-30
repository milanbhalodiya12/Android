//58. Print series 1 + 4 – 9 + 16 – 25 + 36 + _ _ _ + N2

fun main() {
    val N = 10 // Change N to adjust the series length

    println("Series from 1^2 to $N^2:")

    var sum = 0
    for (i in 1..N) {
        val term = i * i
        if (i % 2 == 0) {
            // Even index terms (2nd, 4th, 6th, ...) are subtracted
            sum -= term
            print("- $term ")
        } else {
            // Odd index terms (1st, 3rd, 5th, ...) are added
            sum += term
            if (i != 1) {
                print("+ $term ")
            } else {
                print("$term ") // Special case for the first term
            }
        }
    }

    println("\nSum = $sum")
}
