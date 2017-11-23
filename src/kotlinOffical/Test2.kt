package kotlinOffical

import java.awt.Rectangle

fun main(args: Array<String>) {
    print(method)//(kotlin.Int, kotlin.Int) -> kotlin.Int
    println(method(2,3))//5
    println(1 method3 2)
    println(1.method3(4))
}
//第一种方式
fun add(x:Int,y:Int):Int{
    return x + y;
}
//第二种方式(当函数只有单个表达式时，可以省略花括号，用等号连接函数体，如果返回值类型可以由编译器
// 推断出来，也可以省略返回值)
fun add4(x:Int,y:Int) = x+y;
//第三种方式
var method = {x:Int,y:Int -> x +y}
//第四种方式
var method2:(Int,Int) -> Int= {x,y-> x +y}

infix fun Int.method3(x:Int):Int{
    return x+this;
}




