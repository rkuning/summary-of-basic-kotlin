fun main() {
//    maksimal 2 milyar
    val intNumber = 100

//    lebih dari 2 milyar
    val longNumber: Long = 100
    val longNumber2 = 100L

//    kurang dari 200
    val shortNumber: Short = 10

//    membaca nilai biner
    val byteNumber = 0b11010010

//    15-16 angka dibelakang koma
    val doubleNumber: Double = 1.3

//    6-7 angka dibelakang koma
    val floatNumber: Float = 0.123456789f //yang terbaca hanya 0.1234567

    val maxInt = Int.MAX_VALUE
    val minInt = Int.MIN_VALUE

    val maxLong = Long.MAX_VALUE

    println(maxInt)
    println(minInt)
    println(maxLong)

    /*
     output :
            2147483647
            -2147483648
     */

    //konversi bilangan

//    toByte(): Byte
//
//    toShort(): Short
//
//    toInt(): Int
//
//    toLong(): Long
//
//    toFloat(): Float
//
//    toDouble(): Double
//
//    toChar(): Char

    val stringNumber = "23"
    val intNumber3 = 3

    println(intNumber3 + stringNumber.toInt())

    val readableNumber = 1_000_000
    print(readableNumber)



}