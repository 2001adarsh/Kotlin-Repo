/*
    Types of functions:
    1. Positional Arguments
    2. Default Arguments
    3. Named Arguments
 */

fun main(){
    println(square(19))
    positional("Adarsh", 23, true)
    default("Adarsh", 68)
    named(id = 12, name = "Adarsh", flag = false)

    countAndPrintArgs(1,2,3,4,5)
}

fun square(num:Int):Int{
    return num*num
}
    //or
fun cube(num:Int):Int = if (num >=0 ) num*num*num else -1   //can contain single line lambdas.

fun positional(name:String, id:Int, flag:Boolean) = println("$name, $id, $flag")

fun default(name:String, id:Int, flag:Boolean = false) = println("$name, $id, $flag")

fun named(name:String, id:Int, flag:Boolean = false) = println("$name, $id, $flag")

//Variable Arguments functions:
fun countAndPrintArgs( vararg num:Int){
    println(num.size)
    for (a in num)
        print(a)
}