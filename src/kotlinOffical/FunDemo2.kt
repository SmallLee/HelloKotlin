package kotlinOffical

import java.util.*

fun main(args: Array<String>) {
    var c:Int;
    //
    println(parseInt(null))
    println(getStrLength("ascd"))
    println(getStrLength(12))//null
}
/*
fun add3(a: Int, b: Int): Int {
    /*var a:Int
    var b;
    return a + b;*/
}*/
fun maxOf(a:Int,b:Int):Int{
    if (a > b) {
        var c = if (a > b) a else b;
        return a;
    } else {
        return b;
    }
}
fun parseInt(str:String?):Int?{
    return str?.toInt();
}

//if的As表达式
fun maxOf2(a:Int, b:Int):Int  = if (a > b) a else b;

fun getStrLength(obj:Any):Int?{
    if (obj is String){
        return obj.length;
    } else {
        return null;
    }
}