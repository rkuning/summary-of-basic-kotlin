package OOP

class Hewann(pName : String, pWeight : Double, pAge : Int, pIsMammal : Boolean){
    val name : String
    val weight : Double
    val age : Int
    val isMammal : Boolean

    init {
        weight = if(pWeight<0) 0.1 else pWeight
        age = if (pAge < 0) 0 else pAge
        name = pName
        isMammal = pIsMammal
    }
}

fun main() {
    val cat = Hewann("kucing",4.4,2, true)
    print("${cat.name}, ${cat.weight}, ${cat.age}, ${cat.isMammal}")
}

//jika penamaan properti pada class & variabel sama, maka begini solusinya

class Hewann2(name : String, weight : Double, age : Int, isMammal : Boolean){
    val name : String
    val weight : Double
    val age : Int
    val isMammal : Boolean

    init {
        this.weight = if(weight<0) 0.1 else weight
        this.age = if (age < 0) 0 else age
        this.name = name
        this.isMammal = isMammal
    }
}