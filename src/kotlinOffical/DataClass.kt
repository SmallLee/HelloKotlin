package kotlinOffical

data class DataClass(var name:String="",var age:Int){
    var address:String = "";

    override fun equals(other: Any?): Boolean {
        return super.equals(other)
    }

    override fun hashCode(): Int {
        return super.hashCode()
    }

    override fun toString(): String {
        return super.toString()
    }
}