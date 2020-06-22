import javafx.application.Application.launch
import kotlinx.coroutines.*
import kotlin.coroutines.*

val num = ArrayList<Int>()
fun main(){
    for(i in 0..1000){
        num.add(i)
    }
    runBlocking {  //main with end only after threads end
        GlobalScope.launch(Dispatchers.Default) {
            launch{ PrintList(id = "1") }
            launch{ PrintList(id = "2") }
            launch{ PrintList(id = "3") }
        }
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