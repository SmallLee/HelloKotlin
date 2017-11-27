package kotlinOffical

import java.io.File

fun main(args:Array<String>){
    val arrays = arrayOfMinusOnes(10);
    arrays.forEach{ println(it)}

    println(membersOf<StringBuffer>().joinToString("\n"))
}
fun arrayOfMinusOnes(size:Int):IntArray{

    return IntArray(size).apply { fill(-1) }
}
//获取所有的方法和属性
inline fun <reified T> membersOf() = T::class.members