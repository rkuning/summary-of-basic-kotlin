fun setUser(name: String, age: Int): String {
    return "Your name is $name, and you $age years old"
}

fun setUser2(name: String, age: Int): String = "Your name is $name, and you $age years old"

//pakai ini aja, simple
fun setUser3(name: String, age: Int) = "Your name is $name, and you $age years old"

fun main() {
    println(setUser("danang",18))
    println(setUser2("ipul",18))
    println(setUser3("basrin",18))
    printUser("wahyu")
    printUser2("Saebu")

}

fun printUser(name: String):Unit {
    println("Your name is $name")
}
fun printUser2(name: String) {
    println("Your name is $name")
}
