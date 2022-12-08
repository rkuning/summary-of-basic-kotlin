package controlFlow

import kotlin.random.Random


fun main() {
    val value = 9
    val value2 = 7

    when(value){
        6 -> println("value is 6")
        7 -> {
            println("value is 7")
        }
        8 -> {
            println("value is 8")
        }
        else -> println("value cannot be reached")
    }

    val stringOfValue = when (value2) {
        6 -> {
            println("Six")
            "value is 6"
        }
        7 -> {
            println("Seven")
            "value is 7"
        }
        8 -> {
            println("Eight")
            "value is 8"
        }
        else -> {
            println("undefined")
            "value cannot be reached"
        }
    }

    println(stringOfValue)

//    is untuk mengcheck tipe data
    val anyType : Any = 10238
    when(anyType){
        is Long -> println("the value has a Long type")
        is String -> println("the value has a String type")
        else -> println("undefined")
    }

    val value3 =  70
    val ranges = 10..50

//    in untuk memeriksa nilai pada suatu range
    when(value3){
        in ranges -> println("value is in the range")
        !in ranges -> println("value is outside the range")
        else -> println("value undefined")
    }

    val registerNumber = when(val regis = getRegisterNumber()){
        in 1..50 -> 50 * regis
        in 51..100 -> 100 * regis
        else -> regis
    }

    println(registerNumber)

}

fun getRegisterNumber() = Random.nextInt(100)