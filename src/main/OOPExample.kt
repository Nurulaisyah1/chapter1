package main

import java.lang.IllegalArgumentException


//encapsulation
private class AClass(){
    private fun run(){
        println("this is from class A")
    }
    fun runPublic(){
        println("this is from clas A from public")
    }
}
class BClass(){
    fun run(){
        AClass().runPublic()
        println("this is from class b ")
    }
}

//abstraction
//sama seperti sifat inheriten yaitu diturunkan juga(implemetasi)
//membuat suatu kerangka di depan dengan membuat interface
//melakukan suatu kontrak
//semua funcition wajib implementasi
// menambahkan "{}" itu sunnah

interface Ballon{
    //kakaek kelas
    //sifat yang mungkkin diturunkan atau kemungkinkan yang berhubungan dengan kelas yang dibuat
    fun blow() // ini namanya kontrak di ada body

    fun pop()

}

abstract  class HotAirBalloon (): Ballon{ // bapaknya
    //cara implementasinya :
    override fun blow() {
        println("Bloe the balloon")
    }

    override fun pop() {
        println("Danger!!!!!")
    }
    //yang hanya bisa dilakukan kelas hotairballoon
    //wajib di implement diturunn classnya
    abstract fun carryPessengers()
}
class RedHotAirBalloon(): HotAirBalloon() //kelas anaknya
{
    override fun carryPessengers() {
        //kita mengubah sifat bawaan bapaknya
        println("carrying 5 Passengers")
    }
}


//sifat 1
class RedBaloon(): Ballon{
    override fun blow() {
        println("menuip balon merah")
    }

    override fun pop() {
        println("balon merah meledak !!!")
    }

}

class BlueBaloon(): Ballon{
    override fun blow() {
        println("menuip balon biru...")
    }

    override fun pop() {
        println("balon merah biru!!!!")
    }

}

//inheritance using open class
open class Processor(val name : String){
    fun initProcessr(){
        println("Initialize.... $name")
    }
}

class AMDProcessor() : Processor( "Ryzen9")
class IntelProcessor() : Processor( "i3")


fun main(args:Array<String>){
/*    RedHotAirBalloon().let{
        //sifat kakek
        it.blow()
        it.pop()
        //sifat bapak
        it.carryPessengers()
    }*/

}

