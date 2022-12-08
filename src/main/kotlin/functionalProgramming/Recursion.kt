package functionalProgramming

/**
 * recursion
 * merupakan teknik untuk menyederhanakan pemecahan masalah yang umum diselesaikan dengan cara yang kompleks
 * atau bisa disebut, memecah masalah menjadi masalah masalah kecil agar mudah di selesaikan
 */

/**
 * tail call recursion
 * jika melakukan recursion biasa terlalu dalam akan terjadi stack overflow
 * tapi jika menggunakan tail call recursion, kita tidak boleh menggunakannya pada blok try-catch-finally
 */

//kodingan sebelum recursion
fun factorial(n:Int) : Int {
    return if (n == 1){
        n
    } else {
        var result = 1
        for (i in 1..n) {
            result *= i
        }
        result
    }
}

//dengan recursion
fun factorial2(n:Int):Int {
    return if (n == 1) {
        n
    } else {
        n * factorial2(n - 1)
    }
}

//dengan tail call recursion
tailrec fun factorial3(n:Int, result:Int) : Int {
    val newResult = n * result
    return if (n == 1) {
        newResult
    } else {
        factorial3(n-1, newResult)
    }
}

//tapi penggunaan recursion ini ada batas maksimalnya tergantung memory device
//bisa dibilang jika melakukan recursi terlalu dalam, akan terjadi stack overflow

fun main() {
    var result = 1
    for (i in 1..4) {
        result *= i
    }
    println(result)
    println(factorial(4))
    println(factorial2(3))
    println(factorial3(3,1))
}