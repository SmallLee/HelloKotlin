fun main(args:Array<String>){
    var nums = 1..100;
    var result = 0;
    for(n in nums){
        result += n;
    }
    print(result)
    var nums2 = 1 until 10;
    for (n in nums2) {
        print(n)
    }
    //反转
    var num3 = nums2.reversed();
    for (n in num3){
        println(n)
    }
    //总数量
    print(num3.count())//9
}