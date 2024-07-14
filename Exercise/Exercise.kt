//1. Write a program that prints your name and your college name.
//fun main() {
//    val name = "Bhalodiya Milan"
//    val collegeName = "Atmiya University"
//    println("Name: $name")
//    println("College Name: $collegeName")
//}

//2. Write a program that prints your address with name.
//fun main() {
//    val name = "Bhalodiya Milan"
//    val address = "Morbi"
//    println("Name: $name")
//    println("Address: $address")
//}


//3. Write a program that accept two numbers and perform all basic mathematicaloperation and print.
//fun main() {
//    val num1 = 10
//    val num2 = 5
//    println("Addition: ${num1 + num2}")
//    println("Subtraction: ${num1 - num2}")
//    println("Multiplication: ${num1 * num2}")
//    println("Division: ${num1 / num2}")
//}


//4. Write a program to calculate simple interest.
//fun main() {
//    val principal = 1000.0
//    val rate = 5.0
//    val time = 2.0
//    val simpleInterest = (principal * rate * time) / 100
//    println("Simple Interest: $simpleInterest")
//}


//5. Write a program to calculate compound interest
//fun main() {
//    val principal = 1000.0
//    val rate = 5.0
//    val time = 2.0
//    val compoundInterest = principal * Math.pow((1 + rate / 100), time)
//    println("Compound Interest: $compoundInterest")
//}


//6. Write a program to calculate 10% bonus of salary.
//fun main() {
//    val salary = 50000.0
//    val bonus = salary * 0.1
//    println("Bonus: $bonus")
//}


//7. Write a program to convert KM into Meter
//fun main() {
//    val km = 5
//    val meters = km * 1000
//    println("$km KM is equal to $meters Meters")
//}


//8. The distance between two cities is input through keyboard. Write a program to convertand print
//this distance in feet, meter, inch and centimeter
//fun main() {
//    val km = 10.0
//    val meters = km * 1000
//    val feet = meters * 3.28084
//    val inches = feet * 12
//    val centimeters = meters * 100
//
//    println("Distance in Meters: $meters")
//    println("Distance in Feet: $feet")
//    println("Distance in Inches: $inches")
//    println("Distance in Centimeters: $centimeters")
//}


//9. Write a program to find volume of cylinder (v = 3.14r2h )
//fun main() {
//    val radius = 5.0
//    val height = 10.0
//    val volume = 3.14 * radius * radius * height
//    println("Volume of Cylinder: $volume")
//}


//10. Write a program to calculate area of triangle (a = 1/2hb)
//fun main() {
//    val base = 10.0
//    val height = 5.0
//    val area = 0.5 * base * height
//    println("Area of Triangle: $area")
//}


//11. Write a program to calculate area and perimeter of the rectangle
//fun main() {
//    val length = 10.0
//    val width = 5.0
//    val area = length * width
//    val perimeter = 2 * (length + width)
//    println("Area of Rectangle: $area")
//    println("Perimeter of Rectangle: $perimeter")
//}


//12. Write a program to calculate area of circle
//fun main() {
//    val radius = 7.0
//    val area = 3.14 * radius * radius
//    println("Area of Circle: $area")
//}

//13. Write a program to swap two values
//fun main() {
//    var a = 5
//    var b = 10
//    println("Before Swap: a = $a, b = $b")
//    val temp = a
//    a = b
//    b = temp
//    println("After Swap: a = $a, b = $b")
//}


//14. Write a program to swap two values without using third variable
//fun main() {
//    var a = 5
//    var b = 10
//    println("Before Swap: a = $a, b = $b")
//    a = a + b
//    b = a - b
//    a = a - b
//    println("After Swap: a = $a, b = $b")
//}


//15. Write a program to read the value of X and Y and print the result of following expression
//(X+Y)/(X-Y)
//fun main() {
//    val x = 10.0
//    val y = 5.0
//    val result = (x + y) / (x - y)
//    println("Result: $result")
//}


//16. Write a program to read the value of X and Y and print the result of following
//expression (X+Y)/2
//fun main() {
//    val x = 10.0
//    val y = 5.0
//    val result = (x + y) / 2
//    println("Result: $result")
//}


//17. Write a program to read the value of X and Y and print the result of following expression
//(X+Y)*(X-Y)
//fun main() {
//    val x = 10.0
//    val y = 5.0
//    val result = (x + y) * (x - y)
//    println("Result: $result")
//}

