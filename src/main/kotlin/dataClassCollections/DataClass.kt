package dataClassCollections

fun main() {
    val user = User("nrohmen", 17)
    val dataUser = DataUser("nrohmen", 17)
    val dataUser2 = DataUser("nrohmen", 17)
    val dataUser3 = DataUser("dimas", 24)

    println(dataUser.equals(dataUser2))
    println(dataUser.equals(dataUser3))

    val user2 = User("nrohmen", 17)
    val user3 = User("dimas", 24)

    println(user.equals(user2))
    println(user.equals(user3))

//    menyalin data user
    val dataUser4 = dataUser3.copy()

//    menyalin dan mengubah data user
    val dataUser5 = dataUser.copy(age = 18)

    println(dataUser4)
    println(dataUser5)


//  destrukturing
    val (name, age) = DataUser("danang",17)
    println("My name is $name, I am $age years old")

    dataUser.intro()
}

//class User(val name : String, val age : Int)

class User(val name : String, val age : Int){

//    override fun equals(other: Any?): Boolean {
//        if (this === other) return true
//        if (javaClass != other?.javaClass) return false
//
//        other as User
//
//        if (name != other.name) return false
//        if (age != other.age) return false
//
//        return true
//    }

    override fun equals(other: Any?) : Boolean {
        if (this === other) return true
        if(javaClass != other?.javaClass) return false

        other as User

        if (name != other.name) return false
        if (age != other.age) return false

        return true
    }

//    override fun hashCode(): Int {
//        var result = name.hashCode()
//        result = 31 * result + age
//        return result
//    }

    override fun hashCode() : Int {
        var result = name.hashCode()
        result = 31 * result + age
        return result
    }
}

data class DataUser(val name : String, val age : Int){
    fun intro(){
        println("My name is $name, I am $age years old")
    }
}