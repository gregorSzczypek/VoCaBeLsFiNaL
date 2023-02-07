fun showAllWordboxes() { // TODO format statistics output

    for (i in allIndexBoxes){
        println(yellowBG + black + i.motherTongue.uppercase() +reset)
        println(purple + "ADJECTIVES" + reset)
        for (j in i.adjectivesList){
            println("${j.mothertongueTranslation} - ${j.confidence}%")
        }
        println(purple + "VERBS" + reset)
        for (k in i.verbsList){
            println("${k.mothertongueTranslation} - ${k.confidence}%")
        }
        println(purple + "NOUNS" + reset)
        for (l in i.nounsList){
            println("${l.mothertongueTranslation} - ${l.confidence}%")
        }
        println(blueBG + "                                                              " + reset)
    }
}