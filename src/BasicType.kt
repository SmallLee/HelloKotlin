fun main(args : Array<String>) {
    val aByte : Byte = Byte.MAX_VALUE;
    val bByte : Byte = Byte.MIN_VALUE;
    println(aByte);
    println(bByte);//-128
    val aLong : Long = Long.MAX_VALUE;
    val bLong : Long = Long.MIN_VALUE;
    println(aLong)
    println(bLong)
    //可以用二进制方式给int赋值
    val aInt:Int = 0b0011;
    val bInt:Int = 0x123;//256+16+1 =291
    println(bInt)
}