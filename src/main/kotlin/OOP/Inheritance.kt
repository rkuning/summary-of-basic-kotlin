package OOP

open class Hewani(val name: String, val weight: Double, val age: Int, val isCarnivore: Boolean){

    open fun eat(){
        println("$name sedang makan!")
    }

    open fun sleep(){
        println("$name sedang tidur!")
    }
}

//deklarasi extend, yakni class Meong extend dari Hewani
class Meong(pName: String, pWeight: Double, pAge: Int, pIsCarnivore: Boolean, val furColor: String, val numberOfFeet: Int)
    : Hewani(pName, pWeight, pAge, pIsCarnivore) {

    fun playWithHuman() {
        println("$name bermain bersama Manusia !")
    }

    override fun eat(){
        println("$name sedang memakan ikan !")
    }

    override fun sleep() {
        println("$name sedang tidur di bantal !")
    }
}

class Fish(pName: String, pWeight: Double, pAge: Int, pIsCarnivore: Boolean, val scaleColor: String, val numberOfFin: Int)
    : Hewani(pName, pWeight, pAge, pIsCarnivore) {

    fun swim() {
        println("$name berrenang !")
    }

    override fun eat(){
        println("$name sedang memakan pallet !")
    }

    override fun sleep() {
        println("$name sedang tidur di air !")
    }
}

class Snake(pName: String, pWeight: Double, pAge: Int, pIsCarnivore: Boolean, val skinColor: String, val isToxic: Int)
    : Hewani(pName, pWeight, pAge, pIsCarnivore) {

    fun bite() {
        println("$name menggigit !")
    }

    override fun eat(){
        println("$name sedang memakan ayam !")
    }

    override fun sleep() {
        println("$name sedang tidur di pohon !")
    }
}

fun main() {
    val dicodingCat = Meong("Dicoding Miaw", 3.2, 2, true, "Brown", 4)

    dicodingCat.playWithHuman()
    dicodingCat.eat()
    dicodingCat.sleep()

}