//18. Write a program to read the value of X and Y and print the result of following expression
//3X2+2XY+3Y2
//fun main() {
//    val x = 10.0
//    val y = 5.0
//    val result = 3 * x * x + 2 * x * y + 3 * y * y
//    println("Result: $result")
//}


//19. Write a program to read the value of X and Y and print the result of following expression
//(2X+3Y)/XY
//fun main() {
//    val x = 10.0
//    val y = 5.0
//    val result = (2 * x + 3 * y) / (x * y)
//    println("Result: $result")
//}


//20. Write a program to convert negative to positive and positive to negative
//fun main() {
//    val number = -5
//    val convertedNumber = -number
//    println("Original Number: $number")
//    println("Converted Number: $convertedNumber")
//}


//21. Write a program that accept 5 numbers from user and find average of the value
//fun main() {
//    val numbers = Array(5) { 0.0 }
//    for (i in numbers.indices) {
//        println("Enter number ${i + 1}: ")
//        numbers[i] = readLine()?.toDoubleOrNull() ?: 0.0
//    }
//    val average = numbers.average()
//    println("Average: $average")
//}


//22. Write a program to find out the net salary of an employee and get the basic salary fromhim.
//Applicable TA 4%, DA 30%, HRA 15% on basic salary. Applicable 3% tax 12% PF on basic salary
//fun main() {
//    println("Enter the basic salary: ")
//    val basicSalary = readLine()?.toDoubleOrNull() ?: 0.0
//
//    val ta = basicSalary * 0.04
//    val da = basicSalary * 0.30
//    val hra = basicSalary * 0.15
//    val grossSalary = basicSalary + ta + da + hra
//
//    val tax = basicSalary * 0.03
//    val pf = basicSalary * 0.12
//    val deductions = tax + pf
//
//    val netSalary = grossSalary - deductions
//
//    println("Net Salary: $netSalary")
//}

//23. Write a program to find maximum number from 2 numbers
//fun main() {
//    println("Enter first number: ")
//    val num1 = readLine()?.toDoubleOrNull() ?: 0.0
//    println("Enter second number: ")
//    val num2 = readLine()?.toDoubleOrNull() ?: 0.0
//
//    val max = if (num1 > num2) num1 else num2
//    println("Maximum number: $max")
//}


//24. Write a program to find out minimum number from 2 numbers
//fun main() {
//    println("Enter first number: ")
//    val num1 = readLine()?.toDoubleOrNull() ?: 0.0
//    println("Enter second number: ")
//    val num2 = readLine()?.toDoubleOrNull() ?: 0.0
//
//    val min = if (num1 < num2) num1 else num2
//    println("Minimum number: $min")
//}


//25. Write a program to find minimum and maximum no from 2 numbers.
//fun main() {
//    println("Enter first number: ")
//    val num1 = readLine()?.toDoubleOrNull() ?: 0.0
//    println("Enter second number: ")
//    val num2 = readLine()?.toDoubleOrNull() ?: 0.0
//
//    val max = if (num1 > num2) num1 else num2
//    val min = if (num1 < num2) num1 else num2
//
//    println("Maximum number: $max")
//    println("Minimum number: $min")
//}


//26. Write a program to check number is odd or even
//fun main() {
//    println("Enter a number: ")
//    val number = readLine()?.toIntOrNull() ?: 0
//    if (number % 2 == 0) {
//        println("The number is even.")
//    } else {
//        println("The number is odd.")
//    }
//}

//27. Write a program that accepts the year from user and check it leap year or not.
//fun main() {
//    println("Enter a year: ")
//    val year = readLine()?.toIntOrNull() ?: 0
//    val isLeap = if (year % 4 == 0 && (year % 100 != 0 || year % 400 == 0)) true else false
//    if (isLeap) {
//        println("$year is a leap year.")
//    } else {
//        println("$year is not a leap year.")
//    }
//}


//28. Write a program to that accept the number from user and check it is divisible by 5 or not.
//fun main() {
//    println("Enter a number: ")
//    val number = readLine()?.toIntOrNull() ?: 0
//    if (number % 5 == 0) {
//        println("The number is divisible by 5.")
//    } else {
//        println("The number is not divisible by 5.")
//    }
//}


