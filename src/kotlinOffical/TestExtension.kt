package kotlinOffical


fun MyClass.go(){
    println("go-----------")
}

fun main(args: Array<String>) {
//    var list = mutableListOf<Int>(1,2,3,4)
//    list.swap(3,4)
    var data = null;
    println(data.toString())
    //直接调用Companion的方法，类似于给MyClass类定义了静态变量
    MyClass.Companion.create();
    var mc = MyClass();
    mc.go();
    var d = D();
    var c = C();
    c.caller(d);
}

fun <T>  MutableList<T>.swap(a:Int,b:Int){
    val temp = this[a]
    this[b] = this[a];
    this[a] = temp;
}

fun Any?.toString():String{
    if (this == null) return "null---";
    else return toString();
}


class MyClass{
    companion object{
        fun create(){
            println("-----------")
        }
    }
}
class D{
    fun bar(){
        println("d-------bar")
    }
}
class C{
    fun bar(){
        println("c---------bar")
    }
    fun D.one(){
        bar();
        this@C.bar();//调用c的bar方法，否则都是调用d的
    }
    //给外部用于调用D
    fun caller(d: D) {
        d.one()   // call the extension function
    }
}