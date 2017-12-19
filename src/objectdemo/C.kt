package objectdemo

fun main(args: Array<String>) {
    val c = C();
    c.f();
}

class C: A(),B{
    override fun f(){
        super<A>.f();
        super<B>.f();
    }
}