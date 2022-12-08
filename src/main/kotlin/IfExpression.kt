fun ifExpression (openHours : Int, now : Int) {
    val office: String

//    cara 1
    if (now > openHours) {
        office = "Office already open"
    } else {
        office = "Office is closed"
    }

    val office2: String
    office2 = if (now > 10) {
        "Office already open"
    } else if (now == openHours){
        "Wait a minute, office will be open"
    } else {
        "Office is closed"
    }



    println(office)
    println(office2)
}

fun main () {
    ifExpression(8, 8)
    konjungsi()
    disjungsi()
    not()
}

//untuk mendapatkan nilai benar, semua parameter harus bernilai benar
fun konjungsi () {
    val officeOpen = 7
    val officeClosed = 16
    val now = 20

    val isOpen = if (now >= officeOpen && now <= officeClosed){
        true
    } else {
        false
    }

    val isOpen2 = now >= officeOpen && now <= officeClosed

    println("Office is open : $isOpen")
    println("Office is open : $isOpen2")
    /*
        Output : Office is open : false
     */
}

//jika salah satu benar, maka hasil benar
fun disjungsi () {
    val officeOpen = 7
    val officeClosed = 16
    val now = 20

    val isClose = now < officeOpen || now > officeClosed

    println("Office is closed : $isClose")
    /*
        Output : Office is closed : true
     */
}

//kebalikan / negasi. jika benar, maka output salah. begitupyla sebaliknya
fun not () {
    val officeOpen = 7
    val now = 10
    val isOpen = now > officeOpen

//    if (!isOpen) {
//        println("Office is closed")
//    } else {
//        println("Office is open")
//    }

    if (!isOpen) println("Office is closed") else println("Office is open")
    /*
        Output : Office is open
     */
}