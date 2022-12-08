package functionalProgramming

//lambda / anonymous function

val count : (Int, Int) -> Int = {valueA, valueB -> valueA + valueB}

val count1 : (Int, Int) -> Int = ::count2

fun count2(valueA:Int, valueB:Int) : Int {
    return valueA + valueB
}

//function references

fun isEvenNumber (number:Int) = number % 2 == 0
fun Int.isEvenNumber2() = this % 2 == 0

fun main() {
    val numbers = 1.rangeTo(10)
    val evenNumbers = numbers.filter(::isEvenNumber)
    println(evenNumbers)
//    mereferensikan exrension function
    val evenNumbers2 = numbers.filter(Int::isEvenNumber2)
    println(evenNumbers2)

    val data = 1.rangeTo(20).filter(Int::isEvenNumber2)
    println(data)
//    property references
//    muttable
    println(::msg.name)
    println(::msg.get())

    ::msg.set("kotlin academy")

    println(::msg.get())

//    immutable

    println(::msg2.name)
    println(::msg2.get())

//    ::msg2.set("kotlin academy")  //akan error, karena tipe variabel immutable tidak bisa di deklarasikan ulang

    println(::msg2.get())

}

//properti references
//muttable (bisa setter dan getter)
var msg = "kotlin"

//immutable (hanya bisa getter)
val msg2 = "kotlin"