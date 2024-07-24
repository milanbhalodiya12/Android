//57. Print series of 1/2, 2/3, 3/4, 4/5, _ _ _ N/N+1

fun main() {
    val N = 10 // Change N to adjust the series length

    println("Series of fractions from 1/2 to $N/${N + 1}:")
    for (i in 1..N) {
        println("$i/${i + 1}")
    }
}
