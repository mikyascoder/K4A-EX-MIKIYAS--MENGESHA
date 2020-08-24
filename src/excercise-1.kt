fun main(){
    for (i in 1 .. 15)
        println(i)
    println("")
    goingDown()
    println("")
    ranged(5,-2)

}

fun goingDown (){
    for (i in 10 downTo -10 )
       if(i % 2 == 0)
        println(i)
}

fun ranged (starting:Int,ending:Int) {
   if (starting< ending)
       for (i in starting..ending)
    println(i)
    else
    for (i in starting downTo ending)
        println(i)
}