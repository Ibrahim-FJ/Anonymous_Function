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

    val greetingFunction_1 : (String) -> String = { playerName ->
        val currentYear = 2021
        "Welcome to simVillage,$playerName! (copyright $currentYear)"

    }
    println(greetingFunction_1("Ibrahim"))

    //------------------------------------------------------------//
}