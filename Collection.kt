fun main() {
    var arr = ArrayList<String>()

    arr.add("Atmiya")
    arr.add("University")
    arr.add("MCA")
    arr.add("Sem-3")
    arr.add("Rajkot")

    println(arr)

    println(arr.contains("rajkot"))
    println(arr.remove("Sem-3"))
    println(arr)
    println(arr.contains("Sem-3"))

    arr.set(0,"Milan")
    println(arr)


}