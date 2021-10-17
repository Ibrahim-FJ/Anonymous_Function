import kotlin.random.Random
import kotlin.random.nextInt

fun main() {
    val numletter = "Mississippi".count({ letter ->
        letter == 's'
    })
    println(numletter)

    //------------------------------------------------------------//

    println({
        val currentYear = 2021
        "Welcome to simVillage, Mayor! (copyright $currentYear)"
    }())

    //---------------------------------------------------------------//

    val greetingFunction: () -> String = {
        val currentYear = 2021
        "Welcome to simVillage, Mayor! (copyright $currentYear)"
    }
    println(greetingFunction())

    //-------------------------------------------------------------//

    val greetingFunction_1: (String) -> String = { playerName ->
        val currentYear = 2021
        "Welcome to simVillage,$playerName! (copyright $currentYear)"

    }
    println(greetingFunction_1("Ibrahim"))

    //------------------------------------------------------------//
    val greetingFunction_2: (String) -> String = {
        val currentYear = 2021
        "Welcome to simVillage,$it! (copyright $currentYear)"

    }

    println(greetingFunction_2("Ibrahim"))


    //------------------------------------------------------//

    val greetingFunction_3: (String, Int) -> String = { playerName, numBuilding ->
        val currentYear = 2021
        println("Adding $numBuilding hours")
        "Welcome to SimVillage, $playerName! (copyright $currentYear)"

    }
    println(greetingFunction_3("Ibrahim", 3))

    //-------------------------------------------------------------//

    val greetingFunction_4 = { playerName: String, numBuilding: Int ->

        val currentYear = 2021
        println("Adding $numBuilding houses")
        "Welcome to SimVillage, $playerName! (copyright $currentYear)"
    }
    println(greetingFunction_4("Ibrahim", 6))

    //--------------------------------------------------------//

    val greetingFunction_5 = { playerName: String, numBuilding: Int ->
        val currentYear = 2021
        println("Adding $numBuilding houses")
        "Welcome to SimVillage, $playerName! (copyright $currentYear)"

    }

    runSimulation("Ibrahim from runSimulation", greetingFunction_5)

    //----------------------------------------------------------------//


}

fun runSimulation(playerName: String, greetingFunction_5: (String, Int) -> String) {
    val numBuilding = Random.nextInt(1..3)
    println(greetingFunction_5(playerName, numBuilding))
}