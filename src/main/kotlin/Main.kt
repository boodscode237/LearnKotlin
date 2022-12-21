fun main(args: Array<String>) {
    println("Hello World!")

    // Try adding program arguments via Run/Debug configuration.
    // Learn more about running applications: https://www.jetbrains.com/help/idea/running-applications.html.
    println("Program arguments: ${args.joinToString()}")
    println(something(6))
}
fun add(): Int {
    return 1
}

fun hello(): String {
    return ""
}

fun something(temperature: Int): Boolean {
    val isHot: Boolean = temperature > 40
    return isHot
}