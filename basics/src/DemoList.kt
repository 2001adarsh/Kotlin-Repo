val listNames = listOf<String>("Hello", "world") //cannot add values. It is immutable.

val mutableList = mutableListOf<String>("Hello", "wrofasdf", "fdsa")
val array = arrayListOf<String>("Adarsh", "Singh", "18BCS1168") //same as mutableList

//Maps
val map = mapOf<Int, String>(1 to "Adarsh", 2 to "Singh", 3 to "18CS1168") //Immutable
//similarly just that hashmap is mutable
val hashMap = hashMapOf<Int, String>(1 to "Adarsh", 2 to "Singh", 3 to "18CS1168")


fun main(){
   // listNames.add("asdfi")
    mutableList.add("Adarsh")
    mutableList.add("Singh")

    //map
    println(map[3])
    //hashmap
    hashMap[4] = "Adarsh Again"
    println(hashMap[4])

    //For each loop
    println("For Each Loop")
    mutableList.forEach {
        println(it)
    }

    println("HashMap")
    hashMap.forEach { t, u ->
        println("$t -> $u")
    }

    //Traditional For loop
    for(x in 0..10) {
        //here 10 is inclusive
    }
    for(x in 0 until 10){
        //here 10 is exclusive
        //for(x in 0 until step 2) -> for increment by 2
        // for (x in 10 downTo 0 step 2) -> decrementing by 2

    }

}