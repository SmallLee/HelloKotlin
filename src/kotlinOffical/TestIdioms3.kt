package kotlinOffical

fun main(args:Array<String>){
    println(str)
    println(str)
    println("abcd".toCamelCase())//Abcd
}

val str:String by lazy{
    println("初始值")
    "hello world"
}
//扩展函数
 fun Int.add(a:Int):Int{
    return this + a;
}
//扩展函数
fun String.toCamelCase():String{
    return this.substring(0,1).toUpperCase() + this.substring(1);
}