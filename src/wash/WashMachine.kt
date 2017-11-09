package wash

class WashMachine(var module:String,var size: Int) {
    var isDoorOpen = true;
    fun open(){
        println(module+"洗衣机开门") 
        isDoorOpen = true;
    }

    fun start(){
        if (isDoorOpen) return;
        println("开始洗衣")
    }
    fun close(){
        println(module+"洗衣机关门")
        isDoorOpen = false;

    }
    fun selectMode(mode:Int){
        when(mode){
            0 -> "初始模式";
            1 -> "清洗";
            2 -> "重洗"
            else -> "别乱选";
        }
    }
}