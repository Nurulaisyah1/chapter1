import model.ComputerSpech

class App(var creatorName: String?) { //Default value Constructor

    private val computerData = listOf(
        ComputerSpech(
            processorName = "Intel 19",
            processorTotalCore = 8,
            isHaveIGPU = true,
            totalRamInGb = 32,
            EGPUName = "RTX 4060"
        ),
        // computer 1
        ComputerSpech(
            processorName = "Intel i7",
            processorTotalCore = 8,
            isHaveIGPU = false,
            totalRamInGb = 16,
            EGPUName = "RTX 3060"
        )// computer 2
    )

    fun run() {
        printHeader()
    }

    private fun printHeader() {
        println("============================")
     //let
        creatorName?.let{
            println("created by : $creatorName ")
        }?:run{
             println("this progeam is open source")
        }
        println("============================")
        println("Order PC App")
        println("============================")
        computerData.forEachIndexed { index, data ->
            println("${index + 1}.${data.processorName} ${data.EGPUName}")
        } // Lambda function
        println("=============")
        println("Masukan pilhan anda: ")
        try {
            val userPick = readln().toInt()
            print("Pilihan anda adalah $userPick")
        } catch (e: NumberFormatException) {
            println("Menu Anda Salah")
            printHeader()//recursive
        }
    }


}

