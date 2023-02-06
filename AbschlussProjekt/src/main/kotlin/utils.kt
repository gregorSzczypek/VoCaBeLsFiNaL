import kotlin.concurrent.thread
import kotlin.system.exitProcess

// saveReadIn gets a String with a input prompt and a list of Strings with valid input-options
fun saveReadIn(question: String, allowedWords: List<String>): String { // TODO implement warning message
    while (true) {
        var input = ""
        println(question)
        println("Or type help to see available options or exit to escape")
        input = readln().lowercase()
        if (allowedWords.contains(input)) {
            //println("Input accepted")
            println()
            return input
        } else if (input == "help") {
            println(allowedWords + "exit")
        } else if (input == "exit") {
            println("Going back home...")
            Thread.sleep(1200)
            openMenu()
        } else {
            println(red + "Invalid input, try again..." + reset)
        }
    }
}

// readlnNotEmpty checks if the user input is not empty and returns the "not empty" user input
fun readlnNotEmpty(question: String, warning: String): String {
    var userInput = ""
    while (true) {
        println(question)
        userInput = readln().lowercase()
        if (userInput == "") {
            println(warning)
            continue
        } else return userInput
    }
}

fun stringListOfAllBoxes(): List<String>{
    var listObjectToString: MutableList<String> = mutableListOf()

    for (i in allIndexBoxes){
        listObjectToString.add(i.indexBoxName)
    }
    return listObjectToString
}