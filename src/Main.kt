fun main(){
    val numletter = "Mississippi".count({letter ->
        letter == 's'
    })
    println(numletter)
}