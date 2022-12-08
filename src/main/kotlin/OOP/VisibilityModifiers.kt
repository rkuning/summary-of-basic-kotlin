package OOP


//private : hanya dapat dipanggil pada class tersebut
class Animal1(private var name: String, private val weight: Double, private val age: Int, private val isMammal: Boolean = true) {

    fun getName() : String {
        return name
    }

    fun setName(newName: String) {
        name = newName
    }

}

fun main() {
//    private
    val dicodingCat = Animal1("Dicoding Miaw", 2.5, 2)
//    println(dicodingCat.name) akan error, karena name bersifat private
    println(dicodingCat.getName())
    dicodingCat.setName("Gooose")
    println(dicodingCat.getName())

//  protected
    val cat = Cat("Dicoding Miaw", 2.0)
    println("Nama Kucing: ${cat.name}")
//    println("Berat Kucing: ${cat.weight}") //Cannot access 'weight': it is protected in 'Cat'
    val an = Anima2("ayam")
    println(an.name)
}

//protected
open class Anima(val name: String, protected val weight: Double)

class Cat(pName: String, pWeight: Double) : Anima(pName, pWeight)

//internal : hanya bisa diakses di satu modul yang sama
internal class Anima2(val name: String)
