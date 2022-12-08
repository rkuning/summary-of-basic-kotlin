package functionalProgramming

var tambahh: (Int) -> Int = { value -> value + value }

fun main() {
    printResult(10 , tambahh)
    printResult(10){ value ->
        value + value
    }
    printResult(20, {a -> a*a})

//    anonymouse function dibawha ini ditampilkan dengan blok kode {}
    printResult(4,{a -> a * a })

}

fun printResult(value: Int, tambahh: (Int) -> Int) {
    val result = tambahh(value)
    println(result)
}
