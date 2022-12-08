package OOP

/**
 * abstract class : fungsinya adalah agar class parrent tidak bisa di deklarasikan menjadi
 * sebuah object secara langsung. tapi dia hanya bisa menurunkan sifatnya ke anak anaknya
 * contoh seperti mobil, dia tidak bisa di wujudkan dalam bentuk object secara langsung.
 * tapi berbeda dengan anak mobil, misal seperti SUV, Sedan, Trail dll. dia bisa diwujudkan
 * kedalam suatu object
 */

abstract class Animmal(var name: String, var weight: Double, var age: Int, var isCarnivore: Boolean){

    fun eat(){
        println("$name sedang makan !")
    }

    fun sleep(){
        println("$name sedang tidur !")
    }
}

fun main(){
//    val animal = Animmal("dicoding animal", 2.6, 1, true) //akan error, karena bentuk animmal adalah abstrak
}
