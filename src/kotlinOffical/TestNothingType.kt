package kotlinOffical

fun main(args:Array<String>){
    var nt = Nothing();
    var name = nt.name?:throw IllegalArgumentException("null name");
    println(name)
    var name2 = fail("dsf");
    println(name2)
}

class Nothing{
    var name: String? = null;
}
//Nothing可以用来标记没有返回值的方法
fun fail(message: String): Nothing {
    throw IllegalArgumentException("异常");
}
