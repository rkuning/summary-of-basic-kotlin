package OOP

/**
 * Interface sangat mirip dengan abstract class, namun tanpa sebuah properti deklarasi
 * dan fungsi yang dideklarasikan tanpa isi. Tujuan dari interface ini hanya untuk
 * diimplementasikan oleh sebuah kelas. Kelas yang mengimplementasikan sebuah interface
 * diharuskan melakukan override seluruh properti dan fungsi sekaligus mendefinisikan
 * isi fungsi yang terdapat pada interfaces-nya.
 *
 * Pada umumnya penamaan sebuah interface dituliskan dengan awalan huruf I kapital.
 */

//penamaan interface
interface IFly {
    fun fly()

    val numberOfWings: Int

}

//implementasi intercae

//intinya untuk memakai interface, class turunan wajib overide semua hal yang ada pada interface
//override variabel numberOfWings
class Bird(override val numberOfWings: Int) : IFly {
//    wajib melakukan override function fly() yang ada pada interface
    override fun fly() {
    if(numberOfWings > 0) println("Flying with $numberOfWings wings")
    else println("I'm Flying without wings")
    }

}
