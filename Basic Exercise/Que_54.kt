//54. Print 1 2 3 5 6 7 9 -_ _ _ n

fun main() {
    val n = 20  // You can change this value to the desired 'n'
    for (i in 1..n) {
        if (i % 4 != 0) {  // Skip multiples of 4
            print("$i ")
        }
    }
}
