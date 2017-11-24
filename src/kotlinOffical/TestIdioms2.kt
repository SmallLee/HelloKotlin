package kotlinOffical

import org.jetbrains.annotations.Mutable

fun main(args:Array<String>){
    //只读list
    var lists = listOf<String>("a","b","c");
    //读写list
    val list2:MutableList<String> = ArrayList<String>();
    list2.add("hello");
    list2.add("world")
    for (s in list2){
        println(s)
    }
    //索引
    for (i in list2.indices){
        println(i)
    }
    println("=====================")
    //只读的map
    var maps = emptyMap<Int,String>();
//    var maps2:MutableMap<Int,String> = HashMap<Int, String>();
    var maps2 = HashMap<Int, String>();
    //读写的map
    var maps3:MutableMap<String,String> = mutableMapOf();
    maps2.put(1,"one");
    maps2.put(2,"two");
    for (m in maps2){
        println(m.value)
    }
    maps3.put("4","four");
    //访问map的元素
    println(maps3["4"])//four
    maps3["4"] = "five";
    println(maps3["4"])//five
}

