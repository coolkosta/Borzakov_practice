package kata6Kyu

// https://www.codewars.com/kata/57f625992f4d53c24200070e/kotlin
fun bingo(ticket: Array<Pair<String, Int>>, win: Int): String {
    var miniWins = 0
    for (subArray in ticket){
        val (string, code) = subArray
        if (string.any { it.code == code }){
            miniWins++
        }
    }

    return if (miniWins>=win){
        "Winner!"
    } else{
        "Loser!"
    }
}