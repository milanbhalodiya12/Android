//56. Print series of 1/1, 1/2, 1/3, _ _ _ 1/N

fun main() {
    val N = 10 // Change N to adjust the series length

    println("Series of fractions from 1/1 to 1/$N:")
    for (i in 1..N) {
        println("1/$i")
    }
}
