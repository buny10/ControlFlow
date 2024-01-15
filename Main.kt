//TIP Press <shortcut raw="SHIFT"/> twice to open the Search Everywhere dialog and type <b>show whitespaces</b>,
// then press <shortcut raw="ENTER"/>. You can now see whitespace characters in your code.
fun main() {
    val alarm = 8
    when (alarm) {
        12 -> println("the time  only is this $alarm")
        9 -> println("the time is $alarm")
        0 -> println("the time is $alarm")
        !in 1 ..10 ->println("the time is in the range ")
        else -> println("the time $alarm ")
    }

}