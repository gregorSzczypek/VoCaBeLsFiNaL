
val allIndexBoxes = mutableListOf<IndexBox>()
val red = "\u001b[31m"
val green = "\u001B[32m"
val purple = "\u001B[35m"
val yellowBG = "\u001B[43m"
val black = "\u001B[30m"
val reset = "\u001b[0m"
val blueBG = "\u001B[44m"


fun main() {
    println(yellowBG + black + "Welcome to VoCaBeLs!" + reset)
    println()
    Thread.sleep(1200)
    openMenu()
}