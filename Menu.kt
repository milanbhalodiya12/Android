fun main() {
    do {
        println("-----")
        println("Welcome to prog.")
        println("Enter 1 for Addition")
        println("Enter 2 for Subtraction")
        println("Enter 3 for Multiplication")
        println("Enter 4 for Division")
        println("Enter 5 for Exit")

        print("Enter your Choice : ")
        val choice = readLine()!!.toInt()

        when (choice) {
            1 -> {
                println("You Selected Addition")
                print("Enter 1st Number : ")
                val num1 = readLine()!!.toInt()
                print("Enter Second Number : ")
                val num2 = readLine()!!.toInt()
                println("Addition = ${num1 + num2}")
            }
            2 -> {
                println("You Selected Subtraction")
                print("Enter 1st Number : ")
                val num1 = readLine()!!.toInt()
                print("Enter Second Number : ")
                val num2 = readLine()!!.toInt()
                println("Subtraction = ${num1 - num2}")
            }
            3 -> {
                println("You Selected Multiplication")
                print("Enter 1st Number : ")
                val num1 = readLine()!!.toInt()
                print("Enter Second Number : ")
                val num2 = readLine()!!.toInt()
                println("Multiplication = ${num1 * num2}")
            }
            4 -> {
                println("You Selected Division")
                print("Enter 1st Number : ")
                val num1 = readLine()!!.toInt()
                print("Enter Second Number : ")
                val num2 = readLine()!!.toInt()
                println("Division = ${num1 / num2}")
            }
            5 -> {
                println("Exiting the program")
            }
            else -> {
                println("Invalid Choice")
            }
        }
    } while (choice != 5)
}