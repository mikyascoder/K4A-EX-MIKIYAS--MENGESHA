fun main(){
    greet()
    println(squared(5))
    log("Connected","Database")
    log("Connected")
}

fun greet () {
    println( "Mikiyas Mengesha")
}
fun squared(num: Int): Int {
    return num * num
}

fun log (message:String, source:String="Unknowwn"){
    println("$source: $message.")
}