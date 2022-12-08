package OOP

class Animal2 {
    var name : String = "Dicoding Miaw"

//    modifikasi override pada fungsi getter setter
    get() {
        println("fungsi getter terpanggil")
        return field
    }
    set(value) {
        println("fungsi setter terpanggil")
        field = value
    }
}

fun main() {
    val dicodingCat = Animal2()
    println(dicodingCat.name)
    dicodingCat.name = "meong"
    println(dicodingCat.name)
}