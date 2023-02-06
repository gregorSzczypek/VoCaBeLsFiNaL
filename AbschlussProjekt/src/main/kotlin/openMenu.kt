import java.io.File
import kotlin.system.exitProcess

fun openMenu() {
    var choiceOfAction = ""

    while (true) {
        println("What would you like to do?")
        println("1 - training")
        println("2 - create new index box")
        println("3 - create new word")
        println("4 - delete word")
        println("5 - show saved wordboxes")
        println("6 - delete wordbox")
        println("exit")
        println()
        choiceOfAction = saveReadIn("Please enter your choice:", listOf("1", "2", "3", "4", "5", "6", "exit"))

        when (choiceOfAction) {
            "1" -> {
                if (allIndexBoxes.isNotEmpty()) {
                    training()
                } else {
                    println(red + "No wordboxes saved." + reset)
                    println()
                }
            }

            "2" -> {
                createNewIndexBox()
            }

            "3" -> {
                if (allIndexBoxes.isNotEmpty()) {
                    createNewWord()
                } else {
                    println(red + "No wordboxes saved, please create wordbox." + reset)
                    println()
                }
            }

            "4" -> {
                if (allIndexBoxes.isNotEmpty()) {
                    deleteWord()
                } else {
                    println(red + "No wordboxes saved." + reset)
                    println()
                }
            }

            "5" -> {
                if (allIndexBoxes.isNotEmpty()) {
                    showAllWordboxes()
                } else {
                    println(red + "No wordboxes saved." + reset)
                    println()
                }
            }

            "6" -> {
                if (allIndexBoxes.isNotEmpty()) {
                    deleteIndexBox()
                } else {
                    println(red + "No wordboxes saved!" + reset)
                    println()
                }
            }

            "exit" -> {
                //Data.writeBytes(allIndexBoxes.toByteArray())
                exitProcess(0)
            }
        }
    }
}
