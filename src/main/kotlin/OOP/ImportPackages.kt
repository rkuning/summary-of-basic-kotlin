package OOP

/**
 * Import dan Packages
Seluruh konten pada Kotlin, seperti kelas dan fungsi, dibungkus dalam sebuah package.
Package tersebut digunakan untuk mengelompokkan kelas, fungsi dan variabel yang mempunyai
kemiripan fungsionalitas. Untuk menggunakan kelas, fungsi maupun variabel yang berada
pada suatu package, kita harus menuliskan secara lengkap alamat package tersebut.
Sebagai contoh kita akan menggunakan kelas Random, maka kita harus menuliskan seperti ini:

val someInt = kotlin.random.Random(0).nextInt(1, 10)

Kode tersebut menunjukkan bahwa kelas Random berada pada package kotlin.random,
tetapi apakah perlu menuliskan kode sepanjang itu untuk menggunakan sebuah kelas?
Tentu tidak, untuk meminimalisir hal tersebut kita cukup mengimpor package kelas Random.
 */

//Importing Package

/**
import packagename.ClassName
import packagename.functionName
import packagename.propertyName
 */

import kotlin.random.Random


import kotlin.math.PI
import kotlin.math.cos
import kotlin.math.sqrt

//cara 2 : pakai alias
import kotlin.math.cos as cosinus
import kotlin.math.sqrt as akar

//arti kode dibawah ini adalah import semua function & variabel yang ada pada kotlin.math
import kotlin.math.*

val someInt = Random(0).nextInt(1, 10)

fun main(){
    println(PI)
    println(cos(120.0))
    println(sqrt(9.0))
    println(cosinus(120.0))
    println(akar(9.0))

}

