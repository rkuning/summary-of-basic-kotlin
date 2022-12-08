package functionalProgramming

import kotlin.IllegalArgumentException

fun setWord(msg:String){
    fun printMessage(text:String){
        println(text)
    }
    printMessage(msg)

//    cara 2
    fun printMsg() {
        println(msg)
    }
    printMsg()
}

fun main() {
    setWord("Danang sudah makan?")
}

//penerapan
//kode awal seperti dibawh terdapat pengulangan kode yang tidak perlu. bisa di sederhanakan
fun sum (valueA:Int, valueB : Int, valueC : Int) : Int {
    if (valueA == 0) {
        throw IllegalArgumentException("Value A must be gretter than 0")
    }
    if (valueB == 0) {
        throw IllegalArgumentException("Value B must be gretter than 0")

    }
    if (valueC == 0) {
        throw IllegalArgumentException("Value B must be gretter than 0")

    }
    return valueA + valueB + valueC
}

//penyederhanaannya sebagai berikut
//cara 1, pakai function biasa
fun sum2(value1 : Int, value2:Int, value3:Int) : Int {
    fun checkNol(value : Int) {
        if(value == 0) {
            throw IllegalArgumentException("Value must be gretter than 0")
        }
    }
    checkNol(value1)
    checkNol(value2)
    checkNol(value3)
    return value1 + value2 + value3
}

//cara2, pakai extension function
fun sum3(value1:Int, value2:Int, value3:Int) : Int {
    fun Int.validateNumber(){
        if(this == 0) {
            throw java.lang.IllegalArgumentException("Value must be gretter than 0")
        }
    }

    value1.validateNumber()
    value2.validateNumber()
    value3.validateNumber()

    return value1 + value2 + value3
}