//29. Write a program that accept the number from user and check its negative, positive or zero
//fun main() {
//    println("Enter a number: ")
//    val number = readLine()?.toIntOrNull() ?: 0
//    when {
//        number > 0 -> println("The number is positive.")
//        number < 0 -> println("The number is negative.")
//        else -> println("The number is zero.")
//    }
//}


//30. Write a program input one integer number. Check whether number is equal to 10 ornot.
//fun main() {
//    println("Enter a number: ")
//    val number = readLine()?.toIntOrNull() ?: 0
//    if (number == 10) {
//        println("The number is equal to 10.")
//    } else {
//        println("The number is not equal to 10.")
//    }
//}

//31. Write a program input one integer number check whether number is in between 0 to100 or
//not
//fun main() {
//    println("Enter a number: ")
//    val number = readLine()?.toIntOrNull() ?: 0
//    if (number in 0..100) {
//        println("The number is between 0 and 100.")
//    } else {
//        println("The number is not between 0 and 100.")
//    }
//}


//32. Write a program input one integer number check whether number is four digits or not
//fun main() {
//    println("Enter a number: ")
//    val number = readLine()?.toIntOrNull() ?: 0
//    if (number in 1000..9999 || number in -9999..-1000) {
//        println("The number is a four-digit number.")
//    } else {
//        println("The number is not a four-digit number.")
//    }
//}


//33. Write a program input one integer number check whether is greater than 50 and lessthen
//200
//fun main() {
//    println("Enter a number: ")
//    val number = readLine()?.toIntOrNull() ?: 0
//    if (number in 51..199) {
//        println("The number is greater than 50 and less than 200.")
//    } else {
//        println("The number is not in the range of greater than 50 and less than 200.")
//    }
//}


//34. Write a program input one integer number display appropriate day of week.
//fun main() {
//    println("Enter a number (1-7): ")
//    val day = readLine()?.toIntOrNull() ?: 0
//    val dayOfWeek = when (day) {
//        1 -> "Monday"
//        2 -> "Tuesday"
//        3 -> "Wednesday"
//        4 -> "Thursday"
//        5 -> "Friday"
//        6 -> "Saturday"
//        7 -> "Sunday"
//        else -> "Invalid number"
//    }
//    println("Day of the week: $dayOfWeek")
//}


//35. Write a program input one integer number display appropriate name of month
//fun main() {
//    println("Enter a number (1-12): ")
//    val month = readLine()?.toIntOrNull() ?: 0
//    val monthName = when (month) {
//        1 -> "January"
//        2 -> "February"
//        3 -> "March"
//        4 -> "April"
//        5 -> "May"
//        6 -> "June"
//        7 -> "July"
//        8 -> "August"
//        9 -> "September"
//        10 -> "October"
//        11 -> "November"
//        12 -> "December"
//        else -> "Invalid number"
//    }
//    println("Month: $monthName")
//}


//36. Write a program to find out maximum from three number
//fun main() {
//    println("Enter first number: ")
//    val num1 = readLine()?.toDoubleOrNull() ?: 0.0
//    println("Enter second number: ")
//    val num2 = readLine()?.toDoubleOrNull() ?: 0.0
//    println("Enter third number: ")
//    val num3 = readLine()?.toDoubleOrNull() ?: 0.0
//
//    val max = if (num1 > num2) {
//        if (num1 > num3) num1 else num3
//    } else {
//        if (num2 > num3) num2 else num3
//    }
//    println("Maximum number: $max")
//}


//37. Write a program to find out minimum from three number
//fun main() {
//    println("Enter first number: ")
//    val num1 = readLine()?.toDoubleOrNull() ?: 0.0
//    println("Enter second number: ")
//    val num2 = readLine()?.toDoubleOrNull() ?: 0.0
//    println("Enter third number: ")
//    val num3 = readLine()?.toDoubleOrNull() ?: 0.0
//
//    val min = if (num1 < num2) {
//        if (num1 < num3) num1 else num3
//    } else {
//        if (num2 < num3) num2 else num3
//    }
//    println("Minimum number: $min")
//}

//38. Enter age of person and display message as
//----------------------------------------------
//Up to 5 year   |  Kid
//5- 12       |   Children
//13 – 19     |  Teenager
//20 – 30     |   Young
//31 – 60     |   Mid age group
//60 or above |  Old
//----------------------------------------------

