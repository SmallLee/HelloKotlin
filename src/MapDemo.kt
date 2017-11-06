import java.util.*

fun main(args: Array<String>) {
    var map1 = TreeMap<Int,String>();
    map1.put(1,"A");
    map1.put(2,"B");
    map1.put(3,"C");
    for (n in map1){
        println(n.key)
        println(n.value)
    }
    var map2 = mapOf<Int,String>(1 to "A",2 to "B");
    for(m in map2){
        println(m.key);
    }
}