package tech.salvatore.livro_android_kotlin_paulo_salvatore.model.domain

data class Creature(
    val number: Long,
    val name: String,

    val imageUrl: String,

    val type1: CreatureType? = null,
    val type2: CreatureType? = null,

    val hungry: Int = 1,
    val strength: Int = 0,
    val humor: Int = 0,

    val lastFeed: Int = 0,
    val lastTrain: Int = 0,
    val lastPlay: Int = 0,

    val evolveTo: Creature? = null,
    val users: List<User> = emptyList()
) {
    val canFeed = hungry > 0
    val canTrain = strength < 5
    val canPlay = humor < 5
}
