package dataClassCollections

fun main() {
//    mirip object pada javascript

//    jakarta sbg key, indonesia sebagai value
    val capital = mapOf(
        "Jakarta" to "Indonesia",
        "London" to "England",
        "New Delhi" to "India"
    )
    println(capital)
    println(capital["Jakarta"])
    println(capital.getValue("Jakarta"))

    println(capital["Amsterdam"])

// Output: null

//    println(capital.getValue("Amsterdam"))
//menampilkan key pada object capital
    val mapKeys = capital.keys

// mapKeys: [Jakarta, London, New Delhi]
    println(mapKeys)

//    mengubah immutable map ke muttable map
//    fungsinya, agar data pada map bisa diubah. baik ditambah atau dihapus
    val mutableCapital = capital.toMutableMap()
    mutableCapital.put("Amsterdam", "Netherlands")
    mutableCapital.put("Berlin", "Germany")

println(mutableCapital)
}