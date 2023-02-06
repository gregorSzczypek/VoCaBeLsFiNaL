class Nouns(
    val mothertongueTranslation: String, // save the word in mothertongue
    val learningLanguageTranslation: String, //saves the word in learning language
    val wordType: String = "Noun",
    timesCalled: Int = 0, // Count of how many times the word was called during training sessions
    timesRight: Int = 0, // Count of how many times th word was translated right
    slidingWindowList: MutableList<Int> = mutableListOf<Int>(0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,),
    confidence: Int = 0 // Confidence, tells how confident the user already is  with the word
): Word(timesCalled, timesRight, slidingWindowList, confidence) {

    override fun toString(): String {
        return this.mothertongueTranslation
    }
}