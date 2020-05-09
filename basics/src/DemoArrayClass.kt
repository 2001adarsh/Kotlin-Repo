val number = arrayOf(1,2,3,4)
val string = arrayOf<String>("Hello", "world", "mine")  //Initialised type
val mixed = arrayOf("1", "2", 3, 4.0) // This will work because we haven't given any type to this array

val constructorArray = Array(5, { i -> i*1} )
//lambda expression to initialise the array

val arraNull = arrayOfNulls<String>(3) //to initialise the null values

val numArray = intArrayOf(1,2,3)

fun main(){
    println(" ${string[2]} and ${string.get(2)} ")
    string.set(1,"Adarsh") //can set any value and replace current values
    println(string[1])

    //As keyword to typecast
    val any:Any = "String"
    val string = any as String //Typecasted to String

    //IS for checking type
    if(any is String){
        println(any.length)
    }

    //When used in place of switch. Better than switch
    when(any){
        "Adarsh" -> { }
        "String" -> { }
        else -> { }
    }
    //when can also return a value
    val x = when(any) {
        "Adarsh" -> 1
        "String" -> 2
        else -> -1
    }
    println(x)

}