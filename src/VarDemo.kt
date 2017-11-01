fun main(args : Array<String>) {
    var name = "张三";//自动类型推断
    name = "adf"
    //类型推断
//    name = 9;Error:(4, 12) Kotlin: The integer literal does not conform to the expected type String
    print(name)
    //显示指定数据类型，可以不赋初始值
//    var a//需要给初始值，否则报错
    var age : Int
    val number = "NO.123";
}