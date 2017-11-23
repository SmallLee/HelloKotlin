package kotlinOffical

class Customer constructor(var name: String, age: Int) {
    var sex:Int = 0
    get() {return if (field > 0) 2 else 3}
    set(value){if (value > 2) field = 2 else field = 1}

    init {
        name = "zhangsan";
        print(name)
    }
    constructor(name: String,age: Int,address:String):this(name,age){

    }

}