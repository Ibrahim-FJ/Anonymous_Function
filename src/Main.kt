fun main(){
    val numletter = "Mississippi".count({letter ->
        letter == 's'
    })
    println(numletter)

    //------------------------------------------------------------//

    println({val currentYear = 2021
    "Welcome to simVillage, Mayor! (copyright $currentYear)"}())

    //---------------------------------------------------------------//

    val greetingFunction : () -> String = {
        val currentYear = 2021
        "Welcome to simVillage, Mayor! (copyright $currentYear)"
    }
    println(greetingFunction())

    //-------------------------------------------------------------//
}