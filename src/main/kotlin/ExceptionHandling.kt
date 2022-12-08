/*
try catch
Salah satu cara untuk menangani suatu exception adalah menggunakan try-catch.
Kode yang dapat membangkitkan suatu exception disimpan dalam blok try,
dan jika exception tersebut terjadi, maka blok catch akan terpanggil.
Berikut cara penulisan try-catch pada Kotlin:

try {
    // Block try, menyimpan kode yang membangkitkan exception
} catch (e: SomeException) {
    // Block catch akan terpanggil ketika exception bangkit.
}

Dengan menuliskan kode dalam blok try, kode kita menjadi terproteksi dari exception.
Jika terjadi exception maka program tidak akan terhenti atau crash, namun akan dilempar
menuju blok catch.  Di sana kita dapat menuliskan sebuah kode alternatif untuk menampilkan
pesan eror atau yang lainnya.

 */

/*
Multiple Catch
Dari kode yang kita coba sebelumnya, kita menggunakan exception untuk menangani semua
tipe exception yang terjadi. Baik itu ketika terjadi NullPointerException atau
NumberFormatException. Sebenarnya pada catch kita dapat secara spesifik memilih tipe
exception apa yang ingin ditangani. Multiple catch memungkinkan untuk penanganan exception
dapat ditangani lebih dari satu tipe exception. Hal ini sangat berguna ketika kita ingin
menangani setiap tipe exception dengan perlakuan yang berbeda. Berikut contoh struktur kode
dengan menerapkan multiple catch:

try{
    // Block try, menyimpan kode yang membangkitkan exception
} catch (e: NullPointerException) {
    // Block catch akan terpanggil ketika terjadi NullPointerException.
} catch (e: NumberFormatException) {
    // Block catch akan terpanggil ketika terjadi NumberFormatException.
} catch (e: Exception) {
    // Block catch akan terpanggil ketika terjadi Exception selain keduanya.
}
finally {
    // Block finally akan terpanggil setelah keluar dari block try atau catch
}

 */

fun main() {
    val someNullValue: String? = null
    lateinit var someMustNotNullValue: String

//    try catch
    try {
        someMustNotNullValue = someNullValue!!
        println(someMustNotNullValue)
    } catch (e:Exception) {
        someMustNotNullValue = "Nilai String Null"
        println(someMustNotNullValue)
    }

//    try catch finally
    try {
        someMustNotNullValue = someNullValue!!
    } catch (e: Exception) {
        someMustNotNullValue = "Nilai String Null Finnaly"
    } finally {
        println(someMustNotNullValue)
    }

//    multi catch
    val someStringValue: String? = "anjay"
    var someIntValue: Int = 0

    try {
        someIntValue = someStringValue!!.toInt()
    } catch (e: NullPointerException) {
        someIntValue = 0
    } catch (e: NumberFormatException) {
        someIntValue = -1
    } finally {
        when(someIntValue){
            0 -> println("Catch block NullPointerException terpanggil !")
            -1 -> println("Catch block NumberFormatException terpanggil !")
            else -> println(someIntValue)
        }
    }
}