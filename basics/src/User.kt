import java.time.temporal.TemporalAmount

fun main(){
    val user = User(234, "Adarsh", 25)
    val user2 = User(24, "adars")
    println(user.Account)
    println(user2.Amount)
    val user1 = User1(234, "adarsh", 25F)
    println("${user1.Account}, ${user1.name} and ${user1.Amount}")
}

class User(var Account:Int, var name:String, var Amount:Int) { //Primary Constructor
    constructor(amount: Int, name: String){  //Secondary Constructor
        this.Account = amount
        this.name = name
        this.Amount = 0
    }
}

class User1(Account:Int, name:String, Amount: Float){ //Still a primary constructor
    var Account:Int
    var name:String
    var Amount:Float
    init {  // used to initialise the constructor, and using this we can make changes to the values, while in the method above we couldn't
        this.Account = Account
        this.name = name.capitalize()
        this.Amount = Amount + 123100
    }
}