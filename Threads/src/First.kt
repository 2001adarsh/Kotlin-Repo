import java.util.concurrent.CopyOnWriteArrayList

val numList = CopyOnWriteArrayList<Int>()
fun main(){
    for(i in 0 until 10000)
        numList.add(i)

    // Thread{ printlist("1")  }.start()
    // Thread{ printlist("2") }.start()
   // Thread{ printlist("3") }.start()
    val itr = numList.iterator()
    Thread{ deleteValue(3 ,itr)}.start()
    Thread{ deleteValue(5 ,itr)}.start()
    Thread{ deleteValue(7 ,itr)}.start()


    for(i in numList){
        println(i)
    }
}

fun printlist(id:String):Unit{
    for(i in 0 until numList.size step 100)
    {
        if(id.equals("2") && i==500)
            Thread.sleep(100)
        println("$id -> $i")
    }
}

//Concurrent Modification Exception
// Iterators
fun deleteValue(n:Int, itr:MutableIterator<Int>){
    while (itr.hasNext()){
        val i = itr.next()
        if(i%n==0)
            itr.remove()
    }
}