//53. Print 1 10 2 9 3 8 4 7 5 6

fun main() {
    var start = 1
    var end = 10

    while (start < end) {
        println(start)
        println(end)
        start++
        end--
    }

    if (start == end) {
        println(start)
    }
}