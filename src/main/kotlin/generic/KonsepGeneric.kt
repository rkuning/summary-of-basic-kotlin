package generic

/*
generic merupakan konsep yang digunakan untuk menentukan tipe data yang akan kita gunakan.
Pendeklarasiannya ditandai dengan tipe parameter. Kita juga bisa mengganti tipe parameter menjadi
tipe yang lebih spesifik dengan menentukan instance dari tipe tersebut.

 */
//kode awal, deklarasi variabel secara lengkap
val contributor = listOf<String>("jasoet", "alfian","nrohmen","dimas","widy")

//kode baru, cukup deklaarsi tanpa string, compiler sudh otomatis mendeteksi tipe data
val contributor1 = listOf("alfian","nrohmen","dimas","widy")

//akan tetapi jika ingin membuat list tapi isi variabelnya belakangan, maka wajib deikarasi tipe data
val contributor2 = listOf<String>()

//deklarasi tipe parameter juga bisa lebih dari 1, contoh key value pada map
val points = mapOf<String, Int>( "alfian" to 10 , "dimas" to 20 )

//mendeklarasikan kelas generic

//interface List<T>{
//    operator fun get(index : Int) : T
//}

//tipe parameter bisa diganti sesuka hari, misal dari T menjadi P
interface List<P> {
    operator fun get(index: Int): P
}

//mengambil kelas generic dari interface list di isikan ke class LongList
class LongList : List<Long>{
    override fun get(index: Int): Long {
        return this [index]
    }
}

fun main() {
    val longArrayList = ArrayList<Long>()
    val firstLong = longArrayList.get(0)
    print(firstLong)
}

class ArrayList<T> : List<T> {
    override fun get(index: Int): T {
        return this[index]
    }
}
