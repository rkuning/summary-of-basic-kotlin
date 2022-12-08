package OOP

import kotlin.reflect.KProperty

class Delegationname {
    private var value : String = "Default"

    operator fun getValue(classRef : Any?, property: KProperty<*>) : String {
        println("fungsi ini sama seperti getter untuk properti ${property.name} pada class $classRef")
        return value
    }

    operator  fun setValue(classRef: Any?, property: KProperty<*>, newValue : String){
        println("fungsi ini sama seperti setter untuk properti ${property.name} pada class $classRef")
        println("nilai ${property.name} dari : $value akan berubah menjadi $newValue")
        value = newValue
    }
}


class DelegationGenericClass {
    private var value : Any = "Default"

    operator fun getValue(classRef : Any?, property: KProperty<*>) : Any {
        println("fungsi ini sama seperti getter untuk properti ${property.name} pada class $classRef")
        return value
    }

    operator  fun setValue(classRef: Any?, property: KProperty<*>, newValue : Any){
        println("fungsi ini sama seperti setter untuk properti ${property.name} pada class $classRef")
        println("nilai ${property.name} dari : $value akan berubah menjadi $newValue")
        value = newValue
    }
}

class Animal3 {
    var name : String by Delegationname()
}

class Animal4 {
    var name : Any by DelegationGenericClass()
    var weight : Any by DelegationGenericClass()
    var age : Any by DelegationGenericClass()
}

class Person {
    var name : String by Delegationname()
}

class Hero {
    var name : String by Delegationname()
}

fun main() {
    val animal = Animal3()
    animal.name = "dicoding kucing"
    println(animal.name)

    println()

    val person = Person()
    person.name = "danang"
    println(person.name)

    println()

    val hero = Hero()
    hero.name = "supermen"
    println(hero.name)

    println()

    val animal2 = Animal4()
    animal2.name = "anjink"
    animal2.weight = 34.5
    animal2.age = 5

    println(animal2.name)
    println(animal2.weight)
    println(animal2.age)
}