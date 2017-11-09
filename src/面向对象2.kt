fun main(args: Array<String>) {
    var girl = Girl("甜美","160");
    girl.smile();
    println(girl.cry())
}
class Girl(var voice:String,var height:String){
    var age:Int = 20;
    fun smile(){
        println("身高是${height}")
    }
    fun cry():Int {
        return age;
    }
}
class Person{
    private var age:Int = 0;
    var name:String = "";
    fun Person(age:Int,name:String){
        this.age = age;
        this.name = name;
    }
    fun getAge():Int{
        return age;
    }
    var isEmpty:Boolean
    get() = false;
    set(value) {
        //赋值的语句
    }
}