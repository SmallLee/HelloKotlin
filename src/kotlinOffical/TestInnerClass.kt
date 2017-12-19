package kotlinOffical


fun main(args: Array<String>) {
    callAdapter(object :MouseAdapter(){
        override fun move() {
            println("move-----------")
        }

        override fun click() {
            println("click-------------")
        }

    });
}
abstract class MouseAdapter{
    abstract fun move();
    abstract fun click();
}

fun callAdapter(adapter: MouseAdapter){
    adapter.click();
    adapter.move();
}