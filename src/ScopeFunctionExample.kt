class ScopeFunctionExample {

    private val  creatorName : String? = null

    fun rub (){
        //let
        creatorName?.let{
            println("created by : $creatorName ")
        }?:run{
            println("this progeam is open source")
        }
    }

    companion object{
        @JvmStatic
        fun main(args:Array<String>){
            ScopeFunctionExample().run{}
        }
    }
}