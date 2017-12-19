package objectdemo

open class View{
    open val x : Int get() {return 2}
    open var y: Int = 2;
    open var z: Int = 2;
    open fun measure(){
        print("view measure")
    }
    final fun layout(){

    }
    fun draw(){
        println("draw")
    }
}