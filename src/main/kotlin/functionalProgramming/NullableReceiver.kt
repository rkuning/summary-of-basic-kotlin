package functionalProgramming

//nullable receiver, atau nilai bisa null
val Int?.slice: Int
    get() = if (this == null) 0 else this.div(2)

//cara deklarasi ke2
val Int?.slice2: Int
    get() = this?.div(2) ?: 0


fun main() {
    val value: Int? = 43
    val value2 : Int? = null

    println(45.slice)
    println(null.slice2)
}
