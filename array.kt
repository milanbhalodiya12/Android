import java.lang.annotation.ElementType

fun main()
{
     var array1=Array(5){0}
     var array2 = arrayOf(10,20,30,40)
     var array3 = arrayOf<Int>(10,20,30,40)
     var array4 = arrayOf("atmiya","sem-3","student",10,20)
     var array5 = arrayOf(10,"student",20)
      println(array1[3])
      println(array2[2])
      println(array3[2])
      println(array4[2])
     println(array5[2])

    for(i in array5)
    {
        print(i)
    }

}
