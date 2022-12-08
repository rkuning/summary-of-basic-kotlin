package functionalProgramming

//menyederhanakan tipe data yang sama pada semua parameter
fun sumNumbers(vararg number: Int): Int {
    return number.sum()
}

fun main() {
    val number = sumNumbers(1,2,4,5234,3)
    println(number)
    /*
   output : 100
    */

    val number2 = getNumberSize(10, 20, 30, 40, 50)
    println(number2)

    val hasil = sets("Kotlin", 10, 10)
    println(hasil)

    val hasil2 = sets2(10, 10, name = "Kotlin")
    println(hasil2)

//    jika memakai function dengan parameter array, maka data harus di deklarasikan terlebih dahulu dan disimpan pada variabel
    val numberArr = arrayOf(10, 20, 30, 40)
    var printArray = setArrays(numberArr)
    println(printArray)

//    tapi jika pakai vararg, maka deklarasi bisa langsung pada functionnya
    val number5 = intArrayOf(10, 20, 30, 40)
    val printSet = sets("danang", 20, 20, *number5 , 10)
//    tanda bintang diatas artinya spread operator, mirip di js dengan pakai (...)
    println(printSet)

}


fun <T> asList(vararg input: T): List<T> {
    val result = ArrayList<T>()
    for (item in input)
        result.add(item)
    return result
}

fun getNumberSize(vararg number: Int): Int {
    return number.size
}

//jika posisi vararg di belakang, pemanggilan parameter didepan tidak perlu memakai cara named
fun sets(name: String, vararg number: Int): String {
    return "$name : ${number.sum()}"
}

//tapi jika posisi vararg didepan, pemanggilan name harus dengan named argument
fun sets2(vararg number: Int, name: String): String = "$name : ${number.sum()}"

//memakai parameter Array
fun setArrays(number: Array<Int>): String = "${number.sum()}"
