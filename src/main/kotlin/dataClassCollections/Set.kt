package dataClassCollections

fun main() {
    val integerSet = setOf(1, 2, 4, 2, 1, 5)
    println(integerSet)
    val setA = setOf(1, 2, 4, 2, 1, 5)
    val setB = setOf(1, 2, 4, 5)
    println(setA == setB)
    println(5 in setA)

    val setC = setOf(1, 5, 7)

//    val primaryKey = setOf(1,34,5,33,6,45,4,3,23,4,25)
//    gabungan set a dan set c
    val union = setA.union(setC)

//    irisan set a dan set c
//    irisan adalah data yang sama di dua data. yaitu 1,5. 1,5 sama sama ada pada 2 data tsb
    val intersect = setA.intersect(setC)

    println(union)
    println(intersect)

//    pada mutable set, bisa menambah dan menghapus set. tapi tidak bisa mengubah isi dari set
    val mutableSet = mutableSetOf(1, 2, 4, 2, 1, 5)
//mutableSet[2] = 6 // tidak bisa mengubah set immutable
    mutableSet.add(6) // menambah item di akhir set
    mutableSet.remove(1) //menghapus item yang memiliki nilai 1
    println(mutableSet)
}