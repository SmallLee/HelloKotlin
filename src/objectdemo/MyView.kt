package objectdemo

fun main(args: Array<String>) {
    var myview = MyView(2);
    println(myview.str)//abcd
    myview.str  = "ddd";
    println(myview.x)//2
    var bar = myview.Bar();
//    myview.setVisibility = "add";
}

class MyView(override var x:Int) : View() {
    init {
        println("=======MyView init...")
    }
    override var z: Int  = 1;
//    override val y: Int  = 1; 不能重写父类的var属性
    var str: String
    get() = "abcd"
    set(value) {
        print(value)
    }
    override fun measure(){
        super.draw()
    }
    //报错，layout在父类中是final的，不能被重写
//    override fun layout(){
//
//    }
    inner class Bar{
        init {
            super@MyView.measure();
        }
    }
    //此属性不能被修改
    var setVisibility: String = "abc"
    private set

}