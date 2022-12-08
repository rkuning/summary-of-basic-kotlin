package OOP

class Anim (name : String, weight: Double, age:Int){
    val name : String
    val weight : Double
    val age : Int
    var isMammal : Boolean

    init {
        this.weight = if (weight < 0) 0.1 else weight
        this.age = if (age < 0) 0 else age
        this.name = name
        this.isMammal = false
    }

    constructor(name:String, weight: Double, age: Int, isMammal : Boolean) : this(name, weight, age) {
        this.isMammal = isMammal
    }
}

fun main () {
    val anim = Anim("kucing",2.2,2,true)
    println("${anim.name}, ${anim.weight}, ${anim.age}, ${anim.isMammal}")
    val dicAnim = Anim("anj",4.4,1)
    println("${dicAnim.name}, ${dicAnim.weight}, ${dicAnim.age}, ${dicAnim.isMammal}")

//    default constructor
    val dicodingCat = Anime()
    println("Nama: ${dicodingCat.name}, Berat: ${dicodingCat.weight}, Umur: ${dicodingCat.age}, mamalia: ${dicodingCat.isMammal}" )
}

//default constructor

class Anime{
    val name: String = "Dicoding Miaw"
    val weight: Double = 4.2
    val age: Int = 2
    val isMammal: Boolean = true

}