//fun main() {
//    println("Enter the age of the person: ")
//    val age = readLine()?.toIntOrNull() ?: 0
//
//    val message = when (age) {
//        in 0..5 -> "Kid"
//        in 6..12 -> "Children"
//        in 13..19 -> "Teenager"
//        in 20..30 -> "Young"
//        in 31..60 -> "Mid age group"
//        else -> "Old"
//    }
//
//    println("The person is: $message")
//}


//39. Write a program input integer number and select number to perform following task
//1 – Addition
//2 – Subtraction
//3 – Multiplication
//4 – Division
//5 – Exit

//fun main() {
//    while (true) {
//        println("Enter first number: ")
//        val num1 = readLine()?.toDoubleOrNull() ?: 0.0
//        println("Enter second number: ")
//        val num2 = readLine()?.toDoubleOrNull() ?: 0.0
//
//        println("Select an operation:")
//        println("1 - Addition")
//        println("2 - Subtraction")
//        println("3 - Multiplication")
//        println("4 - Division")
//        println("5 - Exit")
//
//        when (readLine()?.toIntOrNull() ?: 5) {
//            1 -> println("Result: ${num1 + num2}")
//            2 -> println("Result: ${num1 - num2}")
//            3 -> println("Result: ${num1 * num2}")
//            4 -> {
//                if (num2 != 0.0) {
//                    println("Result: ${num1 / num2}")
//                } else {
//                    println("Division by zero is not allowed.")
//                }
//            }
//            5 -> {
//                println("Exiting...")
//                return
//            }
//            else -> println("Invalid selection. Please try again.")
//        }
//    }
//}


//40. Write a program input 5 subject marks and find class and result
//fun main() {
//    val marks = Array(5) { 0.0 }
//    var totalMarks = 0.0
//
//    for (i in marks.indices) {
//        println("Enter marks for subject ${i + 1}: ")
//        marks[i] = readLine()?.toDoubleOrNull() ?: 0.0
//        totalMarks += marks[i]
//    }
//
//    val average = totalMarks / marks.size
//
//    val result = when {
//        average >= 75 -> "First Class"
//        average >= 60 -> "Second Class"
//        average >= 50 -> "Pass Class"
//        else -> "Fail"
//    }
//
//    println("Total Marks: $totalMarks")
//    println("Average Marks: $average")
//    println("Result: $result")
//}

//41. Write a program to find number which number is divisible by 3 but not divisible by 7
//fun main() {
//    println("Enter the range (e.g., 1 to 100):")
//    println("Start: ")
//    val start = readLine()?.toIntOrNull() ?: 1
//    println("End: ")
//    val end = readLine()?.toIntOrNull() ?: 100
//
//    println("Numbers divisible by 3 but not divisible by 7:")
//    for (num in start..end) {
//        if (num % 3 == 0 && num % 7 != 0) {
//            println(num)
//        }
//    }
//}


//42. Write a program that reads a sales bill amount calculate discount on bill amount asfollows
//if bill amount less than 5000 calculate 7.5% discount on bill amount otherwise calculate11%
//discount on bill. Print bill amount discount amount and net payable bill
//fun main() {
//    println("Enter the bill amount: ")
//    val billAmount = readLine()?.toDoubleOrNull() ?: 0.0
//
//    val discountRate = if (billAmount < 5000) 0.075 else 0.11
//    val discountAmount = billAmount * discountRate
//    val netPayable = billAmount - discountAmount
//
//    println("Bill Amount: $billAmount")
//    println("Discount Amount: $discountAmount")
//    println("Net Payable Bill: $netPayable")
//}

//43. An electric power distribution company charger its domestic customers as follows
//Consumption unit rate of charge
//----------------------------------------------
//0 – 200       |   RS. 0.50 per unit
//201 – 400     |   RS. 100 + RS. 0.65 per unit
//401 – 600     |   RS. 230 + RS. 0.80 per unit
//601 and above |   RS. 390 + RS. 1.00 per unit
//----------------------------------------------
//Read the customer number and power consumed and print the amount to be paid by the customer

