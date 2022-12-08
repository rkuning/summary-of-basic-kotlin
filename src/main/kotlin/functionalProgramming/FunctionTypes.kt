package functionalProgramming

//typealias Arithmetic = (Int, Int) -> Int
//
//val sum: Arithmetic = { valueA, valueB -> valueA + valueB }

typealias Arithmetic = ((Int, Int) -> Int)?
val sum: Arithmetic = { valueA, valueB -> valueA + valueB }

val multiply: Arithmetic = { valueA, valueB -> valueA * valueB }

typealias angka = ((Int, Int) -> Int)

val bagi: angka = {angka1, angka2 -> angka1 / angka2}

fun main() {
    val sumResult = sum?.invoke(10, 10)
    val multiplyResult = multiply?.invoke(20, 20)
//    val aritmat = Arithmetic.invoke(1,4)

    val jumlah = tambah(4,5)

    println(bagi(4,2))

    println(sumResult)
    println(multiplyResult)

}

val tambah = {a:Int,b:Int -> a * b}