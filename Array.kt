fun main() {
    var myArr = Array<Int>(6){0}
    var myArr2 = arrayOf(5,6,7,8,9,4)
    var myArr3 = arrayOf<Int>(5,8,6,9,4,7,3)
    var myArr4 = arrayOf<String>("Atmiya","University")
    var myArr5 = arrayOf(5,8,"Atmiya",20,"University","Rajkot")

    println(myArr[3])
    println(myArr2[5])
    println(myArr3[6])
    println(myArr4[1])
    println(myArr5[2])

    for (i in myArr5)
    {
        print("\n $i")
    }
}