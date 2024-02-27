package model

data class ComputerSpech(
    val processorName : String,
    val processorTotalCore : Int,
    val isHaveIGPU : Boolean,
    val totalRamInGb : Int,
    val EGPUName : String

)

