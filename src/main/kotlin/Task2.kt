fun main(args: Array<String>) {

    val teslaObj = Tesla()
    val bmwObj = BMW()
    teslaObj.getFuelType()
    bmwObj.getFuelType()
}

interface Car {
    class Car(var model: String , var color: String , var speed: Int)
    fun getFuelType();
}

 class BMW: Car {
    override fun getFuelType(){
        println("Petrol")
    }
}

class Tesla: Car {
    override fun getFuelType(){
        println("Electric")
    }
}