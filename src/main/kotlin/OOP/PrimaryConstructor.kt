package OOP

//membuat nilai default age dan ismamal, shg deklarasi di main function bersifat optional
class Hewan2(var name:String, var weight:Double, var age:Int = 0, var isMammal:Boolean = true)

fun main () {
    val dicodingCat = Hewan2("kucing",32.2)
    print("${dicodingCat.name}, ${dicodingCat.weight}, ${dicodingCat.age}, ${dicodingCat.isMammal}")
}