package controlFlow

fun main() {
    val openOffice = 7
    val now = 8
//    if dibawah disebut statement, karena tidak mengembalikan niali, hanya sebagai percabangan kotlin
    if (now==9) {
        println("salah")
    } else {
        println("benar")
    }
//    if dibawah disebut expression, karena mengembalikan nilai yang akan dimasukkan ke variabel office
    val office = if (now > openOffice) "Office already open" else "Office close"
    print(office)

    val hasil = sum(1, sum(1,4))
    println(hasil)

    val value1 = 10
    val value2 = 10

    sum(value1, value2)
}



fun sum(value1: Int, value2: Int) = value1 + value2