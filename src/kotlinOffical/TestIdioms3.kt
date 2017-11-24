package kotlinOffical

fun main(args:Array<String>){
    println(str)
    println(str)
}

val str:String by lazy{
    println("初始值")
    "hello world"
}
//扩展函数
 fun Int.add(a:Int):Int{
    return this + a;
}