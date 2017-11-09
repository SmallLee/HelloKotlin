package wash

import org.omg.PortableServer.POAPackage.WrongAdapterHelper

fun main(args:Array<String>){
    var washMachine = WashMachine("格里", 5);
    washMachine.open();
    washMachine.close()
    washMachine.start()
}