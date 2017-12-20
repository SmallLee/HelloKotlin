package kotlinOffical

val c: AA = object : AA(3){
    override val y:Int = 4;
}
fun main(args: Array<String>) {
   println(c.y);
    foo()
    //单例的方法可以直接使用类名调用
    DataProviderManager.prodive();
    val dd = MyObjectClass.DD.create();
    //object的DD可以省略
    val mc = MyObjectClass.create();
}
open class AA(x: Int){
    open val y:Int = x;
}
interface BB{

}
fun foo(){
    val abc= object {
        var x = 3;
        var z = 34;
    }
    println(abc.x+ abc.z)
}

class Object{
    private fun a() =object {
        var x = "X";
    }
    fun b() = object {
        var y = "Y";
    }
    fun AB(){
        var x =a().x;
//        var y  = b().y;//y不能被访问到
    }
}

object DataProviderManager{
    fun prodive(){
        println("provide data")
    }
}

class MyObjectClass{
    companion object DD{
        fun create(): MyObjectClass= MyObjectClass();
    }
}
