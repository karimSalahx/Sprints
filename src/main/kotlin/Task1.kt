fun main(args: Array<String>) {
    val n = readLine()!!.toInt()

    val list = mutableListOf<String>()
    var counter = 0
    while(counter < n){
        val name = readLine()!!
        list.add(name)
       counter = counter.inc()
    }

    for (name in list){
         if(name.contains("b" , ignoreCase = true) || name.contains("m" , ignoreCase = true)) {
             println(name.uppercase())
         }
    }
}