package kotlinOffical

import java.util.Comparator

fun main(args:Array<String>){
    foo(3,"aa")
    foo(age = 2,name = "bb");
    val datas = listOf<Int>(1,2,3,4,5)
    filterList(datas)
    arrayOf(1,2,3).forEach(print)
    var strings = listOf<String>("a","ab","abcd")
    whenFun(Person(22,"12"))
//    var map = mapOf<Int,String>(Pair(1,"one"))
    var map = mapOf<Int,String>(1 to "one")
    for ((k,v) in map){
        println("key is $k and value is $v")
    }
    println("===========")
    for (m in map){
        println(m.key)
        println(m.value)
    }
}
//默认参数
fun foo(age:Int=2,name:String="qq",height:Int = 12){
    println("age is $age and name is $name ,height is $height")
}

fun filterList(list:List<Int>){
    list.filter { x -> x>3 }.forEach { println(it) }
}
var print = fun(i:Int){
    println(i)
}
fun whenFun(obj:Any?){
    when(obj){
        //判断对象的类型
        is Customer -> println("Customer");
        is Person -> println("Person")
    }
}


