//51. Print 1 2 4 8 16 32 64 128 256 512 1024

fun main() {
    var num = 1
    for (i in 0..10) {
        println(num)
        num *= 2
    }

//using While Loop
    var num1 = 1
    while (num <= 1024) {
        println(num)
        num1 *= 2
    }
}