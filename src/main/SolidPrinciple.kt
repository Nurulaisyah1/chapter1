package pratice

import main.HotAirBalloon
import main.RedHotAirBalloon
import kotlin.concurrent.thread

class Calculator(){
    //global
    private val something :String = "Hello"

    fun pls (a:Int, b:Int){
        val result = a + b
        println("Result is : $result")
    }
}
 class CalculatorRight(){
     fun plus(a: Int, b:Int) : Int{
         return a+b
     }
 }
fun printResult(result:Number){
    println("thr result is $result")
}

class Rocpapperscissor(){
    fun suit() {
        println(
            """
            ======================
            GUNTING BATU KERTAS
            ======================
            option
            0.Gunting
            1.Batu
            2.Kertas
        """.trimIndent()
        )
    }



fun main(args : Array<String>){
   Rocpapperscissor().suit()

    }
}



class IronManSuit() {
    open fun blast(){
        println("Blast using laser power ")
    }
    fun activateNantoTech(){
        println("Activate nano tech")
    }
}

/*class WarMechineSuit(): IronManSuit(){
    override fun blast() {
       // super.blast()
        println("Blast for war mechine suit ")
        thread.sleep(2000)
        println("blas from war mechine suit")
        println("sleep for 3 second")
        thread.sleep(2000)
        println("duar")
    }
}*/

//
//
class Cappadocia(){
    private  lateinit var ballon : HotAirBalloon
    fun run (){
        ballon = //HotAirBalloon()
        ballon.apply {
            carryPessengers()
            blow()
            pop()
        }

    }
}

fun main(args:Array<String>){

}





//interface sgretation / memecah / membagi ke kelompknya masing2
interface Animal {
    fun eat()
    fun hunt()
    fun walking()

    fun sleep()
    fun jump()
    fun breath()
    fun  sound()
    fun reporduction()
}
interface  Aves : Animal{
    fun fly()
    fun twit()

}
interface  Fish : Animal{
    fun swim()

}

class Bird() : Aves {
    override fun eat() {
        TODO("Not yet implemented")
    }

    override fun hunt() {
        TODO("Not yet implemented")
    }

    override fun walking() {
        TODO("Not yet implemented")
    }

    override fun fly() {
        TODO("Not yet implemented")
    }

    override fun twit() {
        TODO("Not yet implemented")
    }

    override fun sleep() {
        TODO("Not yet implemented")
    }

    override fun jump() {
        TODO("Not yet implemented")
    }

    override fun breath() {
        TODO("Not yet implemented")
    }

    override fun sound() {
        TODO("Not yet implemented")
    }

    override fun reporduction() {
        TODO("Not yet implemented")
    }

}

class  CAtFish() : Fish{
    override fun swim() {
        TODO("Not yet implemented")
    }

    override fun eat() {
        TODO("Not yet implemented")
    }

    override fun hunt() {
        TODO("Not yet implemented")
    }

    override fun walking() {
        TODO("Not yet implemented")
    }

    override fun sleep() {
        TODO("Not yet implemented")
    }

    override fun jump() {
        TODO("Not yet implemented")
    }

    override fun breath() {
        TODO("Not yet implemented")
    }

    override fun sound() {
        TODO("Not yet implemented")
    }

    override fun reporduction() {
        TODO("Not yet implemented")
    }

}


//rependency Inversion
class FireBaseAnalythics (){     // 3 kelas ini adalah library
    fun log (event: String){
        println("logging to firebase: event name : $event")
        println("logging success")
    }
}
class NewRelixAnalythics (){
    fun log (event: String){
        println("logging to NewRelix: event name : $event")
        println("logging success")
    }
}

class MoEngageAnalythics (){
    fun log (event: String){
        println("logging to MoEngage: event name : $event")
        println("logging success")
    }
}


class AppAnalythics{
    fun logEvent(event: String)
}
// egnostic
class  AppAnalythics(): Analythics{
    private  var fireBaseAnalythics = fireBaseAnalythics()
}
//page

class SplashScreen(private val analythics Analythics){
    fun openPage("Open Page"){
    analythics.logEvent("SplashScreen")
}
}
clas HomePage(){
    println("open page homepage")
    analythics.logEvent("homepage")
}




class App(){

    private  val analythics = FireBaseAnalythics()

    private fun openPageLogin(){
        println("open page login")
        analythics.log("login")
    }
    private fun openPageHome(){
        println("open page Home")
        analythics.log("login")
    }
    fun run (){
        openPageLogin()
        openPageHome()
    }

    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            App(MoEngageAnalythics()).run()
        }
    }

}