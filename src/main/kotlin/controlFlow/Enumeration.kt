package controlFlow

fun main() {
    val colorRed = Color.RED
    val colorGreen = Color.GREEN
    val colorBlue = Color.BLUE

    val merah : Warna = Warna.Red
    val hijau : Warna = Warna.Green
    val biru : Warna = Warna.Blue


    println(colorRed)
    println(colorGreen)
    println(colorBlue)
    println(merah)
    println(hijau)
    println(biru)


    val wMerah : Color1 = Color1.RED
    val wHijau : Color1 = Color1.GREEN
    val wBiru : Color1 = Color1.BLUE

    Color1.RED.printValue()
    Color1.GREEN.printValue()
    Color1.BLUE.printValue()


    val colors: Array<Color2> = Color2.values()
    colors.forEach { color ->
        print("$color ")
    }

    println()

//    untuk mendapatkan daftar object dalam enum, pakai values() bentuknya array
    val warnas : Array<Color2> = Color2.values()
    warnas.forEach { warna -> print("$warna ") }


//    untuk mendapatkan satu nilai dari object enum, bisa pakai valueOf();

//jika valueOf dibawah isinya tidak sama dengan data yang ada di object enum, maka terjadi illegal argument exception
//    illegal argument exception adalah sebuah kondisi dimana saat ingin menggunakan sebuah fungsi, kita menyematkan argumen yang ridak sesauai dengan fungsi tersebut.
//valueof bentuknya sudah string
    val warnaMerah : Color2 = Color2.valueOf("RED")
    println("warna adalah $warnaMerah")
    println("Nilai value dari $warnaMerah adalah ${warnaMerah.value.toString(16)}")


//    selain cara diatas, untuk mendapatkan value, adalagi caranya. yaitu pakai enumValues() dan enumValueOf()
    val warna1 : Array<Color2> = enumValues()
//    atau
    val warnas2 = enumValues<Color2>()
    warnas2.forEach { warna2 -> print("$warna2 ") }

    val warnaHijau : Color2 = enumValueOf("GREEN")
//    atau
    val warnaHijau2 = enumValueOf<Color2>("GREEN")

    println(warnaHijau)


//    mendapatkan nilai posisi array/nilai index pada enum, pakai method .ordinal
    println(warnaHijau.ordinal)

    val iniWarna : Color2 = Color2.GREEN

    when(iniWarna) {
        Color2.RED -> println("Merah")
        Color2.GREEN -> {
            println("Hijau")
        }
        Color2.BLUE -> println("Biru")

    }
}


enum class Color(val value: Int) {
    RED(0xFF0000),
    GREEN(0x00FF00),
    BLUE(0x0000FF)

}

enum class Warna {
    Red, Green, Blue
}

enum class Color1(val value: Int) {
    RED(0xFF0000){
        override fun printValue() {
            println("value of RED is $value")
        }
    },
    GREEN(0x00FF00){
        override fun printValue() {
            println("value of GREEN is $value")
        }
    },
    BLUE(0x0000FF){
        override fun printValue() {
            println("value of BLUE is $value")
        }
    };

    abstract fun printValue()
}

enum class Color2(val value: Int) {
    RED(0xFF0000),
    GREEN(0x00FF00),
    BLUE(0x0000FF)
}