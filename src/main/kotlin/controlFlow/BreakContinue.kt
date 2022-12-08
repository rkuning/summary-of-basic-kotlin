package controlFlow

fun main() {
    val listOfInt = listOf(1, 2, 3, null, 5, null, 7)
    for (i in listOfInt) {
        if (i == null) continue
        print(i)
    }

    println()

    for (i in listOfInt) {
        if (i == null) break
        print(i)
    }

    println()

    loop@ for (i in 1..10) {
        println("Outside Loop")

       loop2@ for (j in 1..10) {
            println("Inside Loop $j")
            if ( j > 5) break@loop
        }
    }

}