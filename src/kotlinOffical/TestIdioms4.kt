package kotlinOffical

import java.io.File

fun main(args:Array<String>){
   val d1 = DemoTon(12);
    val d2 = DemoTon(13);
    println(d1==d2)//false
    val s1 = Singleton;
    val s2 = Singleton;
    println(s1 == s2)//true
    notNull();
    letNull()
}

class DemoTon(var age:Int){
    var name:String = "abcd";
}
object Singleton{
    var name:String = "abcd"
}
fun notNull(){
    var lists = listOf<String>("apple","banana");
    println(lists.size)//2
    var data = File("aa").listFiles();
    println(data?.size)//null
    println(data?.size ?: "empty")//null
}

fun letNull():Boolean{
    var value = "abcd";
    value.let {
        println(it)
    }
    var lists = listOf<String>("apple","banana");
    lists.forEach {
        println(it)
        return true;
    }
    return false;
}