//fun main() {
//    println("Enter the customer number: ")
//    val customerNumber = readLine()?.toIntOrNull() ?: 0
//    println("Enter the power consumed (in units): ")
//    val powerConsumed = readLine()?.toDoubleOrNull() ?: 0.0
//
//    val billAmount = when {
//        powerConsumed <= 200 -> powerConsumed * 0.50
//        powerConsumed <= 400 -> 100 + (powerConsumed - 200) * 0.65
//        powerConsumed <= 600 -> 230 + (powerConsumed - 400) * 0.80
//        else -> 390 + (powerConsumed - 600) * 1.00
//    }
//
//    println("Customer Number: $customerNumber")
//    println("Power Consumed: $powerConsumed units")
//    println("Amount to be paid: Rs. $billAmount")
//}


//44. Get a string from user and display it in upper case
//fun main() {
//    println("Enter a string: ")
//    val input = readLine() ?: ""
//    val upperCaseString = input.uppercase()
//    println("Uppercase: $upperCaseString")
//}


//45. Get a string from user and display it in lower case
//fun main() {
//    println("Enter a string: ")
//    val input = readLine() ?: ""
//    val lowerCaseString = input.lowercase()
//    println("Lowercase: $lowerCaseString")
//}


//46. Get a string from user and check it is vowel or consonants
//fun main() {
//    println("Enter a character: ")
//    val input = readLine()?.lowercase() ?: ""
//
//    if (input.length == 1) {
//        val char = input[0]
//        val isVowel = char in "aeiou"
//
//        if (isVowel) {
//            println("$char is a vowel")
//        } else if (char in 'a'..'z') {
//            println("$char is a consonant")
//        } else {
//            println("$char is not a valid alphabet letter")
//        }
//    } else {
//        println("Please enter a single character")
//    }
//}


//47. Write a program that accept character from keyboard and determine whether the
//character is a capital letter, small letter, digit or a special character
//fun main() {
//    println("Enter a character: ")
//    val input = readLine() ?: ""
//
//    if (input.length == 1) {
//        val char = input[0]
//
//        when {
//            char in 'A'..'Z' -> println("$char is a capital letter")
//            char in 'a'..'z' -> println("$char is a small letter")
//            char in '0'..'9' -> println("$char is a digit")
//            else -> println("$char is a special character")
//        }
//    } else {
//        println("Please enter a single character")
//    }
//}


//48. Print 1 to 10
//fun main() {
//    for (i in 1..10) {
//        println(i)
//    }
//}


//49. Print 2 4 6 8 10
//fun main() {
//    for (i in 2..10 step 2) {
//        println(i)
//    }
//}


//50. Print 1 3 5 7 9
//fun main() {
//    for (i in 1..9 step 2) {
//        println(i)
//    }
//}


//51. Print 1 2 4 8 16 32 64 128 256 512 1024
//fun main() {
//    var number = 1
//    while (number <= 1024) {
//        println(number)
//        number *= 2
//    }
//}


//52. Print 10 to 1
//fun main() {
//    for (i in 10 downTo 1) {
//        println(i)
//    }
//}


//53. Print 1 10 2 9 3 8 4 7 5 6
//fun main() {
//    val start = 1
//    val end = 10
//    var left = start
//    var right = end
//
//    while (left <= right) {
//        if (left == right) {
//            println(left)
//        } else {
//            println("$left $right")
//        }
//        left++
//        right--
//    }
//}


//54. Print 1 2 3 5 6 7 9 -_ _ _ n
//fun main() {
//    for (i in 1..9) {
//        if (i % 4 != 0) {
//            println(i)
//        }
//    }
//}


//55. Input and number display table of that number
//fun main() {
//    println("Enter a number: ")
//    val number = readLine()?.toIntOrNull() ?: 1
//
//    for (i in 1..10) {
//        println("$number x $i = ${number * i}")
//    }
//}


//56. Print series of 1/1, 1/2, 1/3, _ _ _ 1/N
//fun main() {
//    println("Enter the value of N: ")
//    val n = readLine()?.toIntOrNull() ?: 1
//
//    for (i in 1..n) {
//        print("1/$i")
//        if (i != n) print(", ")
//    }
//}


//57. Print series of 1/2, 2/3, 3/4, 4/5, _ _ _ N/N+1
//fun main() {
//    println("Enter the value of N: ")
//    val n = readLine()?.toIntOrNull() ?: 1
//
//    for (i in 1..n) {
//        print("$i/${i+1}")
//        if (i != n) print(", ")
//    }
//}


