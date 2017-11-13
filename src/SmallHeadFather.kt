class SmallHeadFather : IWashBowl by BigHeadSon(){
    override fun washing(){
        println("我是小头爸爸，我再洗碗，每次赚10块钱")
        BigHeadSon().washing();
    }
}