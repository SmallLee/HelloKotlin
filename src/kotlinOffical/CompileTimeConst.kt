package kotlinOffical

const val ZIMU= "adbcdsfsdfds";//编译常量
 var age: Int = 0;
fun main(args: Array<String>) {
    var tc = TestCompile();
    println(tc.str)
}
class TestCompile{
    lateinit var str:String;

}