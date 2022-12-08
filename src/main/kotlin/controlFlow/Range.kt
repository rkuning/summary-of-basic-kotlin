package controlFlow

fun main() {
//    cara 1 : step maksudnya nilai kenaikan angkanya. misal step 2, berarti nilai selanjutnya
//    adalah nilai sebelunya ditambah 2
    val rangeInt = 1..10 step 2
//    print(rangeInt.step)
    rangeInt.forEach {
        print("$it ")
    }
    println()
    println(rangeInt.step)
//  cara 2
    val rangeInt2 = 1.rangeTo(10)
//    cara 3
    val downInt = 10.downTo(1)

    val tenToOne = 10.downTo(1)
    if (7 in tenToOne) {
        println("Value 7 available")
    }

    if (11 !in tenToOne) {
        println("No value 11 in Range ")
    }

    val rangeChar = 'A'.rangeTo('F')
    rangeChar.forEach {
        print(it)
    }
}