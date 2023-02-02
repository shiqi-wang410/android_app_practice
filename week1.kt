/**
 * You can edit, run, and share this code.
 * play.kotlinlang.org
 */
fun printStars(num_lines:Int, num_stars:Int):MutableList<String>{
    val chars: MutableList<String> = ArrayList()
    var cnt = 0
    while (cnt < num_stars){
        chars.add("*")
        cnt++
    }
    while(cnt < num_lines){
        chars.add(" ")
        cnt++
    }
    return chars
    
}
fun main() {
    var num_lines = 5
    for (i in 1..num_lines){
        val ret = printStars(num_lines,i)
        println(ret)
    }
}
