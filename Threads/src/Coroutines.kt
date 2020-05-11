import javafx.application.Application.launch
import kotlin.coroutines.*

val num = ArrayList<Int>()
fun main(){
    for(i in 0..1000){
        num.add(i)
    }
    runBlocking {  //main with end only after threads end
        launch{ PrintList("1") }
        launch{ PrintList("2") }
        launch{ PrintList("3") }
    }
}

suspend fun PrintList(id:String){
    for(i in 0..1000){
        if(i%100 == 0){
                withContext(Dispatchers.IO){
                    print("$id, $i")
            }
        }
    }
}