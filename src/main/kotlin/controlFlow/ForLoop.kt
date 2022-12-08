package controlFlow

fun main() {
//    val ranges = 1..5
//    val ranges = 1.rangeTo(5)
    val ranges = 1.rangeTo(10) step 3
    for (i in ranges ){
        println("value is $i!")
    }
    for ((index, value) in ranges.withIndex()) {
        println("value $value with index $index")
    }

    ranges.forEach { value ->
        println("value is $value!")
    }

    ranges.forEachIndexed { i, value ->
        println("value $value with index $i")
    }

    ranges.forEachIndexed { ind, _ ->
        println("index $ind")
    }
}