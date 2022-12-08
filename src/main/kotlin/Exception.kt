/*
Exception adalah event (kejadian) yang dapat mengacaukan jalannya suatu program.
Pada Kotlin semua exception bersifat Unchecked, yang artinya exception terjadi
karena kesalahan pada kode kita. Berikut ini beberapa contoh Unchecked Exception
yang sering mengganggu jalannya program kita:

ArithmeticException

NumberFormatException

NullPointerException

ArithmeticException merupakan exception yang terjadi karena kita membagi suatu bilangan
dengan nilai nol. Berikut merupakan contoh kode yang dapat membangkitkan ArithmeticException.


 */

fun main() {
    val someValue = 6
    println(someValue / 0)

/*
output:
    Exception in thread "main" java.lang.ArithmeticException: / by zero
*/

    val someStringValue = "18.0"
    println(someStringValue.toInt())

/*
output:
    Exception in thread "main" java.lang.NumberFormatException: For input string: "18.0"
*/

    val someNullValue: String? = null
    val someMustNotNullValue: String = someNullValue!!
    println(someMustNotNullValue)

/*
output:
    Exception in thread "main" kotlin.NullPointerException at MainKt.main(Main.kt:3)
*/

}