//58. Print series 1 + 4 – 9 + 16 – 25 + 36 + _ _ _ + N2
//fun main() {
//    println("Enter the value of N: ")
//    val n = readLine()?.toIntOrNull() ?: 1
//
//    for (i in 1..n) {
//        val square = i * i
//        if (i % 2 == 0) {
//            print("-$square")
//        } else {
//            print("+$square")
//        }
//        if (i != n) print(" ")
//    }
//}


//59. Print 0 1 1 2 3 5 8 13 21 34 55 (Fibonacci)
//fun main() {
//    println("Enter the number of terms: ")
//    val n = readLine()?.toIntOrNull() ?: 10
//    var first = 0
//    var second = 1
//
//    for (i in 1..n) {
//        print("$first ")
//        val next = first + second
//        first = second
//        second = next
//    }
//}


//60. Print factorial value of given number
//fun main() {
//    println("Enter a number: ")
//    val number = readLine()?.toIntOrNull() ?: 1
//    var factorial = 1L
//
//    for (i in 1..number) {
//        factorial *= i
//    }
//
//    println("Factorial of $number is $factorial")
//}


//61. Check whether the number is prime or not
//fun main() {
//    println("Enter a number: ")
//    val number = readLine()?.toIntOrNull() ?: 1
//    var isPrime = true
//
//    if (number <= 1) {
//        isPrime = false
//    } else {
//        for (i in 2..number / 2) {
//            if (number % i == 0) {
//                isPrime = false
//                break
//            }
//        }
//    }
//
//    if (isPrime) {
//        println("$number is a prime number")
//    } else {
//        println("$number is not a prime number")
//    }
//}


//62. Print prime number between given range
//fun main() {
//    println("Enter the start of the range: ")
//    val start = readLine()?.toIntOrNull() ?: 1
//    println("Enter the end of the range: ")
//    val end = readLine()?.toIntOrNull() ?: 10
//
//    for (number in start..end) {
//        var isPrime = true
//        if (number <= 1) {
//            isPrime = false
//        } else {
//            for (i in 2..number / 2) {
//                if (number % i == 0) {
//                    isPrime = false
//                    break
//                }
//            }
//        }
//        if (isPrime) {
//            print("$number ")
//        }
//    }
//}


//63. Write program that display square, cubes and factorials of all integer from 1 to 10
//fun main() {
//    for (i in 1..10) {
//        val square = i * i
//        val cube = i * i * i
//        var factorial = 1L
//        for (j in 1..i) {
//            factorial *= j
//        }
//        println("Number: $i, Square: $square, Cube: $cube, Factorial: $factorial")
//    }
//}


//64. Display sum of digit
//fun main() {
//    println("Enter a number: ")
//    val number = readLine()?.toIntOrNull() ?: 0
//    var sum = 0
//    var temp = number
//
//    while (temp != 0) {
//        sum += temp % 10
//        temp /= 10
//    }
//
//    println("Sum of digits: $sum")
//}


//65. Display reverse number
//fun main() {
//    println("Enter a number: ")
//    val number = readLine()?.toIntOrNull() ?: 0
//    var reverse = 0
//    var temp = number
//
//    while (temp != 0) {
//        val digit = temp % 10
//        reverse = reverse * 10 + digit
//        temp /= 10
//    }
//
//    println("Reverse number: $reverse")
//}


//66. Check entered number is Armstrong or not
//fun main() {
//    println("Enter a number: ")
//    val number = readLine()?.toIntOrNull() ?: 0
//    var temp = number
//    var sum = 0
//    val digits = number.toString().length
//
//    while (temp != 0) {
//        val digit = temp % 10
//        sum += Math.pow(digit.toDouble(), digits.toDouble()).toInt()
//        temp /= 10
//    }
//
//    if (sum == number) {
//        println("$number is an Armstrong number")
//    } else {
//        println("$number is not an Armstrong number")
//    }
//}


//67. Check entered number is palindrome or not
//fun main() {
//    println("Enter a number: ")
//    val number = readLine()?.toIntOrNull() ?: 0
//    var temp = number
//    var reverse = 0
//
//    while (temp != 0) {
//        val digit = temp % 10
//        reverse = reverse * 10 + digit
//        temp /= 10
//    }
//
//    if (number == reverse) {
//        println("$number is a palindrome")
//    } else {
//        println("$number is not a palindrome")
//    }
//}


