package OOP

class Hewan(var name:String, var weight:Double, var age:Int, var isMammal:Boolean)

val Hewan.getAnimalInfo : String
get() = "Nama : ${this.name}, berat : ${this.weight}, umur : ${this.age}, mamalia : ${this.isMammal}"

fun main () {
    val dicodingCat = Hewan("kucing",32.2,2,true)
    print(dicodingCat.getAnimalInfo)
}