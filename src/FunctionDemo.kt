import com.sun.org.apache.xpath.internal.operations.Bool

fun main(args: Array<String>) {
    println(  plus(2,3));
    println(sayHello("tom"))
    println(checkAge(202))
}
fun plus(a:Int,b:Int): Int {
    return a + b;
}

fun sayHello(name:String):String{
    return "Hello"+name;
}

fun checkAge(age:Int):Boolean{
    return age > 20;
}
fun saveLog(logLevel:Int){

}