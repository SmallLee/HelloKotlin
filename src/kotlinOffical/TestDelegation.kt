package kotlinOffical

interface Base{
    fun print();
}
class BaseImpl(val x:Int) :Base{
    override fun print() {
        print("abc")
    }
}
//Derived实现Base接口，并且把Base接口的方法全部委托给b
class Derived(b:Base):Base by b;

fun main(args: Array<String>) {
    val baseImpl = BaseImpl(40);
    Derived(baseImpl).print();
}