//68. Count odd and even digits from given number
//fun main() {
//    println("Enter a number: ")
//    val number = readLine()?.toIntOrNull() ?: 0
//    var temp = number
//    var oddCount = 0
//    var evenCount = 0
//
//    while (temp != 0) {
//        val digit = temp % 10
//        if (digit % 2 == 0) {
//            evenCount++
//        } else {
//            oddCount++
//        }
//        temp /= 10
//    }
//
//    println("Odd digits: $oddCount")
//    println("Even digits: $evenCount")
//}


//69. Accept number and find how many zeros are there
//fun main() {
//    println("Enter a number: ")
//    val number = readLine()?.toIntOrNull() ?: 0
//    var temp = number
//    var zeroCount = 0
//
//    while (temp != 0) {
//        if (temp % 10 == 0) {
//            zeroCount++
//        }
//        temp /= 10
//    }
//
//    println("Number of zeros: $zeroCount")
//}


//70. Count digits of given number

//Pattern 1
//fun main() {
//    for (i in 1..5) {
//        for (j in 1..5) {
//            print("$j ")
//        }
//        println()
//    }
//}

//Pattern 2
//fun main() {
//    for (i in 1..5) {
//        for (j in 1..5) {
//            print("$i ")
//        }
//        println()
//    }
//}

//Pattern 3
//fun main() {
//    for (i in 1..5) {
//        for (j in 1..5) {
//            print("${i * j} ")
//        }
//        println()
//    }
//}

//Pattern 4
//fun main() {
//    for (i in 'A'..'E') {
//        for (j in 1..5) {
//            print("$i")
//        }
//        println()
//    }
//}

//Pattern 5
//fun main() {
//    for (i in 1..5) {
//        for (j in 1..5) {
//            if (j <= i) {
//                print("\$")
//            } else {
//                print("$j")
//            }
//        }
//        println()
//    }
//}

//Pattern 6
//fun main() {
//    for (i in 1..5) {
//        for (j in 1..5) {
//            if (j <= i) {
//                print(i)
//            } else {
//                print("$")
//            }
//        }
//        println()
//    }
//}

//Pattern 7
//fun main() {
//    for (i in 1..5) {
//        for (j in 0 until 5) {
//            if (j < i) {
//                print("X")
//            } else {
//                print("0")
//            }
//        }
//        println()
//    }
//}

//Pattern 8
//fun main() {
//    for (i in 1..5) {
//        for (j in 1..5) {
//            if (j == 1 || j == 5 || i == j) {
//                print("*")
//            } else {
//                print(" ")
//            }
//        }
//        println()
//    }
//}

//Pattern 9
//fun main() {
//    for (i in 1..5) {
//        for (j in 1..i) {
//            print("$i")
//        }
//        println()
//    }
//}

//Pattern 10
//fun main() {
//    for (i in 1..5) {
//        for (j in 1..i) {
//            print(j)
//        }
//        println()
//    }
//}

//Pattern 11
//fun main() {
//    for (i in 5 downTo 1) {
//        for (j in 5 downTo i) {
//            print(j)
//        }
//        println()
//    }
//}

//Pattern 12
//fun main() {
//    for (i in 1..5) {
//        for (j in 1..i) {
//            print(j)
//        }
//        println()
//    }
//}

//Pattern 13
//fun main() {
//    var num = 1
//    for (i in 1..4) {
//        for (j in 1..i) {
//            print("$num ")
//            num++
//        }
//        println()
//    }
//}

//Pattern 14
//fun main() {
//    for (i in 1..5) {
//        for (j in 0 until i) {
//            print(if (j % 2 == 0) 1 else 0)
//        }
//        println()
//    }
//}

//Pattern 15
//fun main() {
//    var ch = 'A'
//    for (i in 1..5) {
//        for (j in 1..i) {
//            print(ch++)
//        }
//        println()
//    }
//}

//Pattern 16
//fun main() {
//    for (i in 1..5) {
//        for (j in 1..5) {
//            if (i == j || j == 1 || j == 5) {
//                print("*")
//            } else {
//                print(" ")
//            }
//        }
//        println()
//    }
